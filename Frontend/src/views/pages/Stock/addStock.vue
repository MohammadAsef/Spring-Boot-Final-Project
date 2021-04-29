<template>
    <div class="vx-col md:w-1/2 w-full mb-base">
        <vx-card title="ثبت انبار جدید" >
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" label="نام گدام" v-model="stockName" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" label="آدرس گدام" v-model="stockAddress" />
                </div>
            </div>
            <div class="vx-row">
                <div class="vx-col w-full">
                    <vs-button class="mr-3 mb-2" @click="addStock">ارسال</vs-button>
                </div>
            </div>
        </vx-card>
    </div>
</template>
<script>

    import Stock from './../../../api/StockService';

    export default{
        data() {
            return {
                stockName: "",
                stockAddress: "",
            }
        },
        methods :{
            async addStock() {
                var stock= {
                    status: 0,
                    stockName: this.stockName,
                    stockAddress: this.stockAddress,
                };
                await  Stock.addStock(stock)
                this.$router.push({name: 'Stock'})
            }
        }
    }
</script>