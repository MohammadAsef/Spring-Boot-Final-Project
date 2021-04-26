

/*=========================================================================================
  File Name: main.js
  Description: main vue(js) file
  ----------------------------------------------------------------------------------------
  Item Name: Vuexy - Vuejs, HTML & Laravel Admin Dashboard Template
  Author: Pixinvent
  Author URL: http://www.themeforest.net/user/pixinvent
==========================================================================================*/


import Vue from 'vue'
import App from './App.vue'

// Vuesax Component Framework
import Vuesax from 'vuesax'
import 'material-icons/iconfont/material-icons.css' //Material Icons
import 'vuesax/dist/vuesax.css'; // Vuesax
Vue.use(Vuesax)




// axios
import Axios from "axios"
Vue.prototype.$http = Axios




// Theme Configurations
import '../themeConfig.js'


// Globally Registered Components
import './globalComponents.js'


// Styles: SCSS
import './assets/scss/main.scss'


// Tailwind
import '@/assets/css/main.css'


// Vue Router
import router from './router'


// Vuex Store
import store from './store/store'

import axiosClient from "./api/axiosClient";

// Vuejs - Vue wrapper for hammerjs
import { VueHammer } from 'vue2-hammer'
Vue.use(VueHammer)


// PrismJS
import 'prismjs'
import 'prismjs/themes/prism-tomorrow.css'


// Feather font icon
require('./assets/css/iconfont.css')


Vue.config.productionTip = false



Vue.prototype.$http = Axios;
const token = localStorage.getItem('token')
if (token) {
    Vue.prototype.$http.defaults.headers.common['Authorization'] = token
}



new Vue({
    router,
    store,
    created() {
        const userData = localStorage.getItem("user");

        console.log("userData",userData)
        if (userData) {
            this.$store.commit("SET_USER", JSON.parse(userData));



        }


        axiosClient.interceptors.response.use(
            response => response,
            error => {
                if (error.response.status === 403) {
                    this.$store.dispatch("logout");
                }

                return Promise.reject(error);
            }
        )
    },
    render: h => h(App)
}).$mount('#app')
