<template>
	
	<uni-calendar :lunar="true" :selected="selected" :insert="true" :start-date="'2015-1-1'" :end-date="'2090-12-31'" @change="change" @monthSwitch="monthSwitch"></uni-calendar>
	<view class="info">
		<span>
			<p>连续签到</p>
		<p><font style="color: black;font-size: 30px;">3</font>天</p>
		</span>
		<span>
			<p>累计签到</p>
			<p><font style="color: black;font-size: 30px;">3</font>天</p>
		</span>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello',
				selected:[
					{
						date:'2024-04-16', 
						info: '已签到'
					},
					{
						date:'2024-04-15', 
						info: '已签到'
					}
				]
			}
		},
		onLoad() {
		        //  进入页面获取年月
				this.year = Moment().year()
				this.month = Moment().format('MM')
		        // 获取这个月和下个月的天数
				this.daysInatMonth = this.getMonthDay(0); // 获取这个月的天数
				this.daysInNextMonth = this.getMonthDay(1); // 获取下个月的天数
				this.dataInit(this.year, this.month, this.daysInatMonth, this.daysInNextMonth)
		},
		methods: {
				
				
			}
	}
</script>

<style>
	.info{
		position: relative;
		top: 100px;
		display: flex;
		justify-content: space-between;
		height: 200px;
		border-top: 2px solid lightgray;
		padding: 50px;
	}
	span{
		color: gray;
		font-size: 20px;
		margin-left:50px ;
		margin-right: 70px;
	}
</style>