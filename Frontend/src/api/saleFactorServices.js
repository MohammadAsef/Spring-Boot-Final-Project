import axiosClient from "./axiosClient";

export default {
  addSaleFactor(saleFactor) {
    return axiosClient.post("/saleFactor/add", saleFactor);
  },

  getAllSaleFactors() {
    return axiosClient.get("/saleFactor/all");
  },

  deleteById(saleFactorId) {
    return axiosClient.delete(`/saleFactor/${saleFactorId}/delete`);
  },

  getById(saleFactorId) {
    return axiosClient.get(`/saleFactor/${saleFactorId}`);
  },

  updateSaleFactor(saleFactor) {
    return axiosClient.put("/saleFactor/update", saleFactor);
  }
};