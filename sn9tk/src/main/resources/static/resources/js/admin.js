"admin strict"
var admin = admin ||{}
admin = (()=>{
	let init = 0 => {
		alert('1')
		onCreate()
	}
	let onCreate = () => {
		alert('2')
		setContentView
	}
	let setContentView=()=>{
		alert('3')
	}
	return {init}
})