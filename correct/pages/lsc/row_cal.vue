<template>
	<ul class="top">
	<li class="accuracy">正确率:6%</li>
	<li class="ques_num_box">
		<text class="ques_num">1/10题</text>
		</li>
	<li class="timer">
		<image src="../../static/闹钟.png"></image>
		<text>05:00</text>
		</li>
	</ul>
	
	<view class="current_ques">
		10 - 9 = ?
	</view>
	<view class="next_ques">
		10 - 9 = ?
	</view>
	
	<ul class="calculator">
		<li class="row">
			<li class="num_button">7</li>
			<li class="num_button">8</li>
			<li class="num_button">9</li>
			<li class="sym_button">＋</li>
		</li>
		<li class="row">
			<li class="num_button">4</li>
			<li class="num_button">5</li>
			<li class="num_button">6</li>
			<li class="sym_button">－</li>
		</li>
		<li class="row">
			<li class="num_button">1</li>
			<li class="num_button">2</li>
			<li class="num_button">3</li>
			<li class="sym_button">×</li>
		</li>
		<li class="row">
			<li class="sym_button">·</li>
			<li class="sym_button">←</li>
			<li class="num_button">0</li>
			<li class="sym_button">÷</li>
		</li>
	</ul>
	
	<ul class="bottom">
		<li class="bottom_button">跳过</li>
		<li class="bottom_button">提示</li>
		<li class="bottom_button">确定</li>
	</ul>
	
</template>

<script>
	
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
	.accuracy{
		height: 50rpx;
		width: 35%;
		box-sizing: border-box;
		/* border: 1px solid blue; */
		font-size: 30rpx;
		line-height: 50rpx;
		color: #81B337;
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
		height: 200rpx;
		box-sizing: border-box;
		font-size: 100rpx;
		margin-top: 40rpx;
		display: flex;
		background-color: #ffbc15;
		justify-content: center;
		align-items: center;
	}
	.next_ques{
		width: 100%;
		height: 150rpx;
		box-sizing: border-box;
		font-size: 80rpx;
		display: flex;
		justify-content: center;
		align-items: center;
		color:#9A9A9A ;
	}
	.calculator{
		width: 80%;
		height: 500rpx;
/* 		border: 1px solid seagreen; */
		box-sizing: border-box;
		margin:20rpx auto;
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
	.bottom{
		width: 90%;
		height: 50rpx;
		display: flex;
		justify-content: space-between;
		align-items: center;
		box-sizing: border-box;
		list-style: none;
		margin: 15px auto;
	}
	.bottom_button{
		width: 20%;
		box-shadow: 0px 0px 3rpx 3rpx #d5d5d5;
		box-sizing: border-box;
		border-radius: 30rpx;
		height: 50rpx;
		display: flex;
		justify-content: center;
		align-items: center;
		background-color: #fcca00;
		color: white;
		font-weight: bold;
	}
</style>