<template>
  <div>
    <form class="form10" action="">

      <div class="row10">
        <input class="input10" placeholder="شهر" v-model="city" />
        <input class="input10" placeholder="ناحیه" v-model="district" />
      </div>

      <div class="row10">
        <input class="input10" placeholder="پلاک" v-model="no" />
        <input class="input10" placeholder="صاحب" v-model="owner" />
      </div>

      <div class="row10">
        <input class="input10" placeholder="کرایه" v-model="rent" />
        <input class="input10" placeholder="مساحت " v-model="area" />
      </div>

      <div class="row10button">
        <button  @click="saveStock"  class="button10" type="button">ذخیره</button>
      </div>

      
    </form>
  </div>
</template>

<script>
import stockService from "../api/stockService";
export default {
  data: function() {
    return {
       
       city : null,
       district : null,
       no : null,
       owner : null,
       rent : null,
       area : null
    };
  },

  methods: {
      async saveStock (){
          const stock = {
              city : this.city,
              district : this.district,
              no : this.no,
              owner : this.owner,
              rent : this.rent,
              area : this.area
          };

          const savedStock =  await stockService.saveStock(stock);
          console.log(savedStock);
      }
  }
};
</script>

<style>
.form10 {
  /* border: rgb(255, 255, 255) 1px solid; */
  border-radius: 25px;
  /* background: rgb(236, 232, 232); */
  width: 70vw;
  margin-top: 25px;
  height: auto;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.row10 {
  display: flex;
  justify-content: space-around;
  /* border: rgb(255, 240, 240) 1px solid; */
  width: 60vw;
  height: 10vh;
  margin-top: 12px;
}

.row10button {
  display: flex;
  justify-content: flex-end;
  /* border: rgb(255, 240, 240) 1px solid; */
  width: 60vw;
  height: 10vh;
  margin-top: 19px;
}

.form10 .input10 {
  border: rgb(255, 255, 255) 1px solid;
  width: 20vw;
  height: 45px;
  padding: 4px 3px;
  border-radius: 8px;
  margin: 13px;
  color: white;
}

.button10 {
  border: rgb(255, 255, 255) 1px solid;
  width: 5vw;
  margin-left: 80px;
  margin-top: 10px;
  padding: 0px 2px;
  height: 40px;
  background: rgb(180, 7, 7);
  border-radius: 20px;
  /* margin-bottom: 14px; */
}

.button10:focus {
  outline: none;
}

.button10:hover {
  background: rgb(114, 8, 8);
}
</style>
