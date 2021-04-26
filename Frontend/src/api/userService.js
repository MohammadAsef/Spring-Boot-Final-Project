import axiosClient from "./axiosClient";


  export default{

      register(user){
         return axiosClient.post("/register", user)
        },

        addAuthorizationHeader(token){
         axiosClient.defaults.headers.common['Authorization'] = `Bearer ${token}`;
         console.log(token);

      }

   }





   