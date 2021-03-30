<template>
  <div class="card7">
    <h1>Settings</h1>
    <h4 class="textTheme">: Change theme of Application</h4>
    <div class="changeTheme">
      <label class="switch">
        <span id="clickable1" class="slider"></span>
        <span id="clickable3" class="slider2"></span>
        <span id="clickable2" @click="changeColor" class="slider3"></span>
      </label>
    </div>
  </div>
</template>

<script>
export default {
  data: function() {
    return {
      imageData: "",
      ch: true
    };
  },
  methods: {
    changeColor() {
      if (this.ch) {
        document.getElementById("clickable1").style.transform =
          "translateX(-18px)";
        document.getElementById("clickable2").style.transform =
          "translateX(-18px)";
        document.getElementById("clickable2").style.backgroundColor = "white";
        document.getElementById("clickable1").style.backgroundColor =
          "rgb(182, 169, 169)";
        document.getElementById("clickable3").style.backgroundColor =
          "rgb(182, 169, 169)";
        // document.getElementById("clickable3").border.style.color =
        //   "rgb(182, 169, 169)";
        this.ch = false;
      } else {
        document.getElementById("clickable1").style.transform =
          "translateX(1px)";
        document.getElementById("clickable2").style.transform =
          "translateX(1px)";
        document.getElementById("clickable2").style.backgroundColor =
          "rgba(3, 1, 1, 0.705)";
        document.getElementById("clickable1").style.backgroundColor =
          "rgb(137, 146, 199);";
        document.getElementById("clickable3").style.backgroundColor =
          "rgb(137, 146, 199)";
        this.ch = true;
      }
    }
  }
};
</script>

<style>
.card7 {
  width: 75vw;
  height: 80.7vh;
  margin-top: 13.4vh;
  border-radius: 10px 10px 0px 10px;
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
  animation-name: example6;
  animation-duration: 0.3s;
  animation-timing-function: linear;
  /* animation-delay: 2s; */
  /* animation-iteration-count: infinite; */
}

@keyframes example6 {
  0% {
    width: 0vw;
    height: 8.7vh;
    margin-left: 100vw;
    margin-top: 85.4vh;
  }
  20% {
    width: 10vw;
    height: 8.7vh;
    margin-left: 50vw;
    margin-top: 85.4vh;
  }
  40% {
    width: 30vw;
    height: 8.7vh;
    margin-left: 25vw;
    margin-top: 85.4vh;
  }
  60% {
    width: 50vw;
    height: 8.7vh;
    margin-left: 10vw;
    margin-top: 85.4vh;
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
    margin-top: 85.4vh;
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
    /* margin-top: 85.4vh; */
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

.changeTheme {
  left: 280px;
  position: absolute;
  top: 60px;
}

.textTheme {
  left: 40px;
  position: absolute;
  top: 60px;
}
.switch {
  display: inline-block;
  position: relative;
  width: 40px;
  height: 20px;
}

.slider {
  background-color: rgb(137, 146, 199);
  left: 25px;
  height: 19px;
  width: 19px;
  bottom: 0px;
  top: 2px;
  content: "";
  position: absolute;
  transition: 0.3s;
  border-radius: 50%;
}

.slider3 {
  background-color: rgba(3, 1, 1, 0.705);
  left: 27px;
  height: 15px;
  width: 15px;
  bottom: 0px;
  top: 4px;
  bottom: 0;
  content: "";
  cursor: pointer;
  position: absolute;
  transition: 0.3s;
  border-radius: 50%;
}
.slider2 {
  cursor: pointer;
  background-color: rgb(137, 146, 199);
  border: 1px solid rgb(137, 146, 199);
  left: 13px;
  height: 14px;
  width: 27px;
  bottom: 0px;
  top: 4.7px;
  content: "";
  position: absolute;
  transition: 0.3s;
  border-radius: 28px;
  z-index: -1;
}
</style>
