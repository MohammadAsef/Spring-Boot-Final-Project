<template>
  <div class="card8">
    <form class="form8" action="">

      <div class="row8">
        <h1>فورم ثبت کاربر جدید</h1>
      </div>

      <div class="row8">
        <input :rules ="[required]" v-model= "firstname" class="input8" placeholder="نام" />
      </div>

      <div class="row8">
        <input :rules ="[required]"  v-model="lastname" class="input8" placeholder="تخلص" />
      </div>

  <div class="row8">
        <input :rules ="[required]"  v-model="email" class="input8" placeholder="ایمیل" />
       </div>

        <div class="row8">
        <input :rules ="[required]"  v-model="username" class="input8" placeholder="نام کاربری" />
      </div>

      
        <div class="row8">
        <input :rules ="[required]"  v-model="password" class="input8" type= "password" placeholder="رمز عبور" />
      </div>

     <div class="row8button">
        <button  @click= "signup"  class="button8" type="button">ثبت</button>
      </div>

    </form>
  </div>
</template>

<script>
// import userService from '../api/userService';
export default {
  data: function() {
    return {
       firstname : null,
       lastname : null,
       email : null,
       username: null,
       password: null,
       required: value => !!value || "This field is required"
    };
  },
   methods:{
      async signup(){
          const user = {
           firstname : this.firstname,
           lastname : this.lastname,
           email : this.email,
           username : this.username,
           password : this.password,
         };
        

        this.$store.dispatch("signup", user);
      
      
     }
   }
};
</script>

<style scoped>



.card8 {
  width: 50vw;
  height: 81vh;
  margin-top: 13.5vh;
  margin-left: 0vw;
  border-radius: 10px 10px 10px 10px;
  border: 1px solid red;
  background: rgb(255, 255, 255);
  margin-right: 32.7vw;
  color: rgb(0, 0, 0);
  display: flex;
  flex-direction: column;
  align-items: center;
  overflow: auto;
  animation-name: e;
  animation-duration: 0.4s;
  animation-timing-function: linear;
}

@keyframes e {
    from {transform: scale(0.2) };
    to {transform: scale(1);}

}
.form8 {
  border-radius: 25px;
  width: 30vw;
  margin-top: 25px;
  height: auto;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.row8 {
  display: flex;
  justify-content: space-around;
  width: 30vw;
  height: 10vh;
  margin-top: 6px;
}

.row8button {
  display: flex;
  justify-content: flex-end;
  width: 30vw;
  height: 10vh;
  margin-top: 19px;
}

.form8 .input8 {
  border: rgb(0, 0, 0) 1px solid;
  width: 20vw;
  height: 45px;
  padding: 4px 3px;
  border-radius: 8px;
  margin: 13px;
  color: rgb(0, 0, 0);
}

.button8 {
  border: rgb(56, 7, 170) 1px solid;
  width: 5vw;
  padding: 0px 2px;
  height: 40px;
  background: rgb(102, 7, 180);
  border-radius: 20px;
  color: white;
}

.button8:focus {
  outline: none;
}

.button8:hover {
  background: rgb(22, 1, 27);
}
</style>
