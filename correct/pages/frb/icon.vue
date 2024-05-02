<template>
	
	<view class="above">
		
		<span class="name">修改头像</span>
		<view class="">
			<img src="../../static/logo.png" alt="" />
			
		</view>
		<view class="middle">
			<span style="color: #eec866">——</span> 备选头像框 <span style="color: #eec866">——</span>
		</view>
		<view class="box">
			<img  src="../../static/logo.png" alt="" />
			<img  src="../../static/logo.png" alt="" />
			<img  src="../../static/logo.png" alt="" />
			<img  src="../../static/logo.png" alt="" />
			<view v-for="(item,index) in dis">
				
				
					<img  src="../../static/logo.png" alt="" />
			</view>
		</view>
		

		
	</view>		 

	<view class="below">
		保存
	</view>
</template>

<script>
	export default {
		data() {
			return {
				dis:["一年级上","一年级下","二年级上","二年级下","三年级上","三年级下"]
			}
		},
		onLoad() {
	
		},
		methods: {
	
		}
	}
</script>

<style>
	.middle{
		position: relative;
		top: 70px;
		font-size: 30px
		
	}
	.box{
		overflow: ;
		display: flex;
		height:300px;
		width:100%;
		position: relative;
		top:100px;
		flex-wrap:wrap;
		
		}
	img{
		margin: 35px;
		margin-top: 0;
		position: relative;
		top: 50px;
		border-radius: 15px;
		height: 150px;
		width: 150px;
	}
	.above{
		text-align: center;
		height: 280px;
		background-color: #eec866;
		
		}

		.name{
			position: relative;
			top: 20px;
			font-size: 30px;
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