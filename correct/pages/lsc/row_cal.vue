<template>
	<ul class="top" style="display: flex; justify-content: center;">
	<li class="accuracy">得分{{score}}</li>
	<li class="ques_num_box">
		<text class="ques_num">{{index+1}}/{{totalq}}题</text>
		</li>
	</ul>
	
	<view class="current_ques">
		{{dis1}} = {{dis}}
	</view>
	
	
	<ul class="calculator">
		<li class="row">
			<li class="num_button" @click="click7">7</li>
			<li class="num_button" @click="click8">8</li>
			<li class="num_button" @click="click9">9</li>
			
		</li>
		<li class="row">
			<li class="num_button" @click="click4">4</li>
			<li class="num_button" @click="click5">5</li>
			<li class="num_button" @click="click6">6</li>
			
		</li>
		<li class="row">
			<li class="num_button" @click="click1">1</li>
			<li class="num_button" @click="click2">2</li>
			<li class="num_button" @click="click3">3</li>
			
		</li>
		<li class="row">
			<li class="sym_button" @click="clickd">·</li>
			<li class="sym_button" @click="dele">←</li>
			<li class="num_button" @click="click0">0</li>
		
		</li>
	</ul>
	
	<ul class="bottom" >
	
		<li class="bottom_button" @click="compare">确定</li>
	</ul>
	
	
</template>

<script>
	export default {
		data() {
			return {
				dis: '?',
				dis1:"",
				discontent:[],//展现在屏幕上的第一个问题
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
		onLoad(option) {
			console.log("年级是")
			console.log(this.$route.query.grade)
			console.log(this.$route.query.id)
			console.log(this.$route.query.num)
		uni.request({
		  url: 'http://localhost:8080/exercise',
		  method: 'POST',
		  header: {
		    'content-type': 'application/json'
		  },
		  data: {
				"userId": 1234,
		       "gradeId":this.$route.query.grade,
		       "quesId":this.$route.query.id,
		       "quesNum":this.$route.query.num,
			   // "gradeId":1,
			   // "quesId":2,
			   // "quesNum":3
		  },
		  success: res => {
		    console.log(res.data)
			this.receive=res.data.data
			this.totalq=this.receive.length
			
			//把数据整理好放到本地
			for(let i=0; i<this.receive.length;i++){
				// let arr=Object.values(this.receive[i])
				let tep=""
				tep+=this.receive[i].num1.toString()
				tep+=this.receive[i].symbol1.toString()
				tep+=this.receive[i].num2.toString()
				// for(let j=1;j<arr.length-1;j++){
				// 	tep+=j.toString()
				this.discontent.push(tep)
				}
				 console.log(this.discontent)
				 this.dis1=this.discontent[this.index]
				 console.log(this.dis1)
			},
			
			fail: err => {
			  console.log("fail")
			
		  }
		 
		}) 
	
		},
		methods: {
		compare(){
			if(this.dis=='?'){
				alert("请输入答案")
			}
			else{
				
				console.log(this.answerlist)
				this.answerlist.push(this.dis)
				if(this.index>=this.totalq-1){
					
					if(this.dis==this.receive[this.index].result){
						alert("回答正确")
						this.score+=1
						this.correct.push(1)
					}
					else{
						alert("错了，正确答案是"+this.receive[this.index].result)
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
						   "userResult":this.answerlist,
						   "accuracy":this.correct,
						   "type":3
					  }, 
					  success: res => {
					    console.log(res.data)
						this.receive=res.data.data
						this.totalq=this.receive.length
						this.dis1=this.discontent[this.index]
						this.dis2=this.receive[this.index].num2
						
					  },
					  fail: err => {
					    console.log("fail")
					  }
					}) 
					alert("答题完毕")
					uni.switchTab({
						url:"/pages/frb/homepage"
					})
				};
				//这边是正常答题的时候
				this.index=this.index+1;
				
				this.dis1=this.discontent[this.index]
				
				
				
				
				console.log(this.receive[this.index-1].result)
				if(this.dis==this.receive[this.index-1].result){
					alert("回答正确")
					this.score+=1
					this.correct.push(1)
				}
				else{
					alert("错了，正确答案是"+this.receive[this.index-1].result)
					this.correct.push(0)
				}
				this.dis="?"
			}
			
		},
		dele(){
			 this.dis=this.dis.slice(0,-1)
		},
		clickd(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
			this.dis=this.dis+"."
		},
		click0(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
			this.dis=this.dis+"0"
			
		},
		click1(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
			this.dis=this.dis+"1"
		},
		click2(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
			this.dis=this.dis+"2"
		},
		click3(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
			this.dis=this.dis+"3"
		},
		
		click4(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
			this.dis=this.dis+"4"
		},
		click5(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
			this.dis=this.dis+"5"
		}
		,
		click6(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
			this.dis=this.dis+"6"
		}
		,
		click7(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
			this.dis=this.dis+"7"
		}
		,
		click8(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
			this.dis=this.dis+"8"
		}
		,
		click9(){
			if(this.dis=="?"){
				this.dis=this.dis.slice(0,-1)
			}
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
		justify-content: center;
		align-items: center;
		box-sizing: border-box;
		list-style: none;
		margin: 15px auto;
	}
	.bottom_button{
		width: 70%;
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