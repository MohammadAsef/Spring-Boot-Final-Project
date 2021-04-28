<template>
    <vx-card title="فاکتور های فروش" code-toggler>
        <br><br>

        <vs-table :data="saleFactors">

            <template slot="thead">
                <vs-th>شماره فاکتور</vs-th>
                <vs-th>قیمت پرداخت شده</vs-th>
                <vs-th>تاریخ خرید</vs-th>
                <vs-th>قیمت مجموع</vs-th>
            </template>

            <template slot-scope="{data}">
                <vs-tr :key="indextr"  >
                    <vs-td :data="data[indextr].factorCode">
                        {{data[indextr].factorCode}}
                    </vs-td>
                    <vs-td :data="data[indextr].receptionPrice">
                        {{data[indextr].receptionPrice}}
                    </vs-td>
                    <vs-td :data="data[indextr].saleDate">
                        {{data[indextr].saleDate}}
                    </vs-td>
                    <vs-td :data="data[indextr].totalPrice">
                        {{data[indextr].totalPrice}}
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