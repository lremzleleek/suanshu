<template>
	<ul class="top">
	<li class="combo">COMBO <text style="font-size: 40rpx;">1</text></li>
	<li class="ques_num_box">
		<text class="ques_num">第一关</text>
		</li>
	<li class="timer">
		<image src="../../static/闹钟.png"></image>
		<text>05:00</text>
		</li>
	</ul>
	
	<view class="current_ques">
		10 - 9 = {{result}}
	</view>

	<view class="cal_n_right">
	<ul class="calculator">
		<li class="row">
			<li class="num_button" @click="click7">7</li>
			<li class="num_button" @click="click8">8</li>
			<li class="num_button" @click="click9">9</li>
			<li class="sym_button">＋</li>
		</li>
		<li class="row">
			<li class="num_button" @click="click4">4</li>
			<li class="num_button" @click="click5">5</li>
			<li class="num_button" @click="click6">6</li>
			<li class="sym_button">－</li>
		</li>
		<li class="row">
			<li class="num_button" @click="click1">1</li>
			<li class="num_button" @click="click2">2</li>
			<li class="num_button" @click="click3">3</li>
			<li class="sym_button">×</li>
		</li>
		<li class="row">
			<li class="sym_button" @click="clickd">·</li>
			<li class="sym_button" @click="dele">←</li>
			<li class="num_button" @click="click0">0</li>
			<li class="sym_button">÷</li>
		</li>
	</ul>
	<ul class="right">
		<li class="right_button">提示</li>
		<li class="right_button">确定</li>
	</ul>
	</view>
	
	<view class="game"></view>
	
</template>

<script>
	export default{
		data(){
			return{
				result:"2"
			}
		},
		methods:{
			dele(){
				 this.result=this.result.slice(0,-1)
			},
			clickd(){
				this.result=this.result+"."
			},
			click0(){
				this.result=this.result+"0"
			},
			click1(){
				this.result=this.result+"1"
			},
			click2(){
				this.result=this.result+"2"
			},
			click3(){
				this.result=this.result+"3"
			},
			
			click4(){
				this.result=this.result+"4"
			},
			click5(){
				this.result=this.result+"5"
			}
			,
			click6(){
				this.result=this.result+"6"
			}
			,
			click7(){
				this.result=this.result+"7"
			}
			,
			click8(){
				this.result=this.result+"8"
			}
			,
			click9(){
				this.result=this.result+"9"
			}
		}
	}
</script>

<style>
	*{
		padding: 0px;
		margin: 0px;
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