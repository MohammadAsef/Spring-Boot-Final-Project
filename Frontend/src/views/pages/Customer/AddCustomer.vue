<template>
    <!-- VERTICAL LAYOUT -->
    <div class="vx-col md:w-1/2 w-full mb-base">
        <vx-card title="ثبت مشتری جدید" code-toggler>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" label="نام" v-model="name" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" type="phone" label="شماره تماس" v-model="phone" />
                </div>
            </div>
            <div class="vx-row mb-6">
                <div class="vx-col w-full">
                    <vs-input class="w-full" label="ایمیل آدرس" v-model="email" />
                </div>
            </div>

            <div class="vx-row">
                <div class="vx-col w-full">
                    <vs-button class="mr-3 mb-2" @click="addCustomer">ارسال</vs-button>

                </div>
            </div>



        </vx-card>
    </div>
</template>
<script>

    import CustomerServices from './../../../api/CustomerServices';

    export default{
        data() {
            return {
                name: "",
                phone: "",
                email: "",
            }
        },
        methods :{
            async addCustomer() {
                var customer = {
                    name: this.name,
                    phone: this.phone,
                    email: this.email,
                };
                await  CustomerServices.addCustomer(customer)
                this.$router.push({name: 'customer'})
            }
        }
    }
</script>