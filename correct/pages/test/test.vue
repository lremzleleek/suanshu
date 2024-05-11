<template>
	<view class="one">错题本</view>
	<view class="above">
		<p>年级</p>
		<uni-data-select
		      v-model="value1"
		      :localdata="grade"
		      @change="change"
			  style="background-color: white;"
		    >
			</uni-data-select>
	<p>题型</p>
	<uni-data-select
	      v-model="value2"
	      :localdata="type"
	      @change="change"
		  style="background-color: white;"
	    >
		</uni-data-select>

	<p style="font-size: 10px;">
				<button @click="changeshow">整理</button>
	</p>

		</view>
	<view class="content">
		<uni-table  stripe emptyText="暂无更多数据" >
			<!-- 表头行 -->
			<uni-tr>
				<uni-th align="center">题目内容</uni-th>
				<uni-th align="center">你的答案</uni-th>
				<uni-th align="left">正确答案</uni-th>
			</uni-tr>
			<!-- 表格数据行 -->
			
			<uni-tr  v-for="(item,index) in display">
				
				<uni-td >{{item.content}}</uni-td>
				<uni-td>{{item.youranswer}}</uni-td>
				<uni-td>{{item.rightanswer}}</uni-td>
				<uni-td v-show="show"><button style="width: 40%;" @click="dele(index)">删除</button></uni-td>
			</uni-tr>
			
		
		</uni-table>

			
		</view>
		
		
	
	<view class="below">
		错题重练
	</view>
</template>

<script>
	export default {
		data() {
			return {
				show:false,
				grade:["一年级上","一年级下","二年级上","二年级下","三年级上","三年级下"],
				 value1:null,
				 value2:null,
				      grade: [
				        { value: 0, text: "一年级上" },
				        { value: 1, text: "一年级下" },
				        { value: 2, text: "二年级上" },
						{ value: 3, text: "二年级下" },
						{ value: 4, text: "三年级上" },
						{ value: 5, text: "三年级下" },
						{value:null,text:"全部"}
				      ],
					  type: [
					    { value: 0, text: "简单计算" },
					    { value: 1, text: "比大小" },
					    { value: 2, text: "竖式" },
					  	{value:null,text:"全部"}
					  ],
					  display:[
						
					  ]
					 
			}
		},
		onLoad() {
			
			uni.request({
			  url: 'http://localhost:8080/find',
			  method: 'POST',
			  header: {
			    'content-type': 'application/json'
			  },
			  data: {
					"userId": 1234,
			       "gradeId":null,
				   "type":null
			  }, 
			  success: res => {
			    console.log(res.data)
				this.receive=res.data.data
				this.totalq=this.receive.length
				
				for(let i=0; i<this.receive.length;i++){
					let arr=Object.values(this.receive[i])
					let tep={content:"",
						  youranswer:"",
						  rightanswer:""}
						  // console.log(arr)
				if(typeof(this.receive[i].result)=="string"){
					for(let j=1; j<arr.length-3;j++){
						tep.content+=arr[j].toString()
					}
				}
				else if(this.receive[i].gradeId==4){
					for(let j=4; j<arr.length-1;j++){
						tep.content+=arr[j].toString()
					}
					
				}
				else{
					for(let j=1; j<arr.length-4;j++){
						tep.content+=arr[j].toString()
					}
					
				}
				
					// tep.content+=this.receive[i].num1.toString()
					// tep.content+="O"
					// tep.content+=this.receive[i].num2.toString()
					tep.youranswer=this.receive[i].userResult
					tep.rightanswer=this.receive[i].result
					this.display.push(tep)
					
		
				}
				console.log(this.display[0])
				
			  },
			  fail: err => {
			    console.log("fail")
			  }
			}) 
		},
		methods: {

			dele(index){
				uni.request({
				  url: 'http://localhost:8080/change',
				  method: 'POST',
				  header: {
				    'content-type': 'application/json'
				  },
				  data: {
						"userId": 1234,
						"list":[
							{
								"gradeId":this.receive[index].gradeId,
								"quesId":this.receive[index].quesId,
								"id":this.receive[index].id,
								"type":3
							}
						]
				    //    "gradeId":this.value1,
					   // "quesId":this.recieve[index].id,
					   // "type":this.value2,
					   
				  }, 
				  success: res => {
				    console.log(res.data)
					location.reload();

					// this.display=[null]
					// this.receive=res.data.data
					// this.totalq=this.receive.length
					
					// for(let i=0; i<this.receive.length;i++){
					// 	let arr=Object.values(this.receive[i])
					// 	let tep={content:"",
					// 		  youranswer:"",
					// 		  rightanswer:""}
					// 	tep.content=arr[0]
					// 	tep.youranswer=arr[1]
					// 	tep.rightanswer=arr[2]
					// 	this.display.push(tep)
						
						
					
					console.log(this.display[0])
					
				  },
				  fail: err => {
				    console.log("fail")
				  }
				}) 
			},
			changeshow(){
				this.show=!this.show
			},
			change(){
				console.log(this.value1)
				console.log(this.value2)
				uni.request({
				  url: 'http://localhost:8080/find',
				  method: 'POST',
				  header: {
				    'content-type': 'application/json'
				  },
				  data: {
						"userId": 1234,
				       "gradeId":this.value1,
					   "type":this.value2
				  }, 
				  success: res => {
					  console.log(res.data)
					  this.display=[null]
					  this.receive=res.data.data
					  this.totalq=this.receive.length
					  
					  for(let i=0; i<this.receive.length;i++){
					  	let arr=Object.values(this.receive[i])
					  	let tep={content:"",
					  		  youranswer:"",
					  		  rightanswer:""}
					  		  // console.log(arr)
					  for(let j=1; j<arr.length-3;j++){
					  	tep.content+=arr[j].toString()
					  }
					  	// tep.content+=this.receive[i].num1.toString()
					  	// tep.content+="O"
					  	// tep.content+=this.receive[i].num2.toString()
					  	tep.youranswer=this.receive[i].userResult
					  	tep.rightanswer=this.receive[i].result
					  	this.display.push(tep)
					  	
					  		
					  }
					  
					  
					  
				 //    console.log(res.data)
					
					// this.receive=res.data.data
					// this.totalq=this.receive.length
					
					// for(let i=0; i<this.receive.length;i++){
					// 	let arr=Object.values(this.receive[i])
					// 	let tep={content:"",
					// 		  youranswer:"",
					// 		  rightanswer:""}
					// 	tep.content=arr[0]
					// 	tep.youranswer=arr[1]
					// 	tep.rightanswer=arr[2]
					// 	this.display.push(tep)
						
						
					// }
					// console.log(this.display[0])
					
				  },
				  fail: err => {
				    console.log("fail")
				  }
				}) 
			}
		}
	}
</script>

<style>
	
	p{
		text-align: center;
		margin-right: 20px;
		margin-left: 20px;
		font-size: 20px;
	}
	.content{
		overflow-y: scroll;
		height: 600px;
		
	}
	.InnerBox{
		height: 80px;
		width: 150px;
		background-color:#eec866;
		margin: 30px;
		border-radius: 10px;
		display: flex;
		justify-content: center;
		align-items: center;
	
	}
	.above{
		align-items: center;
		text-align: center;
		height: 100px;
		display: flex;
		justify-content: space-between;
		background-color: #eec866
		}
		.one{
			padding: 30px;
			font-size: 40px;
			height: 30px;
			background-color: #eec866;
			text-align: center;
		}
		.two{
			padding-left: 30px ;
			font-size: 20px;
		}
		.box{
			overflow: ;
			display: flex;
			left: 10px;
			height:300px;
			width:100%;
			position: relative;
			
			flex-wrap:wrap;
			}
		.below{
			display: flex;
			position:absolute;
			left: 15%;
			top: 90%;
			justify-content: center;
			align-items: center;
			height: 50px;
			width: 70%;
			border-radius: 20px;
			background-color: #eec866;
		}
</style>