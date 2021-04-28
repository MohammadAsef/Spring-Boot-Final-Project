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
    name: "فکتور فروش",
    slug: "Factor",
    icon: "FolderIcon",
      submenu: [
          {
              url: '/factor',
              name: "لیست فکتور فروش",
              slug: "Factor",
              i18n: "Factor",
          },
          {
              url: '/saleFactor/add',
              name: "اضافه کردن فکتور فروش",
              slug: "addFactor",
              i18n: "addFactor",
          },
      ]
  },
  {
    name: "فکتور خرید",
    slug: "BuyFactor",
    icon: "FolderIcon",
      submenu: [
          {
              url: '/buyfactor',
              name: "لیست فکتور خرید",
              slug: "BuyFactor",
              i18n: "BuyFactor",
          },
          {
              url: '/buyFactor/add',
              name: "اضافه کردن فکتور خرید",
              slug: "addBuyFactor",
              i18n: "addBuyFactor",
          },
      ]
  }
  , {
    url: "/product",
    name: "اجناس",
    slug: "product",
    icon: "ShoppingCartIcon",
  },
]
