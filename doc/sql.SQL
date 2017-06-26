drop table label;
create table label(id int primary key auto_increment,
	label varchar(128))  ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from label;
insert into label(label) 
select "腾天圆" from dual union
select "时光地带" from dual union
select "曲之恋" from dual union
select "赫芮碧希" from dual union
select "脊良" from dual 
update product set label = '5' where label ='脊良'
select * from product where label ='腾天圆'

drop table shop;
create table shop(id int primary key auto_increment,
	name varchar(128),person varchar(128),phone varchar(54),memo varchar(128))  ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
insert into shop(name,person)
select "东方美","陈英" from dual union
select "萧山克丽缇娜","潘旭芬" from dual union
select "西湖-河下克丽缇娜","袁欢" from dual union
select "享瘦传奇","" from dual union
select "华伦泉SPA","" from dual union
select "丽人坊美容院","" from dual union
select "温州瑞丽","钟敏" from dual union
select "上虞凯撒","王霞尔" from dual union
select "雅美度美容院","" from dual union
select "名门望族","" from dual union
select "万年青","" from dual union
select "亲亲宝贝","" from dual union
select "温州雨佳人美容院","" from dual union
select "自然美美容院","" from dual union
select "花田美容","" from dual union
select "上海宜俪美容","" from dual union
select "三店合一克缇-万华、吉祥、天城店","" from dual union
select "三墩克丽缇娜","" from dual union
select "魅力佳亚健康调理中心","" from dual union
select "湖州","" from dual union
select "雪依氏","" from dual union
select "皎月美容","" from dual union
select "芳芯蕊美容院","薄鑫鑫" from dual union
select "富春生活馆","" from dual union
select "和和健康","" from dual union
select "格林黛娜","" from dual union
select "水女人","" from dual union
select "嵴正堂","" from dual union
select "美合传奇","" from dual union
select "项红","" from dual union
select "悦然SPA","" from dual union
select "雅廷","" from dual union
select "浦江克丽缇娜","" from dual union
select "震轩美容美发-钱江店","" from dual union
select "玲珑丽人SPA","" from dual union
select "散客","" from dual union
select "云SPA会所","国建胜" from dual union
select "宁波克丽缇娜-小港店","" from dual union
select "宁波克丽缇娜-红联店","" from dual union
select "宁波克丽缇娜-新星店","" from dual union
select "大连世纪阳光","" from dual union
select "温州金俪缘","" from dual union
select "宁波白雪","" from dual union
select "温州芙蓉","" from dual union
select "温州丽城美容院","" from dual union
select "余杭凯伦","" from dual union
select "永康悦榕阁","" from dual union
select "慈溪黄毛阿立","" from dual union
select "温州花开左岸","" from dual union
select "青田流金岁月","" from dual union
select "幼叶美容院-人民路店","" from dual union
select "衢州丽萍SPA养生","" from dual union
select "2013年结转客户","" from dual union
select "小天鹅美容院","" from dual union
select "天池丽颜","" from dual union
select "春春","" from dual union
select "温州靓影化妆品","" from dual union
select "丽伟美容院","" from dual union
select "欣姿秀美容阁","" from dual union
select "温州容媛美容院","" from dual union
select "温州雪丽美容院","" from dual

select * from shop limit 0,10
//创建订单表
drop table saleOrder;
create table saleOrder(id int primary key auto_increment,serial varchar(64),shopId int,createTime datetime,
memo varchar(128))  ENGINE=InnoDB DEFAULT CHARSET=utf8;

//出库表
drop table saleProduct;
create table saleProduct(id int primary key auto_increment,serial varchar(64),proId varchar(64),amount int,
memo varchar(128))  ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from saleOrder where serial like date_format(now(),'%Y%m%') order by serial desc limit 0,1

insert into saleOrder(serial,shopId,createtime)
select '2014060001',1,now() from dual

select * from saleOrder

show tables;

select * from label

select * from product







