<template>
    <vx-card title="لیست گدام ها" code-toggler>
        <br><br>

        <vs-table :data="stock">

            <template slot="thead">
                <vs-th>نام گدام</vs-th>
                <vs-th>آدرس گدام</vs-th>
            </template>

            <template slot-scope="{data}">
                <vs-tr :key="indextr" v-for="(tr, indextr) in stock">
                    <vs-td :data="data[indextr].stockName">
                        {{data[indextr].stockName}}
                    </vs-td>
                    <vs-td :data="data[indextr].stockAddress">
                        {{data[indextr].stockAddress}}
                    </vs-td>
                </vs-tr>
            </template>
        </vs-table>
    </vx-card>
</template>
<script>
    import Stock from "./../../../api/StockService";

    export default {
        data() {
            return {
                stock: []
            };
        },
        methods: {},
        async mounted() {
            const response = await Stock.getAllStock();
            this.stock = response.data;
        }
    };
</script>