<template>
    <div class="vx-col md:w-1/2 w-full mb-base">
        <vx-card title="ثبت فکتور فروش جدید" code-toggler>
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
                    <vs-input class="w-full" type="number" label="قیمت پرداختی" v-model="currentPayment" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" type="date" label="تاریخ فروش" v-model="buyDate" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" type="number" label="قیمت مجموع" v-model="totalPayment" />
                </div>
            </div>
            <div class="vx-row">
                <div class="vx-col w-full">
                    <vs-button class="mr-3 mb-2" @click="addBuyFactor">ارسال</vs-button>
                </div>
            </div>
        </vx-card>
    </div>
</template>
<script>

    import BuyFactorServices from './../../../api/buyFactorServices';
    import StockServices from './../../../api/stockServices';
    import { VsSelect } from 'vs-select';

    export default{
        components: {
            VsSelect,
        },
        data() {
            return {
                options: [],
                currentPayment: "",
                buyDate: "",
                totalPayment: "",
                stock : null,
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
        },
        methods :{
            async addBuyFactor() {
                var myStock = await  StockServices.getById(this.stock);
                var buyFactor = {
                    currentPayment: this.currentPayment,
                    buyDate: this.buyDate,
                    totalPayment: this.totalPayment,
                    stock: myStock.data,
                };
                await  BuyFactorServices.addBuyFactor(buyFactor)
                this.$router.push({name: 'BuyFactor'})
            }
        }
    }
</script>