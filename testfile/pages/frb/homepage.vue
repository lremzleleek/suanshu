<template>
	<div class="main" >
		<div>
				
				<div class="above" >
				<div style="position: relative;top: 40px;">
					<img src="../../static/calendar.png" alt="" />
					
					<div style="font-size: 30px; position: relative;top: 10px;">
						<p>签到</p>
						<p style="font-size: 15px;">{{gettime}}</p>
					</div>
					
				</div>
				</div>
				
				<div class="below">
					
					<div class=" select" @click="GoToChoose">
					    <div class="horn div5">
					    做题模式
					       
					    </div>
						
					</div>
					<div class="BoxWrap select" @click="GoToGame">
					    <div class="horn div5">
					    游戏模式
						
		
					    </div>
						</div>

				</div>
			</div>
	</div>
	
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello',
				gettime:''
			}
		},
		onLoad() {
			

				    
				      let yy = new Date().getFullYear();
				      let mm = new Date().getMonth()+1;
				      let dd = new Date().getDate();
				      
				      this.gettime = yy+'-'+mm+'-'+dd;
					console.log(this.gettime)
		
		
		
		},
		methods: {
		GoToChoose(){
			uni.navigateTo(
			{
			
				url:"/pages/lsc/choose"
			}
			)
		},
		GoToGame(){
			uni.navigateTo(
			{

				url:"/pages/lsc/game"
			}
			)
		}
		}
	}
</script>

<style>
	body{/*  */
		/* background-color: blue; */
	background-image: url(../../static/cat.png)
	
	}
.div5 {
    width: 300px;
    height: 200px;
    position: relative;
	top: 0;
    /* color: #fff; */
    border: 2px solid gold;
    border-radius: 10px;
    background: #ffd700;
    transition: all .3s;
}

.div5::before {
    content: "";
    position: absolute;
    top: -10px;
    left: -10px;
    right: -10px;
    bottom: -10px;
    border: 2px solid #ffd700;
    border-radius: 10px;
    animation: div5Ani 3s infinite linear;
}

.div5::after {
    content: "";
    position: absolute;
    top: -10px;
    left: -10px;
    right: -10px;
    bottom: -10px;
    border: 2px solid #ffd700;
    border-radius: 10px;
    animation: div5Ani 3s infinite linear;

}

@keyframes div5Ani {
    0%,
    100% {
        clip-path: inset(0 0 98% 0);
    }

    25% {
        clip-path: inset(0 98% 0 0);
    }
    50% {
        clip-path: inset(98% 0 0 0);
    }
    75% {
        clip-path: inset(0 0 0 98%);
    }
}

.div5::after {
    animation: div5Ani 3s infinite -1.5s linear;
}
.BoxWrap{
        width: 1000px;
        height: 500px;
        position: relative;
      }
      .horn{
/* 		  background-color: yellow; */
        position: absolute;
        width: 100%;
        height: 100%;
        border:3px solid #eec866;
        margin: 100px;
      }
      .horn>div{
        width: 10px;
        height: 10px;
        position:absolute;
      }
      .horn .lt{
		 
        border-top: 6px solid #eec866;
        border-left: 6px solid #eec866;
        left: -6px;
        top: -6px;
      }
      .horn .rt{
        border-top: 6px solid #eec866;
        border-right: 6px solid #eec866;
        right: -6px;
        top: -6px;
      }
      .horn .rb{
        border-bottom:6px solid #eec866;
        border-right: 6px solid #eec866;
        right: -6px;
        bottom: -6px;
      }
      .horn .lb{
        border-bottom:6px solid #eec866;
        border-left: 6px solid #eec866;
        left: -6px;
        bottom: -6px;
      }


	
	img{
		height: 40px;
		width: 40px;
	}
	.above{
		display: flex;
		position: relative;
		margin: auto;
		justify-content: center;
		text-align: center;
		top: 100px;
		height: 200px;
		border: 2px solid darkblue;
		width: 200px;
		border-radius: 30px;
	}
	.below{
		display: flex;
		justify-content: center;
		vertical-align: middle;
		height: 300px;
		
	}
	.select{
		position: relative;
		left: -100px;
		top: 200px;
		margin: 50px;
		height: 100px;
		width: 200px;
		font-size: 20px ;
		margin-top: 170px;
		text-align: center;
		line-height: 100px;
		
	}
</style>
