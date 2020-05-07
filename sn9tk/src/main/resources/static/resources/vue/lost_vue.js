"use-strict"
var lostVue = {
	detail : ()=>{
		return `<table id="kcdc">
        <tr>
        <td id="content" colspan="4">
            <table id="admin" style="width: 80%; height:80%; margin: 0 auto">
		    <tr style="width: 80%;height: 50px;">
		      <td rowspan="4">
		        <img src="https://u5b8t9w6.stackpathcdn.com/wp-content/uploads/2014/12/profile-default-300x242.jpg">
		      </td>
		      <td style="height: 20%">
		        <label>분실물 코드</label>
		      </td>
		      <td>
		        <input id="lossid" type="text" />
		      </td>
		    </tr>  
		    <tr style="height: 20%">
		      <td >
		        <label>분실물</label>
		      </td>
		      <td>
		        <input id="item" type="text" />
		      </td>
		    </tr>
		    <tr style="height: 20%">
		      <td>
		        <label>분실 날짜</label>
		      </td>
		      <td>
		        <input id="date" type="text" />
		      </td>
		    </tr>
		    <tr style="height: 20%">
		      <td>
		        <label>분류</label>
		      </td>
		      <td>
		        <input id="category" type="text" />
		      </td>
		    </tr>
		    <tr style="height: 20%">
		      <td colspan="3" id="button_box">
		      </td>
		    </tr>
		     <tr style="height: 20%">
		      <td>
		        <label>습득 위치</label>
		      </td>
		      <td>
		        <input id="location" type="text" />
		      </td>
		    </tr>
		  </table>
        </td>
    </tr>
</table>
     	`
	},
	login : ()=>{
		return `
			<article>
			   <form id="login_box">
			   	<label>ID </label> <br>
			   	<input id="userid" type="text"> <br>
			   	<label>PASSWORD</label><br>
			   	<input id="passwd" type="text"><br>
			   
			   </form>
			  </article>
		`
	}
}