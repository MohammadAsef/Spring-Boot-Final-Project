<template>
  <div>
    <form class="form3" action="">
      <div class="row3">
        <input
          class="input3"
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

        <input class="input3" placeholder="مدل" />
      </div>
      <div class="row3">
        <input class="input3" placeholder="مقدار" />
        <input class="input3" placeholder="شرکت" />
      </div>

      <div class="row3">
        <input class="input3" placeholder="قیمت" />
        <input class="input3" placeholder="خریدار" />
      </div>
      <div class="row3">
        <input class="input3" type="date" />
        <input class="input3" list="brows" name="brows" placeholder="گدام" />
        <datalist id="brows">
          <option value="گدام شماره 1"> </option>
          <option value="گدام شماره 2"> </option>
          <option value="گدام شماره 3"> </option>
        </datalist>
      </div>

      <div class="row3button">
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
.form3 {
  /* border: rgb(255, 255, 255) 1px solid; */
  border-radius: 25px;
  /* background: rgb(236, 232, 232); */
  width: 70vw;
  margin-top: 25px;
  height: 74.6vh;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.row3 {
  display: flex;
  justify-content: space-around;
  /* border: rgb(255, 240, 240) 1px solid; */
  width: 60vw;
  height: 10vh;
  margin-top: 19px;
}

.row3button {
  display: flex;
  justify-content: flex-end;
  /* border: rgb(255, 240, 240) 1px solid; */
  width: 60vw;
  height: 10vh;
  margin-top: 19px;
}

.input3 {
  border: rgb(255, 255, 255) 1px solid;
  width: 20vw;
  height: 45px;
  padding: 4px 3px;
  border-radius: 8px;
  margin: 13px;
  color: white;
}

.button3 {
  /* border: rgb(255, 255, 255) 1px solid; */
  width: 5vw;
  padding: 0px 2px;
  height: 44px;
  background: rgb(180, 7, 7);
  border-radius: 10px;
  margin-bottom: 14px;
  margin-left: 80px;
}

.button3:focus {
  outline: none;
}

.button3:hover {
  background: rgb(114, 8, 8);
}
</style>
