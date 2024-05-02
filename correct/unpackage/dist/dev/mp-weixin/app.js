"use strict";
Object.defineProperty(exports, Symbol.toStringTag, { value: "Module" });
const common_vendor = require("./common/vendor.js");
if (!Math) {
  "./pages/frb/homepage.js";
  "./pages/test/test.js";
  "./pages/frb/myself.js";
  "./pages/frb/name.js";
  "./pages/frb/school.js";
  "./pages/frb/grade.js";
  "./pages/frb/icon.js";
  "./pages/frb/calendar.js";
}
const _sfc_main = {
  onLaunch: function() {
    console.log("App Launch");
  },
  onShow: function() {
    console.log("App Show");
  },
  onHide: function() {
    console.log("App Hide");
  }
};
const App = /* @__PURE__ */ common_vendor._export_sfc(_sfc_main, [["__file", "/Users/a111111/Desktop/软件工程/App.vue"]]);
function createApp() {
  const app = common_vendor.createSSRApp(App);
  return {
    app
  };
}
createApp().app.mount("#app");
exports.createApp = createApp;
