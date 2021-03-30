import Vue from "vue";
import Vuex from "vuex";

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
       } 
  },
  actions: {
   updateSnackbar({commit}, payload){
     commit("SET_SNACKBAR", payload);
   }

  },
  modules: {}
});
