import axiosClient from "./axiosClient";

export default {
  addCustomer(customer) {
    return axiosClient.post("/customer/add", customer);
  },

  getAllCustomers() {
    return axiosClient.get("/customer/all");
  },

  deleteById(customerId) {
    return axiosClient.delete(`/customer/${customerId}/delete`);
  },

  getById(customerId) {
    return axiosClient.get(`/customer/${customerId}`);
  },

  updateCustomer(customer) {
    return axiosClient.put("/customer/update", customer);
  }
};
