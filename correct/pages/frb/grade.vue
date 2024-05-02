<template>
	<view class="above">
		<view class="one">请选择您的年级</view>
		<view class="two">便于我们为您提供最佳服务</view>
	</view>
	<view class="box">
		<view class="inner" v-for="(item,index) in dis">
			<view class="InnerBox">
				{{item}} 
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
	.InnerBox{
		height: 100px;
		width: 220px;
		background-color:#eec866;
		margin: 30px;
		border-radius: 10px;
		display: flex;
		justify-content: center;
		align-items: center;
	
	}
	.above{
		height: 180px;
		background-color: #eec866;
		
		}
		.one{
			padding: 30px;
			font-size: 40px;
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
			top:50px;
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