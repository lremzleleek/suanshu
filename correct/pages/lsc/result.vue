<template>	
	<ul class="overall">
		<li class="pic">
		</li>
		<li class="comment">
			<text>太棒了，<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;全对！</text>
		</li>
	</ul>
	
	
	<view class="statistics">
		<view class="sta_title">
			<image src="../../static/report.png"></image>
			<text>做题数据</text>
			</view>
		<ul class="sta_box">
			<li class="sta_list">
				<text style="color: #ffbc15">答对</text>
				<text style="font-size: 30rpx;">9/10题</text>
			</li>
			<li class="sta_list">
				<text style="color: #ffbc15">用时</text>
				<text style="font-size: 30rpx;">50秒</text>
			</li>
			<li class="sta_list">
				<text  style="color: #ffbc15">正确率</text>
				<text style="font-size: 30rpx;">90%</text>
			</li>
		</ul>
	</view>
	
	<view class="answer_box">
		<view class="sta_title">
			<image src="../../static/answer.png"></image>
			<text>答案总览</text>
			</view>
		<ul class="answer_box_row">
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第1题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第2题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/wrong.png"></image>
				<text>第3题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第4题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第5题</text>
			</li>
		</ul>
		<ul class="answer_box_row">
			<li class="answer_box_colomn">
				<image src="../../static/wrong.png"></image>
				<text>第6题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第7题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第8题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第9题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第10题</text>
			</li>
		</ul>
		<ul class="answer_box_row">
			<li class="answer_box_colomn">
				<image src="../../static/wrong.png"></image>
				<text>第6题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第7题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第8题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第9题</text>
			</li>
			<li class="answer_box_colomn">
				<image src="../../static/right.png"></image>
				<text>第10题</text>
			</li>
			
		</ul>
	</view>
	
	<view class="check_box">
		<view class="sta_title">
			<image src="../../static/check.png"></image>
			<text>答案详情</text>
			</view>
		<view class="check_box_list">
			<view class="check_ques">
				4 + 1 = ？
			</view>
			<view class="check_answer">
				<text style="color: #d81e06;">你的答案：6</text>
				<text  style="color: green;">正确答案：5</text>
			</view>
		</view>
		<view class="check_box_list">
			<view class="check_ques">
				4 〇 5
			</view>
			<view class="check_answer">
				<text style="color: #d81e06;">你的答案：&gt;</text>
				<text  style="color: green;">正确答案：&lt;</text>
			</view>
		</view>
		<view class="check_box_list">
			<view class="check_ques">
				4 〇 1 = 3
			</view>
			<view class="check_answer">
				<text style="color: #d81e06;">你的答案：＋</text>
				<text  style="color: green;">正确答案：－</text>
			</view>
		</view>
	</view>
	
	<ul class="result_bottom">
		<li class="result_bottom_button rbb_left">休息一下</li>
		<li class="result_bottom_button rbb_right">再学一次</li>
	</ul>
	<view style="height: 30rpx;"></view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello',
				gettime:''
			}
		},
		onLoad() {
	
		
		
		},
		methods: {
		
		
		}
	}
</script>

<style>
	*{
		padding: 0px;
		margin: 0px;
	}
	body{
		background-color: #ffbc15;
	}
	.overall{
		width: 100%;
		height:300rpx;
		background-color: #ffbc15;
		display: flex;
		justify-content: center;
		align-items: center;
		list-style: none;
		overflow: hidden;
	}
	.pic{
		width:40%;
		height: 300rpx;
		box-sizing: border-box;
		background-image: url(../../static/trophy.png);
		background-repeat: no-repeat;
		background-size: 130%;
		background-position:top;
	}
	.comment{
		width: 60%;
		height: 300rpx;
		box-sizing: border-box;
	/* 	border:1px solid salmon; */
		display: flex;
		justify-content: center;
		align-items: center;
		font-size: 90rpx;
		font-weight: bold;
		color: #ff5906;
		transform: rotate(-15deg);
		
	}
	.statistics{
		width: 95%;
		height:240rpx;
		border-radius: 30rpx;
		background-color: #feea99;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		list-style: none;
		margin: 0px auto;
		overflow: hidden;
	}
	.sta_title{
		width: 100%;
		height:70rpx;
		/* border: 1px solid red; */
		padding-left: 20rpx;
		margin: 0px auto;
		box-sizing: border-box;
		display: flex;
		align-items: center;
	}
	.sta_title image{
		height: 45rpx;
		width: 45rpx;
	}
	.sta_title text{
		padding-left: 10rpx;
		font-size: 30rpx;
		letter-spacing: 3rpx;
		font-weight: bold;
		color: #ffbc15;
	}
	.sta_box{
		width: 100%;
		height: 150rpx;
/* 		border: 1px solid saddlebrown; */
		display: flex;
		justify-content: space-between;
		align-items: center;
		list-style: none;
	}
	.sta_list{
		flex:1;
		height: 100%;
/* 		border: 1px solid red; */
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	.sta_list text{
		font-weight: bold;
	}
	
	.answer_box{
		width: 95%;
		height:auto;
		border-radius: 30rpx;
		background-color: #feea99;
		list-style: none;
		margin:20px auto;
		overflow: hidden;
		padding-top: 10rpx;
		padding-bottom: 30rpx;
	}
	.answer_box_row{
		width: 100%;
		height: 120rpx;
		/* border: 1px solid salmon; */
		box-sizing: border-box;
		display: flex;
		justify-content: center;
		align-items: center;
		list-style: none;
	}
	.answer_box_colomn{
		flex: 1;
		height: 120rpx;
		/* border: 1px solid blue; */
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	.answer_box_colomn image{
		width: 60rpx;
		height: 60rpx;
	}
	
	.check_box{
		width: 95%;
		height:auto;
		border-radius: 30rpx;
		background-color: #feea99;
		list-style: none;
		margin:20px auto;
		overflow: hidden;
		padding-top: 10rpx;
		padding-bottom: 30rpx;
	}
	.check_box_list{
		width: 95%;
		margin: 5px auto;
		border: 2px solid #ffbc15;
		height: 120rpx;
		display: flex;
		border-radius: 30rpx;
		justify-content: center;
		align-items: center;
		background-color: #fff4c6;
	}
	.check_ques{
		flex: 6;
		height: 120rpx;
		display: flex;
		justify-content: center;
		align-items: center;
		font-size: 50rpx;
	}
	.check_answer{
		flex:4;
		height: 120rpx;
		display: flex;
		justify-content: space-evenly;
		align-items: right;
		flex-direction: column;
	}
	.check_answer text{
		font-size: 30rpx;
	}
	.result_bottom{
		width: 90%;
		height: 60rpx;

		margin: 10rpx auto;
		display: flex;
		justify-content: space-evenly;
		align-items: center;
		list-style: none;
	}
	.result_bottom_button{
		width: 30%;
		height: 60rpx;
		border-radius: 25rpx;
		display: flex;
		justify-content: center;
		align-items: center;
		font-size: 27rpx;
	}
	.rbb_left{
		background-color: #fffae4;
		border: 1px solid #feea99;
	}
	.rbb_right{
		background-color:#feea99;
	}
</style>