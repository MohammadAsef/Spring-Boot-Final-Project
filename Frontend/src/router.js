/*=========================================================================================
  File Name: router.js
  Description: Routes for vue-router. Lazy loading is enabled.
  ----------------------------------------------------------------------------------------
  Item Name: Vuexy - Vuejs, HTML & Laravel Admin Dashboard Template
  Author: Pixinvent
  Author URL: http://www.themeforest.net/user/pixinvent
==========================================================================================*/

import Vue from "vue";
import Router from "vue-router";

Vue.use(Router);

const router = new Router({
  mode: "history",
  base: process.env.BASE_URL,
  scrollBehavior() {
    return { x: 0, y: 0 };
  },
  routes: [
    {
      // =============================================================================
      // MAIN LAYOUT ROUTES
      // =============================================================================
      path: "",
      component: () => import("./layouts/main/Main.vue"),

      meta: { authentication: false },
      children: [
        // =============================================================================
        // Theme Routes
        // =============================================================================
        {
          path: "/",
          name: "home",
          component: () => import("./views/Home.vue")
        },

        {
          path: "/customer",
          name: "customer",
          component: () => import("./views/pages/Customer/customer.vue"),
          meta: {
            breadcrumb: [
              { title: "Home", url: "/" },
              { title: "لیست", url: "/customer", active: true },
              { title: "اضافه کردن", url: "/customer/add" }
            ],
            pageTitle: "مشتریان",
            rule: "editor"
          }
        },
        {
          path: "/customer/add",
          name: "addCustomer",
          component: () => import("./views/pages/Customer/AddCustomer.vue"),
          meta: {
            breadcrumb: [
              { title: "Home", url: "/" },
              { title: "لیست", url: "/customer" },
              { title: "اضافه کردن", url: "/customer/add", active: true }
            ],
            pageTitle: "مشتریان",
            rule: "editor"
          }
        },

        {
          path: "/salefactor",
          name: "saleFactor",
          component: () => import("./views/pages/SaleFactors/SaleFactor.vue"),
          meta: {
            breadcrumb: [
              { title: "Home", url: "/" },
              { title: "لیست", url: "/salefactor", active: true },
              { title: "اضافه کردن", url: "/saleFactor/add" }
            ],
            pageTitle: "فکتور ها",
            rule: "editor"
          }
        },
        {
          path: "/saleFactor/add",
          name: "addSaleFactor",
          component: () =>
            import("./views/pages/SaleFactors/addSaleFactor.vue"),
          meta: {
            breadcrumb: [
              { title: "Home", url: "/" },
              { title: "لیست", url: "/factor" },
              {
                title: "اضافه کردن فکتور",
                url: "/saleFactor/add",
                active: true
              }
            ],
            pageTitle: "فکتور ها",
            rule: "editor"
          }
        },
        {
          path: "/buyfactor",
          name: "buyFactor",
          component: () => import("./views/pages/BuyFactors/BuyFactor.vue"),
          meta: {
            breadcrumb: [
              { title: "Home", url: "/" },
              { title: "لیست", url: "/buyfactor", active: true },
              { title: "اضافه کردن", url: "/buyFactor/add" }
            ],
            pageTitle: "فکتور ها",
            rule: "editor"
          }
        },
        {
          path: "/buyFactor/add",
          name: "addbuyFactor",
          component: () => import("./views/pages/BuyFactors/addBuyFactor.vue"),
          meta: {
            breadcrumb: [
              { title: "Home", url: "/" },
              { title: "لیست", url: "/factor" },
              {
                title: "اضافه کردن فکتور",
                url: "/buyFactor/add",
                active: true
              }
            ],
            pageTitle: "فکتور ها",
            rule: "editor"
          }
        },
        {
          path: "/report",
          name: "Report",
          component: () => import("./views/pages/Report.vue")
        },
        {
          path: "/stock",
          name: "Stock",
          component: () => import("./views/pages/Stock/Stock.vue"),
          meta: {
            breadcrumb: [
              { title: "Home", url: "/" },
              { title: "لیست", url: "/Stock", active: true },
              { title: "اضافه کردن", url: "/addStock/add" }
            ],
            pageTitle: "انبار",
            rule: "editor"
          }
        },
        {
          path: "/addStock/add",
          name: "addStock",
          component: () => import("./views/pages/Stock/addStock.vue"),
          meta: {
            breadcrumb: [
              { title: "Home", url: "/" },
              { title: "لیست", url: "/Stock", active: true },
              { title: "اضافه کردن", url: "/addStock/add" }
            ],
            pageTitle: "اضافه کردن",
            rule: "editor"
          }
        }
      ]
    },
    // =============================================================================
    // FULL PAGE LAYOUTS
    // =============================================================================
    {
      path: "",
      component: () => import("@/layouts/full-page/FullPage.vue"),
      children: [
        // =============================================================================
        // PAGES
        // =============================================================================
        {
          path: "/login",
          name: "page-login",
          component: () => import("@/views/pages/Login.vue")
        },
        {
          path: "/error-404",
          name: "page-error-404",
          component: () => import("@/views/pages/Error404.vue")
        }
      ]
    },
    // Redirect to 404 page, if no match found
    {
      path: "*",
      redirect: "/error-404"
    }
  ]
});

router.afterEach(() => {
  // Remove initial loading
  const appLoading = document.getElementById("loading-bg");
  if (appLoading) {
    appLoading.style.display = "none";
  }
});

router.beforeEach((to, from, next) => {
  const loggedIn = localStorage.getItem("user");
  if (to.matched.some(item => item.meta.authentication) && !loggedIn) {
    next("/login");
  } else {
    next();
  }
});

export default router;
