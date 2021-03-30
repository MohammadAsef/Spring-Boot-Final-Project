<template>
  <div class="header">
    <div class="left">
      <div class="photo">
        <div
          class="base-image-input"
          :style="{ 'background-image': `url(${imageData})` }"
          @click="chooseImage"
        >
          <span v-if="!imageData" class="placeholder"
            ><p style="font-size:10px;">chooseImage</p></span
          >
          <input
            class="file-input"
            ref="fileInput"
            type="file"
            @input="onSelectFile"
          />
        </div>
      </div>
      <div style="width:60%; " class="buttons dropdown">
        <button
          class="dropbtn"
          @click="SignOut"
          style="width:100%;  border-radius: 10px 0px 0px 0px;   border: rgba(255, 255, 255, 0.349) 1px solid;
 height:50%"
        >
          <div id="myDropdown" class="dropdown-content">
            <a href="#home">Home</a>
            <a href="#about">About</a>
            <a href="#contact">Contact</a>
          </div>
          SignOut
        </button>
        <button
          style="width:100%; border-radius: 0px 0px 0px 10px;   border: rgba(255, 255, 255, 0.349) 1px solid;
 height:50%"
        >
          view profile
        </button>
      </div>
    </div>
    <div class="middle">
      <!-- <input type="text" placeholder="جستجو ......" /> -->
      <h1 class="head">Inventory MS</h1>
    </div>
  </div>
</template>

<script>
window.onclick = function(event) {
  if (!event.target.matches(".dropbtn")) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains("show")) {
        openDropdown.classList.remove("show");
      }
    }
  }
};
export default {
  name: "BasicImageInput",
  data: function() {
    return {
      imageData: "",
      ch: true
    };
  },
  methods: {
    SignOut() {
      this.$emit("authenticated", false);
      this.$router.replace({ name: "login" });
    },
    chooseImage() {
      this.$refs.fileInput.click();
    },
    onSelectFile() {
      const input = this.$refs.fileInput;
      const files = input.files;
      if (files && files[0]) {
        const reader = new FileReader();
        reader.onload = e => {
          this.imageData = e.target.result;
        };
        reader.readAsDataURL(files[0]);
        this.$emit("input", files[0]);
      }
    },

    myFunction() {
      document
        .getElementsByClassName("dropdown-content")
        .classList.toggle("show");
    }
  }
};
</script>

<style>
@font-face {
  font-family: Gandome;
  src: url(./Gandom.ttf);
}
.header {
  padding: 4px;
  background: rgb(2, 1, 17);
  color: white;
  width: 100vw;
  font-family: Gandome;
  height: 14vh;
  position: fixed;
  text-align: center;
  display: flex;
  z-index: 1;
}

.left {
  width: 17vw;
  background: rgb(2, 1, 17);
  border-radius: 15px;
  border: rgba(255, 255, 255, 0.349) 1px solid;
  /* position: relative; */
  display: flex;
  margin-right: 3vw;
  margin-top: 1vh;
}

.photo {
  width: 40%;
  height: 100%;
  /* border: 1px solid white; */
  display: flex;
  justify-content: center;
  justify-items: center;
}

.base-image-input {
  display: block;
  width: 95px;
  height: 90px;
  position: absolute;
  cursor: pointer;
  background-size: cover;
  background-position: center center;
  border-radius: 50%;
  /* border: 1px solid #146fc9; */
}
.placeholder {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center center;
  /* border: 1px solid #117ae2; */
  background-color: rgba(226, 200, 200, 0.288);
  border-radius: 50%;
}

.file-input {
  display: none;
}
.middle {
  width: 74.5vw;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  /* background: red; */
  /* border: rgb(255, 255, 255) 1px solid; */
}
input[type="text"] {
  float: right;
  padding: 6px;
  height: 100%;
  margin-left: 8px;
  /* border: 1px solid white; */
  border-radius: 10px;
  font-size: 17px;
  bottom: 0;
  width: 30%;
  background-color: rgba(0, 0, 0, 0.8);
  color: white;
}

.input:focus {
  border: none;
}

.dd {
  transition: 1s;
}

button:hover {
  background-color: rgba(255, 255, 255, 0.247);
}

button:focus {
  outline: none;
}

.dropbtn {
  padding: 5px 20px;
  border: 1px solid rgba(0, 0, 0, 0.4);
  text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.4);
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.3),
    inset 0 10px 10px rgba(255, 255, 255, 0.1);
  border-radius: 0.3em;
  background: #0184ff;
  color: white;
  float: right;
  font-weight: bold;
  cursor: pointer;
  font-size: 13px;
}

.dropbtn:hover,
.dropbtn:focus {
  background-color: #2980b9;
}

.dropdown {
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  overflow: auto;
  box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown a:hover {
  background-color: #ddd;
}

.show {
  display: block;
}
</style>
