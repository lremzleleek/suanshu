<template>
	<ul class="top" style="display: flex; justify-content: center;">
	<li class="accuracy">得分{{score}}</li>
	<li class="ques_num_box">
		<text class="ques_num">{{index+1}}/{{totalq}}题</text>
		</li>
	<!-- <li class="timer">
		<image src="../../static/闹钟.png"></image>
		<text>05:00</text>
		</li> -->
	</ul>
	
	<view class="current_ques">
		{{dis1}} {{dis}} {{dis2}}
	</view>
	<!-- <view class="next_ques">
		3 〇 4
	</view> -->
	
	<view class="compare_box">
		<ul class="compare_button_box">
			<li class="compare_button" @click="xiao">&lt;</li>
			<li class="compare_button" @click="deng">=</li>
			<li class="compare_button" @click="da">&gt;</li>
		</ul>
	</view>
	<ul class="bottom" style="display: flex;justify-content: center;">
		
		<li class="bottom_button" @click="compare" style="width: 400px; height: 50px;">确定</li>
	</ul>
	
</template>

<script>
	export default {
		data() {
			return {
				dis: '〇',
				dis1:'',//展现在屏幕上的第一个问题
				dis2:'',
				answerlist:[],//用户回答的结果
				correct:[],//用户的答案正确与否
				receive:[],//获取的数据
				score:0,
				content1:[],
				content2:[],
				index:0,
				totalq:3,
				
			}
		},
		onLoad() {
		uni.request({
		  url: 'http://localhost:8080/exercise',
		  method: 'POST',
		  header: {
		    'content-type': 'application/json'
		  },
		  data: {
				"userId": 1234,
		       "gradeId":1,
		       "quesId":1,
		       "quesNum":19
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
	
		},
		methods: {
		compare(){
			if(this.dis=='〇'){
				alert("请输入答案")
			}
			else{
				this.index=this.index+1;
				// this.answerlist.add("this.dis")
				console.log()
				this.dis1=this.receive[this.index-1].num1
				this.dis2=this.receive[this.index-1].num2
				if(this.index==this.totalq){
					
					// uni.navigateTo({
					// 	url:"/pages/lsc/result"
					// })
				};
				if(this.dis==this.receive[index-1].symbol){
					score+=1
					correct.add(1)
				}
				else{
					correct.add(0)
				}
			}
			
		},
		xiao(){
			this.dis='<'			
		},
	deng(){
		this.dis='='			
	},
	da(){
			this.dis='>'			
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
	.compare_box{
		width: 90%;
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
	.compare_button_box{
		width: 100%;
		height: 200rpx;
		box-sizing: border-box;
		display: flex;
		justify-content: space-between;
		align-items: center;
		list-style: none;
	}
	.compare_button{
		width: 180rpx;
		height: 180rpx;
		border-radius: 50%;
		box-sizing: border-box;
		background-color: #ffbc15;
		color: white;
		font-size: 130rpx;
		display: flex;
		justify-content: center;
		align-items: center;
		box-shadow: 0px 0px 3rpx 3rpx #d5d5d5;
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