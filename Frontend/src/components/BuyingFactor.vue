<template>
  <div>
    <form class="form2" action="">
      <div class="row2">
        <input
          class="input2"
          list="browsers"
          name="browser"
          placeholder="نوعیت جنس"
        />
        <datalist id="browsers">
          <option value="یخچال"> </option>
          <option value="آبگرمکن"> </option>
          <option value="تلویزیون"> </option>
          <option value="حجاق گاز"> </option>
          <option value="لباس شویی"> </option>
        </datalist>

        <input class="input2" placeholder="مدل" />
      </div>
      <div class="row2">
        <input class="input2" placeholder="مقدار" />
        <input class="input2" placeholder="شرکت" />
      </div>

      <div class="row2">
        <input class="input2" placeholder="قیمت" />
        <input class="input2" placeholder="شرکت فروشنده" />
      </div>
      <div class="row2">
        <input class="input2" type="date" />
        <input class="input2" list="brows" name="brows" placeholder="گدام" />
        <datalist id="brows">
          <option value="گدام شماره 1"> </option>
          <option value="گدام شماره 2"> </option>
          <option value="گدام شماره 3"> </option>
        </datalist>
      </div>

      <div class="row2">
        <input class="input2" placeholder=" موقعیت" />
        <!-- <input class="input2" placeholder=" موقعیت" /> -->
      </div>

      <div class="row2button">
        <button class="button3" type="button">ذخیره</button>
      </div>
    </form>
  </div>
</template>

<script>
export default {
  data: function() {
    return {
      items: ["AB", "C", "D", "E"]
    };
  }
};
</script>

<style>
.form2 {
  /* border: rgb(255, 255, 255) 1px solid; */
  border-radius: 25px;
  /* background: rgb(236, 232, 232); */
  width: 70vw;
  margin-top: 25px;
  height: auto;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.row2 {
  display: flex;
  justify-content: space-around;
  /* border: rgb(255, 240, 240) 1px solid; */
  width: 60vw;
  height: 10vh;
  margin-top: 12px;
}

.row2button {
  display: flex;
  justify-content: flex-end;
  /* border: rgb(255, 240, 240) 1px solid; */
  width: 60vw;
  height: 10vh;
  margin-top: 19px;
}

.form2 .input2 {
  border: rgb(255, 255, 255) 1px solid;
  width: 20vw;
  height: 45px;
  padding: 4px 3px;
  border-radius: 8px;
  margin: 13px;
  color: white;
}

.button2 {
  border: rgb(255, 255, 255) 1px solid;
  width: 20vw;
  padding: 0px 2px;
  height: 40px;
  background: rgb(180, 7, 7);
  border-radius: 20px;
  /* margin-bottom: 14px; */
}

.button2:focus {
  outline: none;
}

.button2:hover {
  background: rgb(114, 8, 8);
}
</style>
