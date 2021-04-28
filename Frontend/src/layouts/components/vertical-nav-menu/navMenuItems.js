/*=========================================================================================
  File Name: sidebarItems.js
  Description: Sidebar Items list. Add / Remove menu items from here.
  ----------------------------------------------------------------------------------------
  Item Name: Vuexy - Vuejs, HTML & Laravel Admin Dashboard Template
  Author: Pixinvent
  Author URL: http://www.themeforest.net/user/pixinvent
==========================================================================================*/


export default [
  {
    url: "/",
    name: "صفحه اصلی",
    slug: "home",
    icon: "HomeIcon",
  },
  {
    url: "/customer",
    name: "مشتریان",
    slug: "customer",
    icon: "UserIcon",
      submenu: [
          {
              url: '/customer',
              name: "لیست مشتریان",
              slug: "customer",
              i18n: "customer",
          },
          {
              url: '/customer/add',
              name: "اضافه کردن مشتری",
              slug: "addCustomer",
              i18n: "addCustomer",
          },
      ]
  },
  {
    name: "فکتور ها",
    slug: "Factor",
    icon: "ClipboardIcon",
      submenu: [
          {
              url: '/buyfactor',
              name: "لیست فکتور خرید",
              slug: "Factor",
              i18n: "Factor",
          },
          {
              url: '/buyFactor/add',
              name: "اضافه کردن فکتور خرید",
              slug: "addFactor",
              i18n: "addFactor",
          }, {
              url: '/salefactor',
              name: "لیست فکتور فروش",
              slug: "saleFactor",
              i18n: "Factor",
          }, {
              url: '/saleFactor/add',
              name: "اضافه کردن فکتور فروش",
              slug: "addFactor",
              i18n: "addFactor",
          },
      ]
  },
  {
    url: "/stock",
    name: "Stock",
    slug: "stock",
    icon: "BoxIcon",
     submenu: [
          {
              url: '/Stock',
              name: "لیست انبار",
              slug: "Stock",
              i18n: "Stock",
          },
          {
              url: '/addStock/add',
              name: "اضافه کردن انبار",
              slug: "addStock",
              i18n: "addStock",
          },
      ]
  },
  {
    url: "/product",
    name: "اجناس",
    slug: "product",
    icon: "ShoppingCartIcon",
  },
  {
    url: "/report",
    name: "گزارش",
    slug: "report",
    icon: "BarChart2Icon",
  },
  
]
