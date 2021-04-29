<template>
    <div class="vx-col md:w-1/2 w-full mb-base">
        <vx-card title="ثبت فکتور فروش جدید" code-toggler>
            <div>
                <v-label>انتخاب مشتری</v-label>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-select :options="customers" label="مشتری تان را انتخاب کنید" v-model="customerId"></vs-select>
                </div>
            </div>
            <div>
                <v-label>انتخاب گدام</v-label>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-select :options="options" label="گدام تان را انتخاب کنید" v-model="stock"></vs-select>
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" type="number" label="قیمت پرداختی" v-model="receptionPrice" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" type="date" label="تاریخ فروش" v-model="saleDate" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" type="number" label="قیمت مجموع" v-model="totalPrice" />
                </div>
            </div>
            <div class="vx-row">
                <div class="vx-col w-full">
                    <vs-button class="mr-3 mb-2" @click="addSaleFactor">ارسال</vs-button>
                </div>
            </div>
        </vx-card>
    </div>
</template>
<script>

    import SaleFactorServices from './../../../api/saleFactorServices';
    import CustomerServices from "./../../../api/CustomerServices";
    import StockServices from './../../../api/StockService';
    import { VsSelect } from 'vs-select';

    export default{
        components: {
            VsSelect,
        },
        data() {
            return {
                options: [],
                customers: [],
                receptionPrice: "",
                saleDate: "",
                totalPrice: "",
                stock : null,
                customerId: null,
            }
        },
        async mounted() {
            const response = await  StockServices.getAllStocks();
            response.data.forEach(element => {
                this.options.push({
                    label: element.stockName,
                    value: `${element.stockId}`,
                });
            });
            const cust = await CustomerServices.getAllCustomers();
            cust.data.forEach(element => {
                console.log(element);
                this.customers.push({
                    label: element.name,
                    value: `${element.id}`
                });
            });
        },
        methods :{
            async addSaleFactor() {
                var myStock = await  StockServices.getById(this.stock);
                var customer = await CustomerServices.getById(this.customerId);
                console.log(customer);
                var saleFactor = {
                    receptionPrice: this.receptionPrice,
                    saleDate: this.saleDate,
                    totalPrice: this.totalPrice,
                    stock: myStock.data,
                    customer: customer.data
                };
                await  SaleFactorServices.addSaleFactor(saleFactor)
                this.$router.push({name: 'Factor'})
            }
        }
    }
</script>