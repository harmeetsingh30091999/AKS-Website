function chat_bot(){
	console.log("chat bot is working");
	document.getElementById('chat_icon').style.display="none";
	document.getElementById('chat_box').style.display="block";
	document.getElementById('chat_close').style.display="block";	
}
function chat_close(){
	document.getElementById('chat_box').style.display="none";
	document.getElementById('chat_icon').style.display="block";
	document.getElementById('chat_close').style.display="none";
}