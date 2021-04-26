<template>
    <vx-card title="Default" code-toggler>

        <p>
            To implement a data table we have the component vs-table, also sub components and slots for a better management of the structure and operation</p>

        <vx-list :list="tableList"></vx-list>
        <br>

        <vs-alert color="primary" icon="new_releases" active="true">
            <p>In order to manipulate the data within the table, it is necessary to add the property: <code>data="myDataTable"</code>
                and thus be able to use the <code>slot-scope="{data}"</code></p>
        </vs-alert>
        <br><br>

        <vs-table :data="customers">

            <template slot="thead">
                <vs-th>نام</vs-th>
                <vs-th>آدرس</vs-th>
                <vs-th>شماره تماس</vs-th>
                <vs-th>حساب</vs-th>
            </template>

            <template slot-scope="{data}">
                <vs-tr :key="indextr" v-for="(tr, indextr) in customers">
                    <vs-td :data="data[indextr].email">
                        {{data[indextr].email}}
                    </vs-td>
                    <vs-td :data="data[indextr].username">
                        {{data[indextr].name}}
                    </vs-td>
                    <vs-td :data="data[indextr].id">
                        {{data[indextr].website}}
                    </vs-td>
                    <vs-td :data="data[indextr].id">
                        {{data[indextr].id}}
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

        methods: {
//            async deleteEmployee(employeeId) {
//                const conf = confirm("Do you really want to delete this employee?");
//                if (conf) {
//                    const response = await EmployeeService.deleteById(employeeId);
//                    console.log(response.data);
//                    this.employees = this.employees.filter(employee => {
//                        return employee._id !== employeeId;
//                    });
//                }
//            }
        },

        async mounted() {
            const response = await CustomerServices.getAllCustomers();
            this.customers = response.data;
        }
    };
</script>
