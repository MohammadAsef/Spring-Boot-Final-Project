<template>
  <div class="card4">
    <h1>صندوق پول</h1>
    <table>
      <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Points</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Points</th>
      </tr>
      <tr>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Lois</td>
        <td>Griffin</td>
        <td>$150</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Joe</td>
        <td>Swanson</td>
        <td>$300</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Cleveland</td>
        <td>Brown</td>
        <td>$250</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Lois</td>
        <td>Griffin</td>
        <td>$150</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Joe</td>
        <td>Swanson</td>
        <td>$300</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Cleveland</td>
        <td>Brown</td>
        <td>$250</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Lois</td>
        <td>Griffin</td>
        <td>$150</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Joe</td>
        <td>Swanson</td>
        <td>$300</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Joe</td>
        <td>Swanson</td>
        <td>$300</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Joe</td>
        <td>Swanson</td>
        <td>$300</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
      <tr>
        <td>Joe</td>
        <td>Swanson</td>
        <td>$300</td>
        <td>Peter</td>
        <td>Griffin</td>
        <td>$100</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {};
</script>

<style>
.card4 {
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
  animation-name: example3;
  animation-duration: 0.3s;
  animation-timing-function: linear;
  /* animation-delay: 2s; */
  /* animation-iteration-count: infinite; */
}

@keyframes example3 {
  0% {
    width: 0vw;
    height: 8.7vh;
    margin-left: 100vw;
    margin-top: 49.5vh;
    /* border-top: red; */
    /* left: 10px; */
    /* top: 40px; */
  }
  20% {
    width: 10vw;
    height: 8.7vh;
    margin-left: 50vw;
    margin-top: 49.5vh;
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
    margin-top: 49.5vh;
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
    margin-top: 49.5vh;
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
    margin-top: 49.5vh;
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
