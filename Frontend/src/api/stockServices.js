import axiosClient from "./axiosClient";

export default {
    getAllStocks() {
        return axiosClient.get("/stock/all");
    },

    getById(stockId) {
      return axiosClient.get(`/stock/${stockId}`);
    },

}