<template>
    <vx-card title="فاکتور های فروش" code-toggler>
        <br><br>

        <vs-table :data="saleFactors">

            <template slot="thead">
                <vs-th>شماره فاکتور</vs-th>
                <vs-th>قیمت پرداخت شده</vs-th>
                <vs-th>تاریخ خرید</vs-th>
                <vs-th>قیمت مجموع</vs-th>
                <vs-th>گدام</vs-th>
            </template>

            <template slot-scope="{data}">
                <vs-tr :key="indextr" v-for="(tr, indextr) in saleFactors">
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
                    <vs-td :data="data[indextr].stock.stockName">
                        {{data[indextr].stock.stockName}}
                    </vs-td>
                </vs-tr>
            </template>
        </vs-table>
    </vx-card>
</template>
<script>
    import SaleFactorServices from "./../../../api/saleFactorServices";

    export default {
        data() {
            return {
                saleFactors: []
            };
        },
        methods: {},
        async mounted() {
            const response = await SaleFactorServices.getAllSaleFactors();
            this.saleFactors = response.data;
            console.log(response.data);
        }
    };
</script>