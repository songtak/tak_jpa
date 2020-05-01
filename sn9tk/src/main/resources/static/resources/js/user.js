"use strict"
var user= user || {}
user = (()=>{ //()이름이 없으면 공간도 차지할 수 없음
	let init = () => {
		alert('1')
		onCreate()
	}
	let onCreate = () =>{
		alert('2')
		setContentView()
	}
	let setContentView = () =>{
		alert('3')
	}
	return {init}
})