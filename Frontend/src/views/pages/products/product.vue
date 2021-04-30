<template>
    <vx-card title="فاکتور های فروش" code-toggler>
        <br><br>

        <vs-table :data="products">

            <template slot="thead">
                <vs-th>قیمت محصول</vs-th>
                <vs-th>قیمت خریداری شده</vs-th>
                <vs-th>کد محصول</vs-th>
                <vs-th>توضیحات محصول</vs-th>
                <vs-th>نام محصول</vs-th>
                <vs-th>قیمت فروش</vs-th>
            </template>

            <template slot-scope="{data}">
                <vs-tr :key="indextr" v-for="(tr, indextr) in products">
                    <vs-td :data="data[indextr].price">
                        {{data[indextr].price}}
                    </vs-td>
                    <vs-td :data="data[indextr].product_buy_price">
                        {{data[indextr].product_buy_price}}
                    </vs-td>
                    <vs-td :data="data[indextr].product_code">
                        {{data[indextr].product_code}}
                    </vs-td>
                    <vs-td :data="data[indextr].product_description">
                        {{data[indextr].product_description}}
                    </vs-td>
                    <vs-td :data="data[indextr].product_name">
                        {{data[indextr].product_name}}
                    </vs-td>
                    <vs-td :data="data[indextr].product_sale_price">
                        {{data[indextr].product_sale_price}}
                    </vs-td>
                </vs-tr>
            </template>
        </vs-table>
    </vx-card>
</template>
<script>
    import ProductServices from "./../../../api/productServices";

    export default {
        data() {
            return {
                products: []
            };
        },
        methods: {},
        async mounted() {
            const response = await ProductServices.getAllProduct();
            this.products = response.data;
            console.log(response.data);
        }
    };
</script>