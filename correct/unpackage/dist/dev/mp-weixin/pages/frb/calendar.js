"use strict";
const common_vendor = require("../../common/vendor.js");
const _sfc_main = {
  data() {
    return {
      days: [],
      //日历
      SignUp: [1, 10],
      //已经订餐
      cur_year: 0,
      //当前选的年
      cur_month: 0,
      //当前选的月
      today: parseInt((/* @__PURE__ */ new Date()).getDate()),
      //今天
      toMonth: parseInt((/* @__PURE__ */ new Date()).getMonth() + 1),
      //本月
      toYear: parseInt((/* @__PURE__ */ new Date()).getFullYear()),
      //本年
      weeks_ch: ["日", "一", "二", "三", "四", "五", "六"]
    };
  },
  props: {
    //年
    sendYear: {
      type: Number,
      default: (/* @__PURE__ */ new Date()).getFullYear()
    },
    //月
    sendMonth: {
      type: Number,
      default: (/* @__PURE__ */ new Date()).getMonth() + 1
    }
  },
  created() {
    this.cur_year = this.sendYear;
    this.cur_month = this.sendMonth;
    this.calculateEmptyGrids(this.cur_year, this.cur_month);
    this.calculateDays(this.cur_year, this.cur_month);
    this.onJudgeSign(this.SignUp);
  },
  methods: {
    // 获取当月共多少天
    getThisMonthDays(year, month) {
      return new Date(year, month, 0).getDate();
    },
    // 获取当月第一天星期几
    getFirstDayOfWeek(year, month) {
      return new Date(Date.UTC(year, month - 1, 1)).getDay();
    },
    // 计算当月1号前空了几个格子，把它填充在days数组的前面
    calculateEmptyGrids(year, month) {
      this.days = [];
      const firstDayOfWeek = this.getFirstDayOfWeek(year, month);
      if (firstDayOfWeek > 0) {
        for (let i = 0; i < firstDayOfWeek; i++) {
          var obj = {
            date: null,
            isSign: false
          };
          this.days.push(obj);
        }
      }
    },
    // 绘制当月天数占的格子，并把它放到days数组中
    calculateDays(year, month) {
      const thisMonthDays = this.getThisMonthDays(year, month);
      for (let i = 1; i <= thisMonthDays; i++) {
        var obj = {
          date: i,
          isSign: false
        };
        this.days.push(obj);
      }
    },
    //匹配判断当月与当月哪些日子订餐
    onJudgeSign(date) {
      var signs = date;
      var daysArr = this.days;
      for (var i = 0; i < signs.length; i++) {
        for (var j = 0; j < daysArr.length; j++) {
          if (daysArr[j].date == signs[i]) {
            daysArr[j].isSign = 2;
          }
        }
      }
      this.days = daysArr;
    },
    // 切换控制年月，上一个月，下一个月
    handleCalendar(type) {
      const cur_year = parseInt(this.cur_year);
      const cur_month = parseInt(this.cur_month);
      var newMonth;
      var newYear = cur_year;
      if (type === 0) {
        newMonth = cur_month - 1;
        if (newMonth < 1) {
          newYear = cur_year - 1;
          newMonth = 12;
        }
      } else {
        newMonth = cur_month + 1;
        if (newMonth > 12) {
          newYear = cur_year + 1;
          newMonth = 1;
        }
      }
      this.calculateEmptyGrids(newYear, newMonth);
      this.calculateDays(newYear, newMonth);
      this.SignUp = [3, 11];
      this.onJudgeSign(this.SignUp);
      this.cur_year = newYear;
      this.cur_month = newMonth;
      this.$emit("dateChange", this.cur_year + "-" + this.cur_month);
    },
    //点击日期
    clickSignUp(t) {
      console.log(this.cur_year);
      console.log(this.cur_month);
      var t = t;
      var signs = this.SignUp;
      var daysArr = this.days;
      for (var i = 0; i < signs.length; i++) {
        for (var j = 0; j < daysArr.length; j++) {
          if (daysArr[j].date == signs[i]) {
            daysArr[j].isSign = 2;
          }
          if (t == daysArr[j].date) {
            daysArr[j].isSign = 3;
          }
          if (daysArr[j].isSign != 2 && t != daysArr[j].date) {
            daysArr[j].isSign = 1;
          }
        }
      }
      this.days = daysArr;
    }
  }
};
function _sfc_render(_ctx, _cache, $props, $setup, $data, $options) {
  return {
    a: common_vendor.o(($event) => $options.handleCalendar(0)),
    b: common_vendor.t($data.cur_year || "--"),
    c: common_vendor.t($data.cur_month || "--"),
    d: common_vendor.o(($event) => $options.handleCalendar(1)),
    e: common_vendor.f($data.weeks_ch, (item, index, i0) => {
      return {
        a: common_vendor.t(item),
        b: index
      };
    }),
    f: common_vendor.f($data.days, (item, j, i0) => {
      return common_vendor.e({
        a: item.date == void 0 || item.date == null
      }, item.date == void 0 || item.date == null ? {} : common_vendor.e({
        b: item.isSign == 2
      }, item.isSign == 2 ? {
        c: common_vendor.t(item.date)
      } : item.isSign == 3 ? {
        e: common_vendor.t(item.date)
      } : {
        f: common_vendor.t(item.date)
      }, {
        d: item.isSign == 3,
        g: common_vendor.o(($event) => $options.clickSignUp(item.date), j)
      }), {
        h: j
      });
    })
  };
}
const MiniProgramPage = /* @__PURE__ */ common_vendor._export_sfc(_sfc_main, [["render", _sfc_render], ["__file", "/Users/a111111/Desktop/软件工程/pages/frb/calendar.vue"]]);
wx.createPage(MiniProgramPage);
