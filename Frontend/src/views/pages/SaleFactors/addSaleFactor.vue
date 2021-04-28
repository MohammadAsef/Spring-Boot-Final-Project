<template>
    <div class="vx-col md:w-1/2 w-full mb-base">
        <vx-card title="ثبت فکتور جدید" code-toggler>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" label="شماره فکتور" v-model="factorCode" />
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

    import SaleFactorServices from '../../../api/saleFactorServices';

    export default{
        data() {
            return {
                dialog: false,
                factorCode: "",
                receptionPrice: "",
                saleDate: "",
                totalPrice: "",
            }
        },
        methods :{
            async addSaleFactor() {
                var saleFactor = {
                    factorCode: this.factorCode,
                    receptionPrice: this.receptionPrice,
                    saleDate: this.saleDate,
                    totalPrice: this.totalPrice,
                };
                await  SaleFactorServices.addSaleFactor(saleFactor)
                this.$router.push({name: 'Factor'})
            }
        }
    }
</script>