import axios from "axios";
const axiosClient = axios.create({
    baseURL: "http://localhost:3000/api"
})

  export default{

      register(user){
         return axiosClient.post("/register", user)
        },

        addAuthorizationHeader(token){
         axiosClient.defaults.headers.common['Authorization'] = `Bearer ${token}`;
         console.log(token);

      }

   }





   