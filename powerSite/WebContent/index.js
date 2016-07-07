/**
 * created by huangzhengjun
 */
/* 切换到注册页面 */
function toRegister() {
	$(".loginframe").hide();
	$(".registerframe").show();
}
/* 切换到登录页面 */
function toLogin() {
	$(".loginframe").show();
	$(".registerframe").hide();
}
/* 登录事件 */
function login() {
	var loginEmail = $("#loginEmail").val();
	var loginPassword = $("#loginPassword").val();
	/* window.location.href 控制页面跳转，在onclick后面要加上return false;否则有可能会出现无法跳转的情况 */
	if (loginEmail == "1015996057@qq.com" && loginPassword == "1015996057") {
		url = "http://localhost:8080/powerSite/views/home.html";
		window.location.href = "views/home.html";
	} else {
		alert("用户名或密码错误！请重试！！");
	}

}