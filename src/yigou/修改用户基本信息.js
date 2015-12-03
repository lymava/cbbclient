/**
 * 功能 修改用户基本信息
 */
// 地址 {站点根目录}/face/user/updateSelf.do
// 请求方式 get/post
// 请求参数
var req_json = {
	"realname" : "逗逼",//用户真实名称
	"addr" : "ajfeiso/png"，//用户住址
	"phone" : "ajfeiso/png"//联系电话
}

/**
 */

//返回样例  
// 返回结果
var result = {
	"statusCode" : "200", //200 为操作成功    300为操作失败
	"message" : "修改成功！"//错误提示
}
