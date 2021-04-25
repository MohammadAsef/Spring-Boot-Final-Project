<template>
  <div id="app">

    

    <div v-if="authenticated == true && register == true">
      <Header @authenticated="setAuthenticated" />
      <navbar />
      <div class="view-container">
        <router-view @authenticated="setAuthenticated"  @register="setRegister"/>
      </div>
    </div>

    <div v-if="!authenticated">
      <div class="view-container1">
        <router-view @authenticated="setAuthenticated" />
        </div>
    </div>

        <div v-if="!register">
      <div class="view-container1">
        <router-view @register="setRegister" />
        
</div>
    </div>

   

  </div>
</template>

<script>
import navbar from "@/components/navbar.vue";
import Header from "@/components/Header.vue";

export default {
  name: "App",
  components: {
    navbar,
    Header
  },

  data() {
    return {
      authenticated: false,
      register: true,
      mockAccount: {
        username: "rezaazimi22",
        password: "skillful"
      }
    };
  },
  mounted() {
    if (!this.authenticated) {
      this.$router.replace({ name: "login" });
    }
  },
  methods: {
    setAuthenticated(status) {
      this.authenticated = status;
    },
     setRegister(status) {
      this.register = status;
    },
    logout() {
      this.authenticated = false;
    }
  }
};
</script>

<style>
.view-container {
  padding: 1.5em;
  width: 100vw;
  box-sizing: border-box;
  height: 100vh;
  /* background: url("d.jpg"); */
  background-color: rgb(19, 19, 68);
}

.view-container1 {
  font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue",
    Helvetica, Arial, "Lucida Grande", sans-serif;
  color: white;
  font-size: 12px;
  background-color: rgb(11, 11, 51);
  background-position: center;
  box-sizing: border-box;
  height: 100vh;
  width: 100vw;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
</style>
