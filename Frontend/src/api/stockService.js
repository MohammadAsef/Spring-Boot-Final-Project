import axiosClient from "./axiosClient";
  

  export default{

      saveStock(stock){
         return axiosClient.post("/stock/add", stock)
        },

    getAllStocks(){
         return axiosClient.get("/stock/all")
     }

    

   }