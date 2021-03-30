import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import BuyingFactor from "../views/buyingFactor.vue";
import SellingFactor from "../views/sellingFactor.vue";
import Report from "../views/Report.vue";
import Stock from "../views/Stock.vue";
import MoneySavings from "../views/MoneySavings.vue";
import Settings from "../views/Settings.vue";
import LoginComponent from "../views/logInForm.vue";
Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    redirect: {
      name: "login"
    }
  },
  {
    path: "/login",
    name: "login",
    component: LoginComponent
  },
  {
    path: "/buy",
    name: "BuyingFactor",
    component: BuyingFactor
  },
  {
    path: "/home",
    name: "home",
    component: Home
  },
  {
    path: "/sell",
    name: "SellingFactor",
    component: SellingFactor
  },
  {
    path: "/report",
    name: "Report",
    component: Report
  },
  {
    path: "/stock",
    name: "Stock",
    component: Stock
  },
  {
    path: "/settings",
    name: "Settings",
    component: Settings
  },
  {
    path: "/moneySavings",
    name: "MoneySavings",
    component: MoneySavings
  }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes
});

export default router;
