import axiosClient from "./axiosClient";

export default {
  addProduct(product) {
    return axiosClient.post("/product/add", product);
  },

  getAllProduct() {
    return axiosClient.get("/product/all");
  },

  deleteById(productId) {
    return axiosClient.delete(`/product/${productId}/delete`);
  },

  getById(productId) {
    return axiosClient.get(`/product/${productId}`);
  },

  updateBuyFactor(product) {
    return axiosClient.put("/product/update", product);
  }
};