<template>
	<view class="one">错题本</view>
	<view class="above">
		<p>年级</p>
		<uni-data-select
		      v-model="value"
		      :localdata="grade"
		      @change="change"
			  style="background-color: white;"
		    >
			</uni-data-select>
	<p>题型</p>
	<uni-data-select
	      v-model="value"
	      :localdata="type"
	      @change="change"
		  style="background-color: white;"
	    >
		</uni-data-select>

	<p style="font-size: 10px;">
				<button >整理</button>
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
			<uni-tr>
				<uni-td>2020-10-20</uni-td>
				<uni-td>Jeson</uni-td>
				<uni-td>北京市海淀区</uni-td>
			</uni-tr>
			<uni-tr>
				<uni-td>2020-10-21</uni-td>
				<uni-td>HanMeiMei</uni-td>
				<uni-td>北京市海淀区</uni-td>
			</uni-tr>
			<uni-tr>
				<uni-td>2020-10-22</uni-td>
				<uni-td>LiLei</uni-td>
				<uni-td>北京市海淀区</uni-td>
			</uni-tr>
			<uni-tr>
				<uni-td>2020-10-23</uni-td>
				<uni-td>Danner</uni-td>
				<uni-td>北京市海淀区</uni-td>
			</uni-tr>
		<uni-tr>
			<uni-td>2020-10-20</uni-td>
			<uni-td>Jeson</uni-td>
			<uni-td>北京市海淀区</uni-td>
		</uni-tr>
		<uni-tr>
			<uni-td>2020-10-21</uni-td>
			<uni-td>HanMeiMei</uni-td>
			<uni-td>北京市海淀区</uni-td>
			
		</uni-tr>
		<uni-tr>
			<uni-td>2020-10-22</uni-td>
			<uni-td>LiLei</uni-td>
			<uni-td>北京市海淀区</uni-td>
		</uni-tr>
		<uni-tr>
			<uni-td>2020-10-23</uni-td>
			<uni-td>Danner</uni-td>
			<uni-td>北京市海淀区</uni-td>
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
				grade:["一年级上","一年级下","二年级上","二年级下","三年级上","三年级下"],
				 value: 1,
				      grade: [
				        { value: 0, text: "一年级上" },
				        { value: 1, text: "一年级下" },
				        { value: 2, text: "二年级上" },
						{ value: 3, text: "二年级下" },
						{ value: 4, text: "三年级上" },
						{ value: 5, text: "三年级下" }
				      ],
					  type: [
					    { value: 0, text: "简单计算" },
					    { value: 1, text: "比大小" },
					    { value: 2, text: "竖式" },
					  	{ value: 3, text: "二年级下" },
					  	{ value: 4, text: "三年级上" },
					  	{ value: 5, text: "三年级下" }
					  ],
			}
		},
		onLoad() {
	
		},
		methods: {
	
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