<template>
  <div class="card3">
    <h1>ثبت مشخصات جنس فروخته شده</h1>
    <SellingFactor />
  </div>
</template>

<script>
import SellingFactor from "../components/SellingFactor.vue";
export default {
  components: {
    SellingFactor
  }
};
</script>

<style>
.card3 {
  width: 75vw;
  height: 81vh;
  margin-top: 13.4vh;
  border-radius: 10px;
  border: 1px solid red;
  /* border-right: 18px solid red; */
  background: rgb(0, 0, 0, 0.5);
  margin-right: 20.7vw;
  /* margin-bottom: 2vh; */
  position: fixed;
  color: white;
  display: flex;
  flex-direction: column;
  align-items: center;
  overflow: auto;
  animation-name: example5;
  animation-duration: 0.3s;
  animation-timing-function: linear;
  /* animation-delay: 2s; */
  /* animation-iteration-count: infinite; */
}

@keyframes example5 {
  0% {
    width: 0vw;
    height: 8.7vh;
    margin-left: 100vw;
    margin-top: 37.5vh;
    /* border-top: red; */
    /* left: 10px; */
    /* top: 40px; */
  }
  20% {
    width: 10vw;
    height: 8.7vh;
    margin-left: 50vw;
    margin-top: 37.5vh;
    /* margin-right: 7vw; */
    /* width: 90vw;
    height: 10vh; */
    /* border-right: red; */
    /* left: 20px; */
    /* top: 0px; */
  }
  40% {
    width: 30vw;
    height: 8.7vh;
    margin-left: 25vw;
    margin-top: 37.5vh;
    /* margin-right: 14vw;
   width: 80vw;
    height: 20vh; */
    /* border-bottom: red; */
    /* left: 200px;
    top: 200px; */
  }
  60% {
    width: 50vw;
    height: 8.7vh;
    margin-left: 10vw;
    margin-top: 37.5vh;
    /* margin-right: 17vw;
        width: 80vw;
    height: 50vh; */
    /* border-left: red; */
    /* left: 0px;
    top: 200px; */
  }
  80% {
    width: 75vw;
    height: 8.7vh;
    margin-left: 0vw;
    margin-top: 37.5vh;
    /* margin-right: 20vw;
        width: 78vw;
    height: 78vh; */
    /* background-color: red; */
    /* left: 0px; */
    /* top: 0px; */
  }

  100% {
    width: 75vw;
    height: 81vh;
    margin-left: 0vw;
    /* margin-right: 20vw;
        width: 78vw;
    height: 78vh; */
    /* background-color: red; */
    /* left: 0px; */
    /* top: 0px; */
  }
}

.card h1 {
  text-align: left;
}
</style>
