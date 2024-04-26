<template>
	<view class="top-bg"></view>
	<view class="box">
	  <!-- 头像 -->
	 
	  <!-- 第一部分列表 -->
	  <view>
	    <button class="row" style="width: 100%;" bindtap="basicClick" @click="icon">
	      <view class="left" >
	        <icon class="icon-small" type="success" size="16"></icon>
	        <text class="text">头像</text>
	      </view>
	      <view class="right">》</view>
	    </button>
	    <button class="row" style="width: 100%;" bindtap="feedbackClick" @click="name">
	      <view class="left" >
	        <icon class="icon-small" type="success" size="16"></icon>
	        <text class="text">昵称</text>
	      </view>
	      <view class="right">》</view>
	    </button>
	    <button class="row" style="width: 100%;border-bottom: none;" bindtap="aboutClick" @click="grade">
	      <view class="left" >
	        <icon class="icon-small" type="success" size="16"></icon>
	        <text class="text">年级</text>
	      </view>
	      <view class="right">》</view>
	    </button>
	  </view>
	  <button open-type="share" class="row" style="width: 100%;" @click="school">
	    <view class="left" >
	      <icon class="icon-small" type="success" size="16"></icon>
	      <text class="text">学校</text>
	    </view>
	    <view class="right">》</view>
	  </button>
	  <button open-type="contact" class="row" style="width: 100%;border-bottom: none;" @click="calendar">
	    <view class="left" >
	      <icon class="icon-small" type="success" size="16"></icon>
	      <text class="text">签到天数</text>
	    </view>
	    <view class="right">》</view>
	  </button>
	  <button open-type="contact" class="row" style="width: 100%;border-bottom: none;" >
	    <view class="left" >
	      <icon class="icon-small" type="success" size="16"></icon>
	      <text class="text">打印题目</text>
	    </view>
	    <view class="right">》</view>
	  </button>
	</view>

	

</template>

<script>
export default {
		data() {
			
		},
		onLoad() {
	
		},
		methods: {
		icon(){
			console.log(1)
			uni.navigateTo({
				url:"/pages/frb/icon"
			})
		},
		name(){
			uni.navigateTo({
				url:"/pages/frb/name"
			})
		},
		school(){
			uni.navigateTo({
				url:"/pages/frb/school"
			})
		},
		grade(){
			uni.navigateTo({
				url:"/pages/frb/grade"
			})
		},
		calendar(){
			uni.navigateTo({
				url:"/pages/frb/calendar"
			})
		}
		}
	}

</script>

<style>
	page {
	  background-color: #f1f1f1;
	}
	
	/* 设置背景颜色 */
	.top-bg {
	  height: 260rpx;
	  background-color: #eec866;
	  }
	
	/* 圆角盒子 */
	.box {
	  background-color: white;
	  margin-top: -120rpx;
	  border-top-left-radius: 50rpx;
	  border-top-right-radius: 50rpx;
	  padding: 0 20rpx;
	}
	
	/* 头像部分 */
	.head-box {
	  display: flex;
	  flex-direction: column;
	  justify-content: center;
	  align-items: center;
	  border-bottom: 1rpx solid #fbdbdc;
	  padding-bottom: 20rpx;
	}
	
	
	
	.head-img {
	  width: 140rpx;
	  height: 140rpx;
	  overflow: hidden;
	  border-radius: 50%;
	  background-color: #fbdbdc;
	}
	
	.tip {
	  font-size: 26rpx;
	  color: gray;
	  margin: 15rpx 0;
	}
	
	/* 列表部分 */
	.row {
	  display: flex;
	  align-items: center;
	  padding: 36rpx 10rpx;
	  font-size: 30rpx;
	  font-weight: inherit;
	  background-color: rgba(0, 0, 0, 0);
	  border-bottom: 1rpx solid #fbdbdc;
	}
	
	.row::after {
	  border: none;
	}
	
	.text {
	  margin-left: 15rpx;
	  color: #636262;
	}
	
	.left {
	  width: 90%;
	  text-align: left;
	  display: flex;
	  align-items: center;
	}
	
	.right {
	  width: 10%;
	  text-align: right;
	  color: rgb(148, 147, 147);
	}
	
	.end {
	  background-color: white;
	  margin-top: 20rpx;
	  padding: 0 20rpx;
	}
	
	.footer {
	  display: flex;
	  justify-content: center;
	  align-items: center;
	  padding: 20rpx 0;
	  font-size: 22rpx;
	  margin: 30rpx 0;
	  color: gray;
	}

</style>