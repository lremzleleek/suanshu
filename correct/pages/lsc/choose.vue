<template>
		<!--0~5 的认识和加减法-->
	<view class="unit">
		<image src="../../static/旗子.png"></image>
		<text>1~5 的认识和加减法</text>
	</view>
	<!-- <ul class="listall">
	<li class="choice" v-for="(item,index) in questions">
		
		<text class="intro">{{item}}</text>
		<text class="ex_intro">例题：5 〇 4</text>
		<text class="ex_intro" style="margin-left: 250rpx;">已练：4次</text>
		<view class="circle">
			<image src="../../static/三角形.png"></image>
		</view>
		
	</li>
	
	</ul> -->

<view  class="outercontainer" >
	<uni-collapse :item-style="itemStyle" v-for="(item,index) in questions" class="out">
				
				<uni-collapse-item :title="item" >
					
					<view class="" style="display: flex; align-items: center;border-radius: 15px">
		&nbsp;&nbsp;&nbsp;&nbsp;
						<font style="font-size: 15px;" > 题目数量</font>
						<uni-data-select style="width: 300px; margin-left: 30px;height: 70px; border-radius: 3px; font-size: 30px;"
						      v-model="value"
						      :localdata="range"
						      @change="change"
						    ></uni-data-select>
						</view>
						<br />
						<br />
					<view class="" style="display: flex;">
						<div class="choice">打印题目</div> <div class="choice plus" @click="start">开始练习</div>
					</view>
				</uni-collapse-item>
				
				
			</uni-collapse>
</view>

	<view style="height: 100rpx;"></view>
</template>

<script>
	export default{
		mounted(){
			console.log(this.questions)
		},
		methods:{
			start(){
				if(this.kind==0){
					uni.navigateTo({
						url:"/pages/lsc/compare"
					})
				}
				if(this.kind==1){
					uni.navigateTo({
						url:"/pages/lsc/colomn_cal"
					})
				}
				if(this.kind==2){
					uni.navigateTo({
						url:"/pages/lsc/row_cal"
					})
				}
			}
		},
		data(){
			return{
				kind:1,
				stage:0,
				itemStyle:{
					fontsize:"110px"
				},
				range:[
				        { value: 0, text: "10" },
				        { value: 1, text: "20" },
				        { value: 2, text: "30" },
						
				      ],
			
				dis:[["5比大小"
					,"5加法"
					,"5减法"
					,"0加减"
					,"10比大小"
					,"10加法"
					,"10减法"
					,"10加减"
					,"10连加减"
					,"10进位加法"
					,"20加减"
					,"20比大小"
					,"20加减法比大小"
					],
					["100比大小"
,"整十数加减"
,"两位数加整十数"
,"两位数加一位数"
,"两位数加一位数（进位）"
,"两位数减一位数"
,"两位数减一位数（退位）"
,"两位数加减一位数混合"
,"100以内加减法比大小"
],
["100不进位加法"
,"100不退位减法"
,"100进位加法"
,"100退位减法"
,"100连加减"
,"2-5乘法"
,"10乘法"
,"乘法加减法混合"
],
["表内除法"
,"100加减混合运算（无括号）"
,"100加减混合运算（有括号）"
,"100乘除混合运算（无括号）"
,"100乘除混合运算（有括号）"
,"两级混合运算"
],
["两位数加两位数"
,"两位数减两位数"
,"末尾有0的三位数加法"
,"末尾有0的三位数减法"
,"三位数不进位加法"
,"三位数进位加法"
,"三位数不退位减法"
,"三位数退位减法"
,"整十、整百乘法"
,"末尾有0的三位数乘一位数"
,"中间有0的三位数乘一位数"
,"两位数乘一位数（不进位）"
,"两位数乘一位数（进位）"
,"多位数乘一位数"
,"分数比大小"
,"分数加减"
,"分数加减法比大小"
],
[
	"两位数除以一位数"
	,"末尾有0的三位数除以一位数"
	,"三位数除以一位数"
	,"商中间有0的除法"
	,"商尾数有0的除法"
	,"除数为一位数"
	,"一位小数比大小"

]
			]	
			}
		},
		computed:{
			questions:{
				get: function(){
					return this.dis[5]
				}
				
			}
			
		}
	}
</script>

<style>
	*{
		padding: 0px;
		margin: 0px;
	}
	.uni-collapse-cell__title {
	                padding: 0;
					
	                margin-bottom: 30rpx;
	            }
	.out{
		border: 3px solid #ffd700;
		border-radius: 15px;
		margin: 5px;
		padding: 10px;
	}
	.outercontainer{
		width: 90%;
		height: 200px;
		margin-left: 2%;
		overflow: visible
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
		display: flex;
		align-items: center;
		justify-content: center;
		position: relative;
		top: -20px;
		width: 40%;
		height: 90rpx;
		margin: 10px auto;
		border: 2px solid  #ffd700;
		border-radius: 35rpx;
	}
	.plus{
		background-color: #ffd700;
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