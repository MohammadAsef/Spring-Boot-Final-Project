<template>
    <div class="vx-col md:w-1/2 w-full mb-base">
        <vx-card title="ثبت فکتور فروش جدید" code-toggler>
            <div>
                <v-label>انتخاب فکتور خرید</v-label>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-select :options="factors" label="فکتور تان را انتخاب کنید" v-model="factorId"></vs-select>
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" type="number" label="قیمت محصول" v-model="prodcutPrice" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" type="number" label="قیمت خریداری شده" v-model="productBuyPrice" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" type="number" label="کد مصصول" v-model="productCode" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" label="توضیحات محصول" v-model="productDecs" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" label="نام محصول" v-model="productName" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" type="number" label="قیمت فروش" v-model="productSalePrice" />
                </div>
            </div>
            <div class="vx-row">
                <div class="vx-col w-full">
                    <vs-button class="mr-3 mb-2" @click="addProduct">ارسال</vs-button>
                </div>
            </div>
        </vx-card>
    </div>
</template>
<script>

    import BuyFactorServices from './../../../api/buyFactorServices';
    import ProductServices from './../../../api/productServices';
    import { VsSelect } from 'vs-select';

    export default{
        components: {
            VsSelect,
        },
        data() {
            return {
                factors: [],
                factorId: null,
                prodcutPrice: null,
                productBuyPrice: null,
                productCode : null,
                productDecs: null,
                productName: null,
                productSalePrice: null,
            }
        },
        async mounted() {
            const response = await BuyFactorServices.getAllBuyFactors();
            response.data.forEach(element => {
                this.factors.push({
                    label: element.buyFactorId,
                    value: `${element.buyFactorId}`,
                });
            });
            console.log(response.data);
        },
        methods :{
            async addProduct() {
                var buyFactor = await  BuyFactorServices.getById(this.factorId);
                console.log(buyFactor);
                var newProduct = {
                    buyFactor: this.buyFactor,
                    price: this.prodcutPrice,
                    product_buy_price: this.productBuyPrice,
                    product_code : this.productCode,
                    product_description: this.productDecs,
                    product_name: this.productName,
                    product_sale_price: this.productSalePrice,
                };
                await  ProductServices.addProduct(newProduct);
                this.$router.push({name: 'product'})
            }
        }
    }
</script>