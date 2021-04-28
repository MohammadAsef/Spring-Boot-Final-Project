<!-- =========================================================================================
    File Name: DashboardEcommerce.vue
    Description: Dashboard - Ecommerce
    ----------------------------------------------------------------------------------------
    Item Name: Vuexy - Vuejs, HTML & Laravel Admin Dashboard Template
      Author: Pixinvent
    Author URL: http://www.themeforest.net/user/pixinvent
========================================================================================== -->

<template>
    <div>
        <div class="vx-row">
            <div class="vx-col w-full sm:w-1/2 md:w-1/2 lg:w-1/4 xl:w-1/4 mb-base">
                <statistics-card-line
                        v-if="subscribersGained.analyticsData"
                        icon="UsersIcon"
                        :statistic="subscribersGained.analyticsData.subscribers | k_formatter"
                        statisticTitle="Subscribers Gained"
                        :chartData="subscribersGained.series"
                        type='area' />
            </div>

            <div class="vx-col w-full sm:w-1/2 md:w-1/2 lg:w-1/4 xl:w-1/4 mb-base">
                <statistics-card-line
                        v-if="revenueGenerated.analyticsData"
                        icon="DollarSignIcon"
                        :statistic="revenueGenerated.analyticsData.revenue | k_formatter"
                        statisticTitle="Revenue Generated"
                        :chartData="revenueGenerated.series"
                        color='success'
                        type='area' />
            </div>

            <div class="vx-col w-full sm:w-1/2 md:w-1/2 lg:w-1/4 xl:w-1/4 mb-base">
                <statistics-card-line
                        v-if="quarterlySales.analyticsData"
                        icon="ShoppingCartIcon"
                        :statistic="quarterlySales.analyticsData.sales"
                        statisticTitle="Quarterly Sales"
                        :chartData="quarterlySales.series"
                        color='danger'
                        type='area' />
            </div>
            <div class="vx-col w-full sm:w-1/2 md:w-1/2 lg:w-1/4 xl:w-1/4 mb-base">
                <statistics-card-line
                        v-if="ordersRecevied.analyticsData"
                        icon="ShoppingBagIcon"
                        :statistic="ordersRecevied.analyticsData.orders | k_formatter"
                        statisticTitle="Orders Received"
                        :chartData="ordersRecevied.series"
                        color='warning'
                        type='area' />
            </div>
        </div>


    </div>
</template>

<script>
    import VuePerfectScrollbar from 'vue-perfect-scrollbar'
    import VueApexCharts from 'vue-apexcharts'
    import StatisticsCardLine from './../components/statistics-cards/StatisticsCardLine.vue'
    import analyticsData from './../store/analyticsData'
    import ChangeTimeDurationDropdown from './../components/ChangeTimeDurationDropdown.vue'

    export default{
        data() {
            return {
                subscribersGained: {},
                revenueGenerated: {},
                quarterlySales: {},
                ordersRecevied: {},

                revenueComparisonLine: {},
                goalOverview: {},

                browserStatistics: [],
                clientRetentionBar: {},

                sessionsData: {},
                chatLog: [],
                chatMsgInput: '',
                customersData: {},

                analyticsData: analyticsData,
                settings: { // perfectscrollbar settings
                    maxScrollbarLength: 60,
                    wheelSpeed: .60,
                },
            }
        },
        components: {
            VueApexCharts,
            StatisticsCardLine,
            VuePerfectScrollbar,
            ChangeTimeDurationDropdown
        },
        mounted() {
            this.$refs.chatLogPS.$el.scrollTop = this.$refs.chatLog.scrollHeight;
        },
        created() {
            // Subscribers gained - Statistics
            this.$http.get("/api/card/card-statistics/subscribers")
                .then((response) => { this.subscribersGained = response.data })
                .catch((error) => { console.log(error) })

            // Revenue Generated
            this.$http.get("/api/card/card-statistics/revenue")
                .then((response) => { this.revenueGenerated = response.data })
                .catch((error) => { console.log(error) })

            // Sales
            this.$http.get("/api/card/card-statistics/sales")
                .then((response) => { this.quarterlySales = response.data })
                .catch((error) => { console.log(error) })

            // Orders - Statistics
            this.$http.get("/api/card/card-statistics/orders")
                .then((response) => { this.ordersRecevied = response.data })
                .catch((error) => { console.log(error) })

            // Revenue Comparison
            this.$http.get("/api/card/card-analytics/revenue-comparison")
                .then((response) => { this.revenueComparisonLine = response.data })
                .catch((error) => { console.log(error) })

            // Goal Overview
            this.$http.get("/api/card/card-analytics/goal-overview")
                .then((response) => { this.goalOverview = response.data })
                .catch((error) => { console.log(error) })

            // Browser Analytics
            this.$http.get("/api/card/card-analytics/browser-analytics")
                .then((response) => { this.browserStatistics = response.data })
                .catch((error) => { console.log(error) })

            // Client Retention
            this.$http.get("/api/card/card-analytics/client-retention")
                .then((response) => { this.clientRetentionBar = response.data })
                .catch((error) => { console.log(error) })

            // Sessions By Device
            this.$http.get("/api/card/card-analytics/session-by-device")
                .then((response) => { this.sessionsData = response.data })
                .catch((error) => { console.log(error) })

            // Chat Log
            this.$http.get("/api/chat/demo-1/log")
                .then((response) => { this.chatLog = response.data })
                .catch((error) => { console.log(error) })

            // Customers
            this.$http.get("/api/card/card-analytics/customers")
                .then((response) => { this.customersData = response.data })
                .catch((error) => { console.log(error) })
        }
    }
</script>

<style lang="scss">
    .chat-card-log {
        height: 400px;

        .chat-sent-msg {
            background-color: #f2f4f7 !important;
        }
    }
</style>
