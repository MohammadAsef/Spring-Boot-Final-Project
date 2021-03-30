<template>
  <div id="app">
    <div v-if="authenticated">
      <Header @authenticated="setAuthenticated" />
      <navbar />
      <div class="view-container">
        <router-view @authenticated="setAuthenticated" />
      </div>
    </div>

    <div v-if="!authenticated">
      <div class="view-container1">
        <router-view @authenticated="setAuthenticated" />
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
  background: url("d.jpg");
}

.view-container1 {
  font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue",
    Helvetica, Arial, "Lucida Grande", sans-serif;
  color: white;
  font-size: 12px;
  background: url("a.jpg");
  background-position: center;
  box-sizing: border-box;
  height: 100vh;
  width: 100vw;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
</style>
