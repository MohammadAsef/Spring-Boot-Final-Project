import axiosClient from "./axiosClient";

export default {
  addStock(stock) {
    return axiosClient.post("/stock/add", stock);
  },

  getAllStock() {
    return axiosClient.get("/stock/all");
  },

  deleteById(stock) {
    return axiosClient.delete(`/stock/${stock}/delete`);
  },

  getById(stockID) {
    return axiosClient.get(`/stock/${stockID}`);
  },

  updateStock(stock) {
    return axiosClient.put("/stock/update", stock);
    },
   DeleteStock(stockID) {
    return axiosClient.get(`/stock/${stockID}/delete`);
  }
};