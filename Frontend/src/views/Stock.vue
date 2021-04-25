<template>
  <div class="card6">
    <h1>لیست گدام های موجود</h1>
    <table>
      <tr>
        <th>شهر</th>
        <th>ناحیه</th>
        <th>پلاک</th>
        <th>صاحب</th>
        <th>کرایه</th>
        <th>مساحت</th>
        <th>تغییرات</th>
      </tr>
      <tr v-for="stock in stocks" :key="stock.id">
            <td>{{ stock.city }}</td>
            <td>{{ stock.district }}</td>
            <td>{{ stock.no }}</td>
            <td>{{ stock.owner }}</td>
            <td>{{ stock.rent }}</td>
            <td>{{ stock.area }}</td>

            <td>
              <button >Edit </button>
              <button>  Delete  </button>
            </td>
      </tr>
 
    </table>
  </div>
</template>


<script>
import stockService from "../api/stockService";
export default {
  data() {
    return {
      stocks: [],
    };
  },

  methods: {
    async deleteStock(stockId) {
      const conf = confirm("Do you really want to delete the entity ?");
      if (conf) {
        const response = await stockService.deleteStockById(stockId);
        console.log(response.data);
        this.stocks = this.stocks.filter(stock => {
          return stock.id !== stockId;
        });
      }
    }
  },

  async mounted() {
    const response = await stockService.getAllStocks();
    this.stocks = response.data;
  }
};
</script>






<style>
.card6 {
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
  animation-name: example7;
  animation-duration: 0.3s;
  animation-timing-function: linear;
  /* animation-delay: 2s; */
  /* animation-iteration-count: infinite; */
}

@keyframes example7 {
  0% {
    width: 0vw;
    height: 8.7vh;
    margin-left: 100vw;
    margin-top: 73.4vh;
    /* border-top: red; */
    /* left: 10px; */
    /* top: 40px; */
  }
  20% {
    width: 10vw;
    height: 8.7vh;
    margin-left: 50vw;
    margin-top: 73.4vh;
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
    margin-top: 73.4vh;
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
    margin-top: 73.4vh;
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
    margin-top: 73.4vh;
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
  text-align: center;
}


table {
  border-collapse: collapse;
  width: 80%;
  margin-top: 40px;
}

th,
td {
  padding: 8px;
  text-align: center;
  /* border-left: 1px solid rgb(255, 4, 4); */
  border-bottom: 1px solid rgba(255, 255, 255, 0.4);
}

tr:hover {
  background-color: rgba(255, 255, 255, 0.5);
  color: black;
}
</style>
