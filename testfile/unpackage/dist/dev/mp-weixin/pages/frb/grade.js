"use strict";
const common_vendor = require("../../common/vendor.js");
const _sfc_main = {
  data() {
    return {
      dis: ["一年级上", "一年级下", "二年级上", "二年级下", "三年级上", "三年级下"]
    };
  },
  onLoad() {
  },
  methods: {}
};
function _sfc_render(_ctx, _cache, $props, $setup, $data, $options) {
  return {
    a: common_vendor.f($data.dis, (item, index, i0) => {
      return {
        a: common_vendor.t(item)
      };
    })
  };
}
const MiniProgramPage = /* @__PURE__ */ common_vendor._export_sfc(_sfc_main, [["render", _sfc_render], ["__file", "/Users/a111111/Desktop/软件工程/pages/frb/grade.vue"]]);
wx.createPage(MiniProgramPage);
