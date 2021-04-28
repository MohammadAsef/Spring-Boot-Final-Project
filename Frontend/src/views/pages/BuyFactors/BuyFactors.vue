<template>
    <vx-card title="فاکتور های فروش" code-toggler>
        <br><br>

        <vs-table :data="buyFactors">

            <template slot="thead">
                <vs-th>شماره فاکتور</vs-th>
                <vs-th>قیمت پرداخت شده</vs-th>
                <vs-th>تاریخ خرید</vs-th>
                <vs-th>قیمت مجموع</vs-th>
                <vs-th>گدام</vs-th>
            </template>

            <template slot-scope="{data}">
                <vs-tr :key="indextr" v-for="(tr, indextr) in buyFactors">
                    <vs-td :data="data[indextr].factorCode">
                        {{data[indextr].factorCode}}
                    </vs-td>
                    <vs-td :data="data[indextr].currentPayment">
                        {{data[indextr].currentPayment}}
                    </vs-td>
                    <vs-td :data="data[indextr].buyDate">
                        {{data[indextr].buyDate}}
                    </vs-td>
                    <vs-td :data="data[indextr].totalPayment">
                        {{data[indextr].totalPayment}}
                    </vs-td>
                    <vs-td :data="data[indextr].stock.stockName">
                        {{data[indextr].stock.stockName}}
                    </vs-td>
                </vs-tr>
            </template>
        </vs-table>
    </vx-card>
</template>
<script>
    import BuyFactorServices from "./../../../api/buyFactorServices";

    export default {
        data() {
            return {
                buyFactors: []
            };
        },
        methods: {},
        async mounted() {
            const response = await BuyFactorServices.getAllBuyFactors();
            this.buyFactors = response.data;
            console.log(response.data);
        }
    };
</script>