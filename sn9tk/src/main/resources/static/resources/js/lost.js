"use strict"
var lost = lost|| {}
lost = (()=>{
	const WHEN_ERROR = `호출하는 js파일을 찾지 못했습니다.`
	let lost_vue
	let init= () => {
		lost_vue= `/resources/vue/lost_vue.js`
		onCreate()	
	}
	let onCreate =()=>{
		$.when(
				$.getScript(lost_vue)
				).done(()=>{
					setContentView()
					$('#lostList').click(e=>{
						$('#content').empty()
						$('#content').html(lost_vue.)
					})
				})
	}
})