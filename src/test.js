/**
 * 
 */
// 首页banner (baba/indexBanner.do)
// 请求参数 无
// 返回结果
var result = {
	"data" : {// 数据域
		"topBanner" : [ // 顶部滚动图片
				"http://121.40.177.251:8810/attachFiles/temp/556c2b9dd6c45928f5bc81ae",// 图片url地址
				"http://121.40.177.251:8810/attachFiles/temp/556c2b88d6c45928f5bc81ac",
				"http://121.40.177.251:8810/attachFiles/temp/556c2b4ed6c45928f5bc81aa",
				"http://121.40.177.251:8810/attachFiles/temp/556c2b22d6c45928f5bc81a8",
				"http://121.40.177.251:8810/attachFiles/temp/556c2b10d6c45928f5bc81a6" ],
		"tiantiantejia" : [// 天天特价
				"http://121.40.177.251:8810/attachFiles/temp/556c66ead6c45935136f9689",// 图片url地址
				"http://121.40.177.251:8810/attachFiles/temp/556c66b2d6c45935136f9687",
				"http://121.40.177.251:8810/attachFiles/temp/556c6684d6c45935136f9685",
				"http://121.40.177.251:8810/attachFiles/temp/556c665ad6c45935136f9682" ],
		"tuijianshangpin" : [// 推荐商品图片
		"http://121.40.177.251:8810/attachFiles/temp/5569a0acd6c4592809fc0dea",// 图片url地址
		"http://121.40.177.251:8810/attachFiles/temp/5569a092d6c4592809fc0de9" ]
	},
	"state" : 2
// 状态
}

/**
 * 
 */
// 获取推荐商品 (baba/getProductListByFenleiId.do)
// 请求参数
// type 1// 固定
// fenleiid 55482668d6c4591248857578// 固定
// page 1// 固定
// pageSize 4// 固定
// 返回结果
var result = {
	"data" : [// 数据域
			{
				"id" : "554827a9d6c4591248857579",// 系统ID
				"name" : "TLM130铝木复合推拉门窗（带防盗纱窗）",// 产品名称
				"pics" : [ "attachFiles/temp/5576c744d6c459174466997c",// 展示效果图
				"attachFiles/temp/5576c748d6c459174466997d",
						"attachFiles/temp/5576c74bd6c459174466997e" ],
				"pic" : "attachFiles/temp/5576b64dd6c4591744669952",// 主图片
				"priceFen" : "142200",// 价格(单位分)
				"xinghao" : "铝木复合门窗",// 型号
				"changjia" : "窗爸爸"// 厂家
			},
			{
				"id" : "554827cdd6c459124885757a",
				"name" : "M90铝木复合内/外平开门窗（带防盗纱窗）",
				"pics" : [ "attachFiles/temp/5576c759d6c459174466997f",
						"attachFiles/temp/5576c766d6c4591744669980",
						"attachFiles/temp/5576c768d6c4591744669981" ],
				"pic" : "attachFiles/temp/5576b658d6c4591744669953",
				"priceFen" : "0",
				"xinghao" : "铝木复合门窗",
				"changjia" : "窗爸爸"
			} ],
	"tuijian" : {
		"pic" : ""
	},
	"count" : "2",// 当前页
	"lastpage" : "1",// 最后一页
	"state" : "2"// 状态
}

/**
 * 
 */
// 根据分类id获取商品list (baba/getPubByFenleiid.do)
// 请求参数
// fenleiid 55482668d6c4591248857578// 可变
// * 分类Id说明
// * 热门资讯 554c8fa8d6c45923169ce936
// * 公司动态 554c8fd5d6c45923169ce937
// * 行业动态 554c8febd6c45923169ce938
// * 窗爸爸介绍 554c924fd6c45923169ce93a
// * 新美鱼集团 554c93afd6c45923169ce948
// 返回结果
var result = {
	"data" : [
			{
				"id" : "555da0c9d6c45968466da5c3",// id
				"name" : "企业简介",// 文章名称
				"pic" : "",// 文章首图
				"intro" : "ICAgIOmHjeW6huaWsOe+jumxvOWunuS4mu+8iOmbhuWbou+8ieaciemZkOWFrOWPuOWdkOiQveWcqOmTnOaigeW3peS4muWbreWMuuOAgumbhuWbouWFrOWPuOS4i+i+lumHjeW6huaWsOe+jumxvOWNmua0i+mTneS4muaciemZkOWFrOWPuOOAgemHjeW6huaWsOe+jumxvOWNmua0i+WhkemSouWei+adkOaciemZkOWFrOWPuOOAgemHjeW6huaWsOe+jumxvOWVhui0uOaciemZkOWFrOWPuOOAgg0KICAgIOWFrOWPuOS4u+imgeeUn+S6p+eahOmTneWQiOmHkeWei+adkOWMheaLrOWQhOenjemXqOeql+Wei+adkOWSjOW5leWimeWei+adkOS7peWPiuW3peS4muWei+adkO+8m+eUn+S6p+eahOeogOWcn+aXoOavkuWhkemSouWei+adkOS4uuWQhOenjeiKseiJsueahOmXqOeql+Wei+adkOOAguS6p+WTgeWTgeenjem9kOWFqO+8jOinhOagvOWkmuagt++8jOiJsuW9qeS4sOWvjO+8jOWTgei0qOS4gOa1ge+8jOiDveWFheWIhua7oei2s+W5v+Wkp+WuouaIt+eahOS4quaAp+WMlumcgOaxguOAgg0K",// 文章简介
				// base64编码
				"time" : "1432199369000"// 发布时间
			},
			{
				"id" : "555da118d6c45968466da5c4",
				"name" : "领导关怀",
				"pic" : "",
				"intro" : "",
				"time" : "1432199448000"
			},
			{
				"id" : "555da142d6c45968466da5c5",
				"name" : "荣誉资质",
				"pic" : "",
				"intro" : "",
				"time" : "1432199490000"
			},
			{
				"id" : "555da172d6c45968466da5c7",
				"name" : "生产研发",
				"pic" : "",
				"intro" : "5pys5YWs5Y+45oul5pyJ5by65aSn55qE56CU5Y+R6IO95Yqb77yM56CU5Y+R5Lit5b+D5oul5pyJ6LWE5rex56CU5Y+R5Lq65ZGYMzjkurrvvIzlhbbkuK3ljIXmi6zlpJrlkI3lpJbnsY3lt6XnqIvluIjvvIzms6jph43kuo7lkIjph5HmiJDliIbnmoTnoJTnqbbkuI7lvIDlj5HvvIzmlLnov5vnlJ/kuqfmioDmnK/jgIHmtYvor5Xpk53lkIjnmoTnibnmgKfjgIHlip/og73lj4rmiJDliIbvvIzlubbkuLDlr4zkuqflk4Hns7vliJfjgILmnKzlhazlj7jlj6blpJborr7mnInmqKHlhbforr7orqHnlJ/kuqfkuK3lv4PvvIzlj6/mjInnhaflrqLmiLfmjIflrprnmoTop4TmoLzlj4rlpJbop4LvvIznlJ/kuqfph4/ouqvorqLliLbnmoTmqKHlhbfvvIzmu6HotrPmr4/kuKrlrqLmiLfnmoTpnIDopoHjgIINCuiHquacrOWFrOWPuOaIkOeri+S7peadpe+8jOS4gOebtOS4juWbveWGhemihuWFiOeahOenkeeglOacuuaehOWPiumrmOagoei/m+ihjOe0p+WvhuWQiOS9nO+8jOi/m+ihjOS6p+WTgeeglOWPke+8jOW5tuS4jeaWreWujOWWhOWPiuaPkOWNh+eUn+S6p+aKgOacr+OAguWFtuS6p+WTgeiNo+iOt+WkmumhueWbveWGheWkluS4k+WIqeOAgg0K",
				"time" : "1432199538000"
			}, {
				"id" : "555da0b5d6c45968466da5c2",
				"name" : "工程实例",
				"pic" : "",
				"intro" : "",
				"time" : "1432199349000"
			} ],
	"count" : "5",
	"lastpage" : "1",
	"state" : "2"
}

/**
 * 
 */
// 根据id获取内容 (baba/getPubById.do)
// 请求参数
// id 55603907d6c45979867997bf// 可变
// 返回结果
var result = {
	"data" : {
		"id" : "55603907d6c45979867997bf",
		"name" : "我不是在做门窗，是在玩命！！",
		"pic" : "attachFiles/temp/5560386fd6c45979867997be",
		"viewcount" : "",
		"intro" : "6Zeo56qX6KGM5Lia6K+a5L+h56ys5LiA6Zeo56qX6L+Z5Liq6KGM5Lia6YeM77yM6K+a5L+h5piv5q+U55Sf5ZG95pu06YeN6KaB55qE5Lic6KW/IO+8jOWcqOi/meS4quihjOS4mumHjO+8jOmdoOeahOaYr+S4gOW8oOiEuCDjgIHkuIDkuKrlkI3lo7DvvIzlkI3lo7DlnY/kuIDmrKHkvaDln7rmnKzlj6/ku6XlkYrliKvov5nkuKrlnIjlrZDkuobjgII=",
		"content" : "PGRpdj7jgIDjgIDpl6jnqpfooYzkuJror5rkv6HnrKzkuIDpl6jnqpfov5nkuKrooYzkuJrph4zvvIzor5rkv6HmmK/mr5TnlJ/lkb3mm7Tph43opoHnmoTkuJzopb8mbmJzcDvvvIzlnKjov5nkuKrooYzkuJrph4zvvIzpnaDnmoTmmK/kuIDlvKDohLgmbmJzcDvjgIHkuIDkuKrlkI3lo7DvvIzlkI3lo7DlnY/kuIDmrKHkvaDln7rmnKzlj6/ku6XlkYrliKvov5nkuKrlnIjlrZDkuobjgILlj6ropoHlrojkv6EmbmJzcDvvvIzkuIDkuKrnlLXor53jgIHlh6DkuIfjgIHlh6DljYHkuIfnlJroh7Plh6Dnmb7kuIfnmoTmrL7pqazkuIrliLDkvaDmiYvph4zjgILov5nmmK/ov5nkuKrooYzkuJrnmoTprYXlipvjgILnpL7kvJrkuK3or5rkv6HmiafooYzmnIDlpb3nmoTlnIjlrZDvvIzkuLrkuYvlnZrmjIHvvIzor5rkv6HmmK/ph5HvvIzku6Xkv6HogIznq4vvvIzov5nkuZ/mmK/miJHku6zkuIDnm7TmiYDlnZrlrojnmoTmnIDlrp3otLXnmoTkuJzopb/jgII8YnIgLz48YnIgLz7jgIDjgIDpo47lhYnog4zlkI7nmoTovpvphbjmiJHku6zov5nkupvlgZrpl6jnqpfnmoTkuroh6KGo6Z2i6aOO5YWJ5b2T5oC757uP55CG44CB6ICB5p2/77yM5b2T6YeR5Li7Ieepv+edgOWFiemynO+8jOWPo+WQkOiOsuiKse+8jOaMh+eCueedgOWHoOeZvuS4h+WHoOWNg+S4h+WHoOS4quS6v+WHoOWNgeS4quS6v+eahOW4guWcuu+8jOWFtuWunui/h+edgOiLpumAvOeahOaXpeWtkO+8jOWkqeWkqeaXqeWHuuaZmuW9kiHlpKfmsZ/ljZfljJfmvILms4rvvIzkuIDml6XkuInppJDkuI3lrpombmJzcDvvvIznlJroh7Plh6DlpKnkuIDpob/lronnqLPppa0h5bqU6YWs5b2i5b2i6Imy6Imy55qE5Lq644CCJm5ic3A7PGJyIC8+PGJyIC8+44CA44CA5YGa6Zeo56qX55yf6Zq+5oql5Lu36auY5LqG77yM6K+05L2g6buRO+aKpeS7t+S9juS6hu+8jOivtOS9oOaYr+mql+WtkDvmiqXku7fmraPlpb3vvIzlj4jor7TogIPomZHogIPomZEh5pCt55CG5LuW77yM5LuW6Lef5L2g5omv5rehO+S4jeaQreeQhuS7lu+8jOS7luivtOS9oOijhemAvDvogYrlpb3kuobvvIzku5blj4jor7TljrvogIPomZHogIPomZEmbmJzcDsuLi7orqnmiJHku6zpl6jnqpfkurrlpoLkvZXmmK/lpb0/5L2G5piv5pel5a2Q6L+Y5b6X6L+H77yM6L+Y5b6X57un57ut5YGa4oCmJm5ic3A7PGJyIC8+Jm5ic3A756CN5Lu35YWI56CN5oiR5ZCn5oiQ5pys5b6I5aSn77yM5Yip5ram5b6I6JaE77yM6L+Z5bCx5piv5YGa6Zeo56qX55qE546w54q244CC5Lqy77yM5Yir6ICB56CN5Lu36YKj5LmI54ug5LqG77yM5Yir5Lul5Li66Zeo56qX6IO95oyj5aSa5bCR6ZKx5LqG77yM55yf55qE5piv5b6I5b6u6JaE55qE5Yip5ram5LqG77yM5aaC5p6c5bCx5oOz56CN5Lu377yM56CN5Lu35LmL5YmN5YWI56CN5oiR5ZCnISZuYnNwOzxiciAvPjxiciAvPuOAgOOAgOaIkeS4jeaYr+WcqOWBmumXqOeqlyZuYnNwO+aYr+WcqOeOqeWRvemXqOeql+iAgeadv+eahOW/g+eUteWbvu+8muato+W4uOW/g+i3szpfXy9cX19fX19fL1xfX19fX19f5pyJ5a6i5oi35p2l5Y2V5pe255qE5b+D6LezOl9fL1xfX18vXF8vXF9fL1xfL1xf5a6i5oi36K6u5Lu35pe255qE5b+D6LezOl8vXF8vXF8vXF8vXF8vXF8vXF/lrqLmiLforqLljZXmnaXml7bnmoTlv4Pot7PvvJovXC9cL1wvXC9cL1wvXC9cL1wvXC9c6ZKx5omT5LiN5Ye65pe255qE5b+D6Lez77yaX19fX19fX19fX19fX19f5oiR5LiN5piv5Zyo5YGa6Zeo56qX77yM5piv5Zyo546p5ZG977yMJm5ic3A75LiU5bmy5LiU54+N5oOcISZuYnNwOzxiciAvPjxiciAvPuOAgOOAgOWBmumXqOeql+eahOecn+WunuS6uueUn+WQg+edgOWNgeWdl+mSseeahOeCkumlre+8jOWCrOedgOWHoOWNgeS4h+eahOaxh+asvuOAguWdkOedgOS4gOWdl+mSseeahOWFrOS6pO+8jOiwiOedgOWHoOeZvuS4h+eahOWQiOWQjOOAguedoeedgOS4gOeZvuWkmuWdl+mSseeahOaXheekvu+8jOaMh+eCueedgOWHoOWNg+S4h+eahOW4guWcuuOAguaLv+edgOWHoOWNg+Wdl+mSseeahOW3pei1hO+8jOebr+edgOaIkOWNg+S4h+S4iuS6v+eahOWNleWtkOOAguWBmumXqOeql+eahO+8jOWwseaYr+WmguatpOS7u+aAp+OAguaJvuihjOS4muWwseW6lOivpeaJvui/meagt+eahO+8jOeOqeedgOaVsOS6v+iuoeeahOeUn+aEj+OAgui1muedgOeZvuWFg+iuoeeahOmSnuelqCEmbmJzcDvmi7/nnYDljZbnmb3oj5znmoTpkrHvvIwmbmJzcDvmk43nnYDljZbnmb3nsonnmoTlv4Mh55Sf5oSP5piv6auY56uv5aSn5rCU5LiK5qGj5qyh77yMJm5ic3A75Yip5ram5piv5L2O6LCD5aWi5Y2O5o6l5Zyw5rCUIeWkqemprOihjOepuueahOeUn+aEjyEhJm5ic3A7PGJyIC8+PGJyIC8+44CA44CA5pyJ5Lq66Zeu5Y2z54S25b6I57Sv5Li65ZWl5LiN6YCAP+WboOS4uumZpOS6huWBmumXqOeql++8jOWVpemDveS4jeS8miHmnInlkIzmhJ/nmoTpl6jnqpfkurrpg73pu5jpu5jnmoTovazkuoYuLi4uLi4uLi4gPC9kaXY+",
		"time" : "1432369415000"
	},
	"state" : "2"
}

var result = {
	"data" : [
			{
				"id" : "556fef07d105fc22ba0f6e12",
				"wen" : "问题",
				"phone" : "",
				"time" : "1433399047000",
				"da" : {
					"id" : "55701dedd812a82a4d4ec8bd",
					"huida" : "回答了",
					"userId" : "5550a272d6c4593921f15f77",
					"pics" : []
				},
				"pics" : [ "attachFiles/temp/556fef00d105fc22ba0f6e10",
						"attachFiles/temp/556fef00d105fc22ba0f6e11" ]
			},
			{
				"id" : "556feef3d105fc22ba0f6e0f",
				"wen" : "问题",
				"phone" : "",
				"time" : "1433399027000",
				"da" : {},
				"pics" : [ "attachFiles/temp/556feeedd105fc22ba0f6e0d",
						"attachFiles/temp/556feeedd105fc22ba0f6e0e" ]
			},
			{
				"id" : "556feedbd105fc22ba0f6e0c",
				"wen" : "问题",
				"phone" : "",
				"time" : "1433399003000",
				"da" : {},
				"pics" : [ "attachFiles/temp/556feedbd105fc22ba0f6e0a",
						"attachFiles/temp/556feedbd105fc22ba0f6e0b" ]
			},
			{
				"id" : "556feeb1d105fc22ba0f6e09",
				"wen" : "问题",
				"phone" : "",
				"time" : "1433398961000",
				"da" : {},
				"pics" : [ "attachFiles/temp/556feea1d105fc22ba0f6e07",
						"attachFiles/temp/556feeb1d105fc22ba0f6e08" ]
			} ],
	"state" : 2,
	"description" : "返回成功"
}

var a = {
	"status" : 0,
	"total" : 26,
	"size" : 10,
	"contents" : [ {
		"tel" : "15182186566",
		"tags" : "安岳龙水代理商",
		"uid" : 1053826243,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "安岳县",
		"picname" : "attachFiles/temp/55a5c589d6c459093af345d2",
		"create_time" : 1436927383,
		"city" : "资阳市",
		"businessid" : "558ccf3bd6c4595fc5993727",
		"location" : [ 105.426312, 29.745035999999999 ],
		"address" : "四川省资阳市安岳县元坝镇李路22号",
		"title" : "安岳龙水代理商",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 54
	}, {
		"tel" : "13795784171",
		"tags" : "刘川不锈钢铁艺部",
		"uid" : 1053830634,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "九龙县",
		"picname" : "attachFiles/temp/55a5c5c9d6c459093af345d3",
		"create_time" : 1436927438,
		"city" : "甘孜藏族自治州",
		"businessid" : "558ccee5d6c4595fc5993726",
		"location" : [ 101.51349500000001, 29.007300999999998 ],
		"address" : "四川省甘孜州九龙县团结下街刘川不锈钢铁艺部",
		"title" : "刘川不锈钢铁艺部",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 54
	}, {
		"tel" : "13340930168/13990313682",
		"tags" : "洪雅专卖店",
		"uid" : 1053839098,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "洪雅县",
		"picname" : "attachFiles/temp/55a5c639d6c459093af345d4",
		"create_time" : 1436927546,
		"city" : "眉山市",
		"businessid" : "558cca2ed6c4595fc5993725",
		"location" : [ 103.37165299999999, 29.916096 ],
		"address" : "四川省雷发市洪雅县疾控中心旁美誉铝材",
		"title" : "洪雅专卖店",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 54
	}, {
		"tel" : "13568626249/13909088456",
		"tags" : "泸州专卖店",
		"uid" : 1053843839,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "龙马潭区",
		"create_time" : 1436927604,
		"city" : "泸州市",
		"businessid" : "558cc748d6c4595fc5993724",
		"location" : [ 105.445137, 28.913574000000001 ],
		"address" : "四川省泸州市龙马潭区北郊停车场美誉铝材门市部",
		"title" : "泸州专卖店",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 54
	}, {
		"tel" : "13684343088",
		"tags" : "普安加盟商",
		"uid" : 1053878058,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "剑阁县",
		"picname" : "attachFiles/temp/55a5c80cd6c459093af345d6",
		"create_time" : 1436928013,
		"city" : "广元市",
		"businessid" : "558cc665d6c4595fc5993723",
		"location" : [ 105.531515, 32.294587 ],
		"address" : "四川省成都市剑阁县普安镇城北路医药公司旁",
		"title" : "普安加盟商",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 54
	}, {
		"tel" : "13981175863",
		"tags" : "三台加盟商",
		"uid" : 1053915370,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "青白江区",
		"create_time" : 1436928432,
		"city" : "成都市",
		"businessid" : "558cc544d6c4595fc5993721",
		"location" : [ 104.272064, 30.893201000000001 ],
		"address" : "四川省成都市三台县书香院A17号三星巷连门门市部",
		"title" : "三台加盟商",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 54
	}, {
		"tel" : "13980243931",
		"tags" : "重庆叙永加盟商",
		"uid" : 1054219223,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "叙永县",
		"picname" : "attachFiles/temp/55a5d4a0d6c459093af345e0",
		"create_time" : 1436931233,
		"city" : "泸州市",
		"businessid" : "557b7c77d6c45917446699ae",
		"location" : [ 105.45522200000001, 28.161280999999999 ],
		"address" : "四川省叙永县新区检察院斜对面",
		"title" : "重庆叙永加盟商",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 54
	}, {
		"tel" : "18990957808",
		"tags" : "宜宾南溪加盟商",
		"uid" : 1054304333,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "南溪区",
		"picname" : "attachFiles/temp/55a5d76cd6c459093af345e7",
		"create_time" : 1436931950,
		"city" : "宜宾市",
		"businessid" : "557be86bd6c45917446699b9",
		"location" : [ 104.976743, 28.858809999999998 ],
		"address" : "四川省宜宾市南溪区金溪街道金星村李家嘴",
		"title" : "宜宾南溪加盟商",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 54
	}, {
		"tel" : "13909077451/18990887922",
		"tags" : "营山专卖店",
		"uid" : 1054462938,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "营山县",
		"picname" : "attachFiles/temp/55a5dba4d6c459093af345f0",
		"create_time" : 1436933029,
		"city" : "南充市",
		"businessid" : "558cc3f1d6c4595fc599371e",
		"location" : [ 106.57193700000001, 31.083036 ],
		"address" : "四川省成都市营山县建材市场美鱼铝材经营部",
		"title" : "营山专卖店",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 54
	}, {
		"tel" : "13118273085",
		"tags" : "宏发铝塑门窗批发部",
		"uid" : 1054478502,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "蓬安县",
		"create_time" : 1436933155,
		"city" : "南充市",
		"businessid" : "558cc39ed6c4595fc599371d",
		"location" : [ 106.41795399999999, 31.034481 ],
		"address" : "四川省成都市蓬安县相如北二街京东配送部隔壁",
		"title" : "宏发铝塑门窗批发部",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 54
	} ]
};

var d1 = {
	"status" : 0,
	"total" : 2,
	"size" : 2,
	"contents" : [ {
		"tel" : "18808335678",
		"tags" : "岳山加盟店",
		"uid" : 1053759020,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "市中区",
		"create_time" : 1436926418,
		"city" : "乐山市",
		"businessid" : "558ccff2d6c4595fc5993729",
		"location" : [ 103.773583, 29.558392000000001 ],
		"address" : "四川省乐山市",
		"title" : "岳山加盟店",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 0
	}, {
		"tel" : "18990957808",
		"tags" : "宜宾南溪加盟商",
		"uid" : 1054304333,
		"province" : "四川省",
		"geotable_id" : 103236,
		"district" : "南溪区",
		"picname" : "attachFiles/temp/55a5d76cd6c459093af345e7",
		"create_time" : 1436931950,
		"city" : "宜宾市",
		"businessid" : "557be86bd6c45917446699b9",
		"location" : [ 104.976743, 28.858809999999998 ],
		"address" : "四川省宜宾市南溪区金溪街道金星村李家嘴",
		"title" : "宜宾南溪加盟商",
		"coord_type" : 3,
		"type" : 0,
		"distance" : 0,
		"weight" : 0
	} ]
}