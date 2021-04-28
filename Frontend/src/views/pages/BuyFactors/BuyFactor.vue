<template>
    <vx-card title="فاکتور های فروش" code-toggler>
        <br><br>

        <vs-table :data="buyFactors">

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
                    <vs-td :data="data[indextr].buyDate">
                        {{data[indextr].buyDate}}
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
    import buyFactorServices from "../../../api/buyFactorService";

    export default {
        data() {
            return {
                buyFactors: []
            };
        },
        methods: {},
        async mounted() {
            const response = await buyFactorServices.getAllBuyFactors();
            this.buyFactors = response.data;
        }
    };
</script>