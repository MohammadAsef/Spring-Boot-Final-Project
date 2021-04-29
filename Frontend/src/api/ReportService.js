import axiosClient from "./axiosClient";

export default {
  getAllBuyFactors() {
    return axiosClient.get("/buyFactor/all");
  },
  getAllSaleFactors() {
    return axiosClient.get("/saleFactor/all");
  },
  getAllStock() {
    return axiosClient.get("/stock/all");
    },
  getAllCustomers() {
    return axiosClient.get("/customer/all");
  },
};
