<template>
  <div>
    <div class="vx-col md:w-1/2 w-full mb-base">
      <vx-card title="ثبت انبار جدید">
     
        <div>
          <!----><!---->
          <div class="vx-row">
            <div class="col-sm-6 col-xl-3 mb-2 mb-xl-0">
              <div class="media">
                <div class="media-aside mr-2 align-self-start">
                  <span
                    class="b-avatar badge-light-primary rounded-circle"
                    style="width: 48px; height: 48px"
                    ><span class="b-avatar-custom"
                      ><svg
                        xmlns="http://www.w3.org/2000/svg"
                        width="24px"
                        height="24px"
                        viewBox="0 0 24 24"
                        fill="none"
                        stroke="currentColor"
                        stroke-width="2"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        class="feather feather-trending-up"
                      >
                        <polyline
                          points="23 6 13.5 15.5 8.5 10.5 1 18"
                        ></polyline>
                        <polyline
                          points="17 6 23 6 23 12"
                        ></polyline></svg></span
                    ><!----></span
                  >
                </div>
                <div class="media-body my-auto">
                  <h4 class="font-weight-bolder mb-0">230k</h4>
                  <p class="card-text font-small-3 mb-0">Sales</p>
                </div>
              </div>
            </div>
            <div class="col-sm-6 col-xl-3 mb-2 mb-xl-0">
              <div class="media">
                <div class="media-aside mr-2 align-self-start">
                  <span
                    class="b-avatar badge-light-info rounded-circle"
                    style="width: 48px; height: 48px"
                    ><span class="b-avatar-custom"
                      ><svg
                        xmlns="http://www.w3.org/2000/svg"
                        width="24px"
                        height="24px"
                        viewBox="0 0 24 24"
                        fill="none"
                        stroke="currentColor"
                        stroke-width="2"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        class="feather feather-user"
                      >
                        <path
                          d="M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2"
                        ></path>
                        <circle cx="12" cy="7" r="4"></circle></svg></span
                    ><!----></span
                  >
                </div>
                <div class="media-body my-auto">
                  <h4 class="font-weight-bolder mb-0">8.549k</h4>
                  <p class="card-text font-small-3 mb-0">Customers</p>
                </div>
              </div>
            </div>
            <div class="col-sm-6 col-xl-3 mb-2 mb-sm-0">
              <div class="media">
                <div class="media-aside mr-2 align-self-start">
                  <span
                    class="b-avatar badge-light-danger rounded-circle"
                    style="width: 48px; height: 48px"
                    ><span class="b-avatar-custom"
                      ><svg
                        xmlns="http://www.w3.org/2000/svg"
                        width="24px"
                        height="24px"
                        viewBox="0 0 24 24"
                        fill="none"
                        stroke="currentColor"
                        stroke-width="2"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        class="feather feather-box"
                      >
                        <path
                          d="M21 16V8a2 2 0 0 0-1-1.73l-7-4a2 2 0 0 0-2 0l-7 4A2 2 0 0 0 3 8v8a2 2 0 0 0 1 1.73l7 4a2 2 0 0 0 2 0l7-4A2 2 0 0 0 21 16z"
                        ></path>
                        <polyline
                          points="3.27 6.96 12 12.01 20.73 6.96"
                        ></polyline>
                        <line
                          x1="12"
                          y1="22.08"
                          x2="12"
                          y2="12"
                        ></line></svg></span
                    ><!----></span
                  >
                </div>
                <div class="media-body my-auto">
                  <h4 class="font-weight-bolder mb-0">1.423k</h4>
                  <p class="card-text font-small-3 mb-0">Products</p>
                </div>
              </div>
            </div>
            <div class="col-sm-6 col-xl-3">
              <div class="media">
                <div class="media-aside mr-2 align-self-start">
                  <span
                    class="b-avatar badge-light-success rounded-circle"
                    style="width: 48px; height: 48px"
                    ><span class="b-avatar-custom"
                      ><svg
                        xmlns="http://www.w3.org/2000/svg"
                        width="24px"
                        height="24px"
                        viewBox="0 0 24 24"
                        fill="none"
                        stroke="currentColor"
                        stroke-width="2"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        class="feather feather-dollar-sign"
                      >
                        <line x1="12" y1="1" x2="12" y2="23"></line>
                        <path
                          d="M17 5H9.5a3.5 3.5 0 0 0 0 7h5a3.5 3.5 0 0 1 0 7H6"
                        ></path></svg></span
                    ><!----></span
                  >
                </div>
                <div class="media-body my-auto">
                  <h4 class="font-weight-bolder mb-0">$9745</h4>
                  <p class="card-text font-small-3 mb-0">Revenue</p>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!----><!---->
      </vx-card>
    </div>

    <vx-card title="آخرین فاکتور فروش" code-toggler>
      <vs-table :data="saleFactors">
        <template slot="thead">
          <vs-th>شماره فاکتور</vs-th>
          <vs-th>قیمت پرداخت شده</vs-th>
          <vs-th>تاریخ خرید</vs-th>
          <vs-th>قیمت مجموع</vs-th>
        </template>

        <template slot-scope="{ data }">
          <vs-tr :key="indextr" v-for="(tr, indextr) in saleFactors">
            <vs-td :data="data[indextr].factorCode">
              {{ data[indextr].factorCode }}
            </vs-td>
            <vs-td :data="data[indextr].receptionPrice">
              {{ data[indextr].receptionPrice }}
            </vs-td>
            <vs-td :data="data[indextr].saleDate">
              {{ data[indextr].saleDate }}
            </vs-td>
            <vs-td :data="data[indextr].totalPrice">
              {{ data[indextr].totalPrice }}
            </vs-td>
          </vs-tr>
        </template>
      </vs-table>
    </vx-card>
  </div>
</template>
<script>
import ReportService from "./../../api/ReportService";

export default {
  data() {
    return {
      saleFactors: [],
    };
  },
  methods: {},
  async mounted() {
    const response = await ReportService.getAllSaleFactors();
    this.saleFactors = response.data;
  },
};
</script>