import axiosClient from "./axiosClient";

export default {
  addBuyFactor(buyFactor) {
    return axiosClient.post("/buyFactor/add", buyFactor);
  },

  getAllBuyFactors() {
    return axiosClient.get("/buyFactor/all");
  },

  deleteById(buyFactorId) {
    return axiosClient.delete(`/buyFactor/${buyFactorId}/delete`);
  },

  getById(buyFactor) {
    return axiosClient.get(`/buyFactor/${buyFactor}`);
  },

  updateBuyFactor(buyFactor) {
    return axiosClient.put("/buyFactor/update", buyFactor);
    },
   DeleteBuyFactor(buyFactorId) {
    return axiosClient.get(`/buyFactor/${buyFactorId}/delete`);
  }
};