<template>
<div>
       <vx-card title="آخرین فاکتور فروش" code-toggler>
        <vs-table :data="saleFactors">

            <template slot="thead">
                <vs-th>شماره فاکتور</vs-th>
                <vs-th>قیمت پرداخت شده</vs-th>
                <vs-th>تاریخ خرید</vs-th>
                <vs-th>قیمت مجموع</vs-th>
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
                </vs-tr>
            </template>
        </vs-table>
    </vx-card>
</div>
 
    
</template>
<script>
    import ReportService from "./../../api/ReportService";

    export default {
        data() {
            return {
                saleFactors: []
            };
        },
        methods: {},
        async mounted() {
            const response = await ReportService.getAllSaleFactors();
            this.saleFactors = response.data;
        }
    };
</script>