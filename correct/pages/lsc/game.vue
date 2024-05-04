<template>
	<ul class="top">
	<li class="combo">伤害::<text style="font-size: 40rpx;">{{score*10}}</text></li>
	<li class="ques_num_box">
		<text class="ques_num">第一关</text>
		</li>
	<li class="timer">
		<image src="../../static/闹钟.png"></image>
		<text>{{countdown}}</text>
		</li>
	</ul>
	
	<view class="current_ques">
		10 - 9 = {{dis}}
	</view>

	<view class="cal_n_right">
	<ul class="calculator">
		<li class="row">
			<li class="num_button" @click="click7">7</li>
			<li class="num_button" @click="click8">8</li>
			<li class="num_button" @click="click9">9</li>
			<!-- <li class="sym_button">＋</li> -->
		</li>
		<li class="row">
			<li class="num_button" @click="click4">4</li>
			<li class="num_button" @click="click5">5</li>
			<li class="num_button" @click="click6">6</li>
			<!-- <li class="sym_button">－</li> -->
		</li>
		<li class="row">
			<li class="num_button" @click="click1">1</li>
			<li class="num_button" @click="click2">2</li>
			<li class="num_button" @click="click3">3</li>
			<!-- <li class="sym_button">×</li> -->
		</li>
		<li class="row">
			<li class="sym_button" @click="clickd">·</li>
			<li class="sym_button" @click="dele">←</li>
			<li class="num_button" @click="click0">0</li>
			<!-- <li class="sym_button">÷</li> -->
		</li>
	</ul>
	<ul class="right">
		<!-- <li class="right_button">提示</li> -->
		<li class="right_button" @click="handleClick">确定</li>
	</ul>
	</view>
	
	<view class="game">
		<img src="../../static/闹钟.png" alt="???" />
		<!-- <embed src="../../static/success.MP4" height="360rpx" width="100%"/> -->
		<div :class="animate">hello world</div>
		<img src="../../static/闹钟.png" alt="???" />
		<div :class="damage">-10</div>
	</view>
	
</template>

<script>
	export default{
		data(){
			return{
				countdown:60,
				dis:"2",
				score:0,
				damage:{
					transition: true,
					before:true,
					after:false
				},
				animate: {
				        transition: true,
				        green: true,
				        pink: false,
						left:0
				      }
				    
			}
		},
		onLoad() {
			this.countdown = 10; //赋值3秒
			// const times = setInterval(() => {
			//   this.countdown--; //递减
			//   if (this.countdown === 0) {
			//     // === 0 变成获取按钮
			//     alert("答题完毕")
			//     uni.switchTab({
			//     	url:"/pages/frb/homepage"
			//     })
			//   }
			// }, 1000);
		},
		methods:{
			 compare(){
				 console.log(this.answerlist)
				 this.answerlist.push(this.dis)
				 if(this.index>=this.totalq-1){
				 	
				 	if(this.dis==this.receive[this.index].symbol1){
				 		alert("回答正确")
				 		this.score+=1
				 		this.correct.push(1)
				 	}
				 	else{
				 		alert("错了，正确答案是"+this.receive[this.index].symbol1)
				 		this.correct.push(0)
				 	}
				 	//答题完毕向后端传递数据
				 	uni.request({
				 	  url: 'http://localhost:8080/insert',
				 	  method: 'POST',
				 	  header: {
				 	    'content-type': 'application/json'
				 	  },
				 	  data: {
				 			"userId": 1234,
				 	       "gradeId":this.$route.query.grade,
				 	       "quesId":this.$route.query.id,
				 	       "list":this.receive,
				 		   "userdis":this.answerlist,
				 		   "accuracy":this.correct,
				 		   "type":3
				 	  }, 
				 	  success: res => {
				 	    console.log(res.data)
				 		this.receive=res.data.data
				 		this.totalq=this.receive.length
				 		this.dis1=this.receive[this.index].num1
				 		this.dis2=this.receive[this.index].num2
				 		console.log()
				 	  },
				 	  fail: err => {
				 	    console.log("fail")
				 	  }
				 	}) 
			 }},
			handleClick() {
			      this.animate.green = !this.animate.green
			      this.animate.pink = !this.animate.pink
				  this.damage.before=!this.damage.before
				  this.damage.after=!this.damage.after
			    },
			dele(){
				 this.dis=this.dis.slice(0,-1)
			},
			clickd(){
				this.dis=this.dis+"."
			},
			click0(){
				this.dis=this.dis+"0"
			},
			click1(){
				this.dis=this.dis+"1"
			},
			click2(){
				this.dis=this.dis+"2"
			},
			click3(){
				this.dis=this.dis+"3"
			},
			
			click4(){
				this.dis=this.dis+"4"
			},
			click5(){
				this.dis=this.dis+"5"
			}
			,
			click6(){
				this.dis=this.dis+"6"
			}
			,
			click7(){
				this.dis=this.dis+"7"
			}
			,
			click8(){
				this.dis=this.dis+"8"
			}
			,
			click9(){
				this.dis=this.dis+"9"
			}
		}
	}
</script>

<style>
	*{
		padding: 0px;
		margin: 0px;
	}
	.before{
		position: absolute;
		left: 530px;
		visibility: hidden;
	}
	.after{
		position: absolute;
		left: 530px;
		font-size: 40px;
		color: red;
	}
	.pink {
	  background-color: pink;
	  width: 100px;
	  height: 50px;
	  position: relative;
	  left: -100px;
	}
	.green {
	  background-color: yellow;
	  width: 100px;
	  height: 50px;
	   position: relative;
	  left: 100px;
	}
	.transition {
	  transition: 0.5s ease;
	}
	#box {
	   margin: 20px;
	               width: 200px;
	               height: 200px;
	               background-color: orange;
	               position: relative;
	               left: 0px;
	 
	}
	#box:hover {
	     left: 600px;
	    transition: left 5s linear 0s;
	}
	.top{
		display: flex;
		height: 50rpx;
		width: 90%;
		margin: 15rpx auto;
		box-sizing: border-box;
		list-style: none;
		/* border: 1px solid saddlebrown; */
	}
	.combo{
		height: 50rpx;
		width: 35%;
		box-sizing: border-box;
		/* border: 1px solid blue; */
		font-size:30rpx;
		line-height: 50rpx;
		color:#E99D42;
		text-align: center;
	}
	.ques_num_box{
		height: 50rpx;
		width: 30%;
		box-sizing: border-box;
		/* border: 1px solid salmon; */
		display: flex;
		justify-content: center;
		align-items: center;

	}
	.ques_num{
		border-radius: 15rpx;
		width: 70%;
		color: white;
		background-color: #FFDCAF;
		font-weight: bold;
		text-align: center;
		box-shadow: 0rpx 0rpx 10rpx 1rpx #ffad4e;
	}
	.timer{
		height: 50rpx;
		width: 35%;
		box-sizing: border-box;
		/* border: 1px solid salmon; */
		display: flex;
		justify-content: center;
		align-items: center;
	}
	.timer image{
		width: 45rpx;
		height: 45rpx;
	}
	.current_ques{
		width: 100%;
		height: 170rpx;
		box-sizing: border-box;
		font-size: 90rpx;
		margin-top: 10rpx;
		display: flex;
		background-color: #ffbc15;
		justify-content: center;
		align-items: center;
	}
	.right{
		width: 20%;
		height: 500rpx;
		/* border: 1px solid saddlebrown; */
		display: flex;
		flex-direction: column;
		justify-content: space-evenly;
		align-items: center;
	}
	.cal_n_right{
		width: 100%;
		height: 500rpx;
		/* border: 1px solid slateblue; */
		box-sizing: border-box;
		display: flex;
		justify-content: space-evenly;
		align-items: center;
		transform: scale(0.9);
		margin-top: -20rpx;
	}
	.right_button{
		width:130rpx;
		box-shadow: 0px 0px 3rpx 3rpx #d5d5d5;
		box-sizing: border-box;
		border-radius:30rpx;
		height: 130rpx;
		display: flex;
		font-size: 35rpx;
		justify-content: center;
		align-items: center;
		background-color: #fcca00;
		color: white;
		font-weight: bold;
	}
	
	.game{
		display: flex;
		justify-content: space-between;
		width: 100%;
		height: 360rpx;
		border: 1px solid red;
		margin: -20rpx auto;
	}
	
	
	.calculator{
		width: 80%;
		height: 500rpx;
		/* border: 1px solid seagreen; */
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		list-style: none;
	}
	.row{
		width: 100%;
		flex:1;
/* 		border: 1px solid red; */
		box-sizing: border-box;	
		display: flex;
		justify-content: space-evenly;
		align-items: center;
	}
	.num_button{
		width: 100rpx;
		height:100rpx;
		background-color: #fcca00;
		border-radius: 50%;
		display: flex;
		justify-content: center;
		align-items: center;
		font-size: 40rpx;
		font-weight: bold;
	}
	.sym_button{
		width: 100rpx;
		height:100rpx;
		display: flex;
		justify-content: center;
		align-items: center;
		color: white;
		font-size: 40rpx;
		font-weight: bold;
		border-radius: 15rpx;
		transform: scale(0.9);
		background-color: #ffbf6b;
	}
	 
	
</style>