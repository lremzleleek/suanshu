<template>
		<!--0~5 的认识和加减法-->
	<view class="unit">
		<image src="../../static/旗子.png"></image>
		<text>1~5 的认识和加减法</text>
	</view>
	<ul class="listall">
	<li class="choice">
		<text class="intro">5以内的数比大小</text>
		<text class="ex_intro">例题：5 〇 4</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：4次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
	</li>
	<li class="choice">
		<text class="intro">5以内的加法</text>
		<text class="ex_intro">例题：3+1</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：2次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
	</li>
	<li class="choice">
		<text class="intro">5以内的减法</text>
		<text class="ex_intro">例题：5-3</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：1次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
	</li>
	<li class="choice">
		<text class="intro">0的认识和加减法</text>
		<text class="ex_intro">例题：0+5</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：3次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
	</li>
	</ul>
	
	<!--6~10 的认识和加减法-->
	<view class="unit">
		<image src="../../static/旗子.png"></image>
		<text>6~10 的认识和加减法</text>
	</view>
	<ul class="listall">
	<li class="choice">
		<text class="intro">10以内的数比大小</text>
		<text class="ex_intro">例题：7 〇 4</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：4次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
	</li>
	<li class="choice">
		<text class="intro">6和7的加减法</text>
		<text class="ex_intro">例题：6+1</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：2次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
	</li>
	<li class="choice">
		<text class="intro">8和9的加减法</text>
		<text class="ex_intro">例题：8-3</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：1次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
	</li>
	<li class="choice">
		<text class="intro">10的加减法</text>
		<text class="ex_intro">例题：5+5</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：3次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
	</li>
	<li class="choice">
		<text class="intro">6~10的加减法</text>
		<text class="ex_intro">例题：10-7</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：3次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
	</li>
	<li class="choice">
		<text class="intro">连加</text>
		<text class="ex_intro">例题：1+3+5</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：1次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
	</li>
	</ul>
	<view style="height: 100rpx;"></view>
</template>

<script>
	
</script>

<style>
	*{
		padding: 0px;
		margin: 0px;
	}
	.listall{
		list-style: none;
		padding: 0rpx;
		margin: 0rpx;
/* 		border: 1px solid saddlebrown; */
		width:auto;
		height: auto;
	}
	.unit{
		box-sizing: border-box;
		width:90%;
		height:35rpx;
		margin: 30px auto;
		margin-bottom: 0px;
		
/* 		border: 1px solid red; */
	}
	.unit image{
		width: 35rpx;
		height: 35rpx;
	}
	.unit text{
		margin: 0px auto;
		font-size: 25rpx;
		/* border: 1px solid black; */
	}
	.choice{
		position: relative;
		width: 90%;
		height: 130rpx;
		margin: 10px auto;
		border: 1px solid #9A9A9A;
		border-radius: 15rpx;
	}
	.intro{
		position: absolute;
		width: auto;
		height: 50rpx;
		font-size: 45rpx;
		line-height: 50rpx;
/* 		border: 1rpx solid saddlebrown; */
		margin-top: 30rpx;
		margin-left: 30rpx;
	}
	.ex_intro{
		position: absolute;
		width: auto;
		height: 25rpx;
		font-size: 20rpx;
		line-height: 25rpx;
/* 		border: 1rpx solid saddlebrown; */
		margin-top: 90rpx;
		margin-left: 30rpx;
		color: #9A9A9A;
	}
	.circle{
		position: absolute;
		width: 45rpx;
		height: 45rpx;
		background-color:#FFDCAF ;
		border-radius: 50%;
		margin-left: 85%;
		margin-top: 35rpx;
	}
	.choice image{
		width: 30rpx;
		height: 30rpx;
		margin-top: 50%;
		margin-left: 50%;
		transform: translate(-55%,-50%) rotate(180deg);
		transform-origin:center;
	}
</style>