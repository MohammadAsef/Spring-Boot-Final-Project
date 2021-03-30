<template>
  <div class="card5"><h1>گذارش</h1></div>
</template>

<script>
export default {};
</script>

<style>
.card5 {
  width: 75vw;
  height: 81vh;
  margin-top: 13.4vh;
  border-radius: 10px;
  border: 1px solid red;
  background: rgb(0, 0, 0, 0.5);
  margin-right: 20.7vw;
  position: fixed;
  color: white;
  display: flex;
  flex-direction: column;
  align-items: center;
  overflow: auto;
  animation-name: example4;
  animation-duration: 0.3s;
  animation-timing-function: linear;
}

@keyframes example4 {
  0% {
    width: 0vw;
    height: 8.7vh;
    margin-left: 100vw;
    margin-top: 61.4vh;
  }
  20% {
    width: 10vw;
    height: 8.7vh;
    margin-left: 50vw;
    margin-top: 61.4vh;
  }
  40% {
    width: 30vw;
    height: 8.7vh;
    margin-left: 25vw;
    margin-top: 61.4vh;
  }
  60% {
    width: 50vw;
    height: 8.7vh;
    margin-left: 10vw;
    margin-top: 61.4vh;
  }
  80% {
    width: 75vw;
    height: 8.7vh;
    margin-left: 0vw;
    margin-top: 61.4vh;
  }

  100% {
    width: 75vw;
    height: 81vh;
    margin-left: 0vw;
  }
}

.card h1 {
  text-align: left;
}
</style>
