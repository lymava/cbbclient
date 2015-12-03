/**
 * 功能 登录
 */

// 地址 {站点根目录}/front/login.do
// 请求方式 get/post 
/**
 * 请求参数
 * 
 * username 用户账户 
 * userpwd 用户密码 
 * randeCode 验证码
 */

//返回样例 {"statusCode":"300","message":"请先获取验证码！"}
// 返回结果
var result = {
	"statusCode" : "300", //200 为登录成功    300为登录失败
	"message" : "请先获取验证码！"//错误提示
}
