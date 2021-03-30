<template>
  <div>
    <nav class="nav">
      <div class="linksContainer">
        <router-link
          to="/home"
          class="link1 active"
          @click.native="addActiveClass1"
          >اجناس موجود</router-link
        >

        <router-link to="/buy" class="link2" @click.native="addActiveClass2"
          >فاکتور خرید</router-link
        >

        <router-link to="/sell" class="link3" @click.native="addActiveClass3"
          >فاکتور فروش</router-link
        >

        <router-link
          to="/moneySavings"
          class="link4"
          @click.native="addActiveClass4"
          >صندوق پول</router-link
        >

        <router-link to="/report" class="link5" @click.native="addActiveClass5"
          >گذارش</router-link
        >

        <router-link to="/stock" class="link6" @click.native="addActiveClass6"
          >سهام</router-link
        >

        <router-link
          to="/settings"
          class="link7"
          @click.native="addActiveClass7"
          >تنظیمات</router-link
        >
      </div>
    </nav>
  </div>
</template>
<script>
export default {
  methods: {
    addActiveClass1() {
      document.querySelector(".link1").classList.add("active");
      document.querySelector(".link2").classList.remove("active");
      document.querySelector(".link3").classList.remove("active");
      document.querySelector(".link4").classList.remove("active");
      document.querySelector(".link5").classList.remove("active");
      document.querySelector(".link6").classList.remove("active");
      document.querySelector(".link7").classList.remove("active");
    },
    addActiveClass2() {
      document.querySelector(".link2").classList.add("active");
      document.querySelector(".link1").classList.remove("active");
      document.querySelector(".link3").classList.remove("active");
      document.querySelector(".link4").classList.remove("active");
      document.querySelector(".link5").classList.remove("active");
      document.querySelector(".link6").classList.remove("active");
      document.querySelector(".link7").classList.remove("active");
    },

    addActiveClass3() {
      document.querySelector(".link3").classList.add("active");
      document.querySelector(".link1").classList.remove("active");
      document.querySelector(".link2").classList.remove("active");
      document.querySelector(".link4").classList.remove("active");
      document.querySelector(".link5").classList.remove("active");
      document.querySelector(".link6").classList.remove("active");
      document.querySelector(".link7").classList.remove("active");
    },

    addActiveClass4() {
      document.querySelector(".link4").classList.add("active");
      document.querySelector(".link1").classList.remove("active");
      document.querySelector(".link3").classList.remove("active");
      document.querySelector(".link2").classList.remove("active");
      document.querySelector(".link5").classList.remove("active");
      document.querySelector(".link6").classList.remove("active");
      document.querySelector(".link7").classList.remove("active");
    },

    addActiveClass5() {
      document.querySelector(".link5").classList.add("active");
      document.querySelector(".link1").classList.remove("active");
      document.querySelector(".link3").classList.remove("active");
      document.querySelector(".link4").classList.remove("active");
      document.querySelector(".link2").classList.remove("active");
      document.querySelector(".link6").classList.remove("active");
      document.querySelector(".link7").classList.remove("active");
    },

    addActiveClass6() {
      document.querySelector(".link6").classList.add("active");
      document.querySelector(".link1").classList.remove("active");
      document.querySelector(".link3").classList.remove("active");
      document.querySelector(".link4").classList.remove("active");
      document.querySelector(".link5").classList.remove("active");
      document.querySelector(".link2").classList.remove("active");
      document.querySelector(".link7").classList.remove("active");
    },

    addActiveClass7() {
      document.querySelector(".link7").classList.add("active");
      document.querySelector(".link1").classList.remove("active");
      document.querySelector(".link3").classList.remove("active");
      document.querySelector(".link4").classList.remove("active");
      document.querySelector(".link5").classList.remove("active");
      document.querySelector(".link6").classList.remove("active");
      document.querySelector(".link2").classList.remove("active");
    }
  }
};
</script>

<style>
@font-face {
  font-family: Gandome;
  src: url(./Gandom.ttf);
}

.nav {
  width: 21.5vw;
  position: fixed;
  display: flex;
  flex-direction: column;
  align-items: center;
  height: 80.5vh;
  margin-top: 16.6vh;
  margin-right: 1vw;

  /* border: rgb(255, 255, 255) 1px solid; */
}

.linksContainer {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: space-between;
  height: 100vh;
  width: 21.5vw;
  /* border: rgb(255, 255, 255) 1px solid; */
  /* overflow: auto; */
}

.nav a {
  text-decoration: none;
  display: block;
  background-color: rgba(0, 0, 0, 0.8);
  width: 18vw;
  padding: 17px 15px;
  /* margin-top: 25.4px; */
  font-size: 20px;
  border-radius: 7px;
  margin-right: 25px;
  height: auto;
  color: white;
  text-align: center;
  transition: width 0.0001s;
  /* background: rgb(43, 77, 170); */
}

.nav a:hover {
  background: red;
}

.nav a.active {
  background: red;
  width: 91.7%;
  /* margin-right: 4.4vw; */
  border-radius: 0px 15px 15px 0px;
  /* border: 2px solid red; */
}
</style>
