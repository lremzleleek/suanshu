<template>
	<view class="above">
		<span class="name">学校:</span>
		<input type="text" placeholder="  请输入学校名"/>
	</view>
	<view class="below">
		保存
	</view>
</template>

<script>
</script>

<style>
	.above{
		display: flex;
		height: 180px;
		background-color: #eec866;
		align-items: center;
		}
		input{
			background-color: white;
			border-radius: 10px;
			height: 50px;
			width: 70%;
		}
		.name{
			padding-right: 20px ;
			padding-left: 20px;
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