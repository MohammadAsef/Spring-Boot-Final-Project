import Vue from "vue";
import Vuex from "vuex";
import UserService from "../api/userService"
Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    text : "",
    timeout: 6000
  },
  mutations: {
    SET_SNACKBAR : (state, payload) =>{
        state.text = payload.text;
        state.timeout = payload.timeout;
       },
       
     SET_USER: (state, userData) => {
       UserService.addAuthorizationHeader(userData.token);
       console.log(userData.token);
     }
  },
  actions: {
   updateSnackbar({ commit }, payload){
     commit("SET_SNACKBAR", payload);
   },

  async signup({commit}, user){
    const response =   await UserService.register(user);
     commit("SET_USER", response.data);
     console.log(response.data);
   }

  },
  modules: {}
});
