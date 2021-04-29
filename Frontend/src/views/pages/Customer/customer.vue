<template>
    <vx-card title="مشتریان" code-toggler>
        <br><br>

        <vs-table :data="customers">

            <template slot="thead">
                <vs-th>نام</vs-th>
                <vs-th>ایمیل آدرس</vs-th>
                <vs-th>شماره تماس</vs-th>
            </template>

            <template slot-scope="{data}">
                <vs-tr :key="indextr" v-for="(tr, indextr) in customers">
                    <vs-td :data="data[indextr].name">
                        {{data[indextr].name}}
                    </vs-td>
                    <vs-td :data="data[indextr].email">
                        {{data[indextr].email}}
                    </vs-td>
                    <vs-td :data="data[indextr].phone">
                        {{data[indextr].phone}}
                    </vs-td>
                </vs-tr>
            </template>
        </vs-table>
    </vx-card>
</template>


<script>
    import CustomerServices from "./../../../api/CustomerServices";

    export default {
        data() {
            return {
                customers: []
            };
        },
        methods: {},
        async mounted() {
            const response = await CustomerServices.getAllCustomers();
            this.customers = response.data;
        }
    };
</script>
