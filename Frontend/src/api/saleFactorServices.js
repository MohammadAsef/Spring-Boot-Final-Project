import axiosClient from "./axiosClient";

export default {
  addSaleFactor(saleFactor) {
    return axiosClient.post("/saleFactor/add", saleFactor);
  },

  getAllSaleFactors() {
    return axiosClient.get("/customer/all");
  },

  deleteById(saleFactorId) {
    return axiosClient.delete(`/saleFactor/${saleFactorId}/delete`);
  },

  getById(saleFactorId) {
    return axiosClient.get(`/customer/${saleFactorId}`);
  },

  updateCustomer(saleFactor) {
    return axiosClient.put("/saleFactor/update", saleFactor);
  }
};