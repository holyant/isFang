drop table product;
create table product(id int primary key auto_increment,
	label varchar(128),
	no varchar(128),
	name varchar(256),
	size varchar(128),
	unit varchar(128),
	cost double,
	memo varchar(256))  ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into product(label,no,name,size,unit,cost,memo)
select "腾天圆","HJ001","汉酵.我本轻盈","","1套",8800,"" from dual union 
select "腾天圆","HJ003","汉酵.活力生机畅快饮","","5g*10包",568,"" from dual union 
select "腾天圆","HJ004","汉酵.活力益生饮","","6g*10包",528,"" from dual union 
select "腾天圆","BZ005","本臟.青木泉","","500ml",2380,"" from dual union 
select "腾天圆","BZ006","本臟.红火泉","","500ml",2380,"" from dual union 
select "腾天圆","BZ007","本臟.明土泉","","500ml",2380,"" from dual union 
select "腾天圆","BZ008","本臟.白金泉","","500ml",2380,"" from dual union 
select "腾天圆","BZ009","本臟.玄水泉","","500ml",2380,"" from dual union 
select "腾天圆","JY010","酵元.万合本元（生命泉）","","650ml",3380,"" from dual union 
select "腾天圆","JY038","酵元.生命泉.金装","30ml*30","瓶",5380,"" from dual union 
select "腾天圆","JY011","酵元.乾元（护宝生机饮）","","650ml",3580,"" from dual union 
select "腾天圆","JY012","酵元.坤元（幸福魅力饮）","","650ml",3580,"" from dual union 
select "腾天圆","JY013","酵元.活力康元","","100g",1080,"" from dual union 
select "腾天圆","JY014","酵元.活力八珍饮","","20g*16包",598,"（代餐包）" from dual union 
select "腾天圆","YF022","御方本草.木.疏肝套","","套",2380,"" from dual union 
select "腾天圆","YF023","御方本草.木.乳腺通","","套",2680,"" from dual union 
select "腾天圆","YF024","御方本草.火.养心套","","套",2380,"" from dual union 
select "腾天圆","YF025","御方本草.火.头颈通","","套",2680,"" from dual union 
select "腾天圆","YF026","御方本草.土.健脾套","","套",2380,"" from dual union 
select "腾天圆","YF027","御方本草.土.带脉通","","套",2680,"" from dual union 
select "腾天圆","YF028","御方本草.金.润肺套","","套",2380,"" from dual union 
select "腾天圆","YF029","御方本草.金.三焦通","","套",2680,"" from dual union 
select "腾天圆","YF030","御方本草.水.强肾套","","套",2380,"" from dual union 
select "腾天圆","YF031","御方本草.水.手足通","","套",2680,"" from dual union 
select "腾天圆","YF032","御方本草.阴阳.气血通","","套",2680,"" from dual union 
select "腾天圆","YF033","御方本草养生.日月全能霜","","套",2980,"" from dual union 
select "腾天圆","YF034","御方本草养生.活血化瘀通络啫哩","","30g",480,"" from dual union 
select "腾天圆","YF035","御方本草养生.利水除湿温阳膏","","30g",460,"" from dual union 
select "腾天圆","YF036","御方本草养生.筋膜修复冰筋啫哩","","30g",480,"" from dual union 
select "腾天圆","YF037","御方本草.纤体套","","套",4280,"" from dual union 
select "腾天圆","YF038","排毒精品体验套","","套",398,"特价200/套" from dual union 
select "腾天圆","YF039","欢喜服务包","","套",398,"" from dual union 
select "时光地带","01010280","清肌油","280ml","瓶",329,"" from dual union 
select "时光地带","01010120","清肌油","120ml","瓶",181,"" from dual union 
select "时光地带","01020300","氨基酸洁面乳","300ml","瓶",267,"" from dual union 
select "时光地带","01020120","氨基酸洁面乳","120ml","瓶",142,"" from dual union 
select "时光地带","01060120","乳酪精华","120ml","瓶",266,"" from dual union 
select "时光地带","01070040","酵素嫩白粉","40g","瓶",156,"" from dual union 
select "时光地带","01030280","平衡调理露","280ml","瓶",219,"" from dual union 
select "时光地带","01030120","平衡调理露","120ml","瓶",128,"" from dual union 
select "时光地带","01040280","活肤水","280ml","瓶",219,"" from dual union 
select "时光地带","01040120","活肤水","120ml","瓶",128,"" from dual union 
select "时光地带","01180280","醒肤水","280ml","瓶",219,"" from dual union 
select "时光地带","01180120","醒肤水","120ml","瓶",128,"" from dual union 
select "时光地带","01190280","补湿水","280ml","瓶",299,"" from dual union 
select "时光地带","01190120","补湿水","120ml","瓶",159,"" from dual union 
select "时光地带","01050120","水分保湿乳液","120ml","瓶",268,"" from dual union 
select "时光地带","01090120","水分防晒隔离霜","120ml","瓶",298,"" from dual union 
select "时光地带","01370030","全效隔离霜清爽型","30ml","瓶",162,"" from dual union 
select "时光地带","01380030","全效隔离霜滋润型","30ml","瓶",162,"" from dual union 
select "时光地带","01200250","保湿导入喷雾","250ml","瓶",218,"" from dual union 
select "时光地带","01210120","美白修护乳液","120ml","瓶",268,"" from dual union 
select "时光地带","01220050","美白菁华睡眠霜","50g","瓶",288,"" from dual union 
select "时光地带","01230050","保湿嫩肤霜50g","50g","瓶",258,"" from dual union 
select "时光地带","01230080","保湿嫩肤霜80g","80g","瓶",380,"" from dual union 
select "时光地带","01260050","醒肤霜","50g","瓶",416,"" from dual union 
select "时光地带","01290050","滋润菁华霜","50g","瓶",288,"" from dual union 
select "时光地带","01270300","玫瑰润体乳","300ml","瓶",238,"" from dual union 
select "时光地带","02010030","玫瑰丝蛋白原液","30ml","瓶",388,"" from dual union 
select "时光地带","02010010","玫瑰丝蛋白原液","10ml","瓶",236,"" from dual union 
select "时光地带","02020030","20%高效左旋C原液","30ml","瓶",388,"" from dual union 
select "时光地带","02020010","20%高效左旋C原液","10ml","瓶",236,"" from dual union 
select "时光地带","02040030","100%可溶胶原蛋白原液","30ml","瓶",388,"" from dual union 
select "时光地带","02040010","100%可溶胶原蛋白原液","10ml","瓶",236,"" from dual union 
select "时光地带","02060030","10%细胞压力平衡因子","30ml","瓶",388,"" from dual union 
select "时光地带","02060010","10%细胞压力平衡因子","10ml","瓶",236,"" from dual union 
select "时光地带","02050010","痘清点用精华","12ml","瓶",92,"" from dual union 
select "时光地带","01100300","紧致弹力按摩乳","300ml","瓶",339,"" from dual union 
select "时光地带","T01","高效可按摩精华面膜（角质）","","片",46,"" from dual union 
select "时光地带","T02","高效可按摩精华面膜（补水）","","片",46,"" from dual union 
select "时光地带","T03","高效可按摩精华面膜（美白）","","片",46,"" from dual union 
select "时光地带","T04","高效可按摩精华面膜（敏感）","","片",46,"" from dual union 
select "时光地带","T05","高效可按摩精华面膜（滋润）","","片",46,"" from dual union 
select "时光地带","T06","高效可按摩精华面膜（平衡）","","片",46,"" from dual union 
select "时光地带","01110800","保湿嫩肤软膜","","800g",296,"" from dual union 
select "时光地带","01120800","美白亮肤软膜","","800g",296,"" from dual union 
select "时光地带","01130800","祛痘控油软膜","","800g",296,"" from dual union 
select "时光地带","01140800","安敏柔肤软膜","","800g",296,"" from dual union 
select "时光地带","01280080","优质修复滋润面膜","","90g",216,"" from dual union 
select "时光地带","01330006","美眼DIY套装","","套",338,"" from dual union 
select "时光地带","01350012","轻柔滋润眼啫哩","","12ml",186,"" from dual union 
select "时光地带","01360012","优质修护眼霜A","","12ml",186,"" from dual union 
select "时光地带","01370012","优质修护眼霜B","","12ml",186,"" from dual union 
select "时光地带","04010250","H2O活化液矿泉精华","","250ml",482,"" from dual union 
select "时光地带","04020250","H2O活化液牛奶精华","","250ml",482,"" from dual union 
select "时光地带","03010007","六天活肤紧致课程","","套",1281,"" from dual union 
select "时光地带","03020006","超时空面膜","","6支/盒",299,"" from dual union 
select "时光地带","05010014","水漾嫩肤疗程组合","","套",1382,"" from dual union 
select "时光地带","05020014","平衡调理疗程组合","","套",1382,"" from dual union 
select "时光地带","05030014","美白亮肤疗程组合","","套",1382,"" from dual union 
select "时光地带","05040014","安敏养护疗程组合","","套",1382,"" from dual union 
select "时光地带","05050014","生机活肤疗程组合","","套",1382,"" from dual union 
select "时光地带","05070013","养眼护理疗程组合","","套",1382,"" from dual union 
select "时光地带","05060014","滢润靓白疗程组合","","套",1382,"" from dual union 
select "时光地带","07010019","水漾嫩肤家居疗程组合","","套",1682,"" from dual union 
select "时光地带","07020019","平衡调理家居疗程组合","","套",1682,"" from dual union 
select "时光地带","07030019","美白亮肤家居疗程组合","","套",1782,"" from dual union 
select "时光地带","07040019","安敏养护家居疗程组合","","套",1682,"" from dual union 
select "时光地带","07050019","生机活肤家居疗程组合","","套",1782,"" from dual union 
select "时光地带","05080006","水漾嫩肤家居组合","","套",582,"" from dual union 
select "时光地带","05090006","平衡调理家居组合","","套",582,"" from dual union 
select "时光地带","05100006","美白亮肤家居组合","","套",682,"" from dual union 
select "时光地带","05110006","安敏养护家居组合","","套",582,"" from dual union 
select "时光地带","05120006","生机活肤家居组合","","套",682,"" from dual union 
select "时光地带","06010012","全棉助渗膜","","12粒",8,"工具不折扣" from dual union 
select "时光地带","06020001","面部SPA瓶","","个",10,"工具不折扣" from dual union 
select "时光地带","06030001","高弹洗面扑","","块",5,"工具不折扣" from dual union 
select "时光地带","06040001","打泡器","","个",25,"工具不折扣" from dual union 
select "曲之恋","QZL-ST","身体完美组合","","套",2180,"1780" from dual union 
select "曲之恋","QZL-JB","局部完美组合","","套",2180,"1780" from dual union 
select "曲之恋","QZL-GD","养生套之骨道","","套",2280,"1880" from dual union 
select "曲之恋","QZL-ZK","家居套之椎克","","套",1980,"1980" from dual union 
select "曲之恋","QZL-SDY","筋络疏导液","","瓶",1280,"华伦泉" from dual union 
select "曲之恋","QZJ-GJ","加热毯-腰部","","个",100,"河下克缇" from dual union 
select "曲之恋","QZJ-GJ","绷带","","条",10,"萧山克缇" from dual union 
select "曲之恋","QZJ-GJ","温灸仪","","个",100,"雅美度" from dual union 
select "曲之恋","QZJ-GJ","石  罐","","个",120,"雪依氏" from dual union 
select "曲之恋","QZJ-GJ","手  套","","盒",20,"" from dual union 
select "曲之恋","QZJ-GJ","敷贴","","个",100,"" from dual union 
select "赫芮碧希HRBC","HRTM-000","头面肩颈护理套","","套",4280,"" from dual union 
select "赫芮碧希HRBC","HRX-000","胸部焦点护理套","","套",2780,"" from dual union 
select "赫芮碧希HRBC","HRB-000","背部焦点护理套","","套",3580,"小1580" from dual union 
select "赫芮碧希HRBC","HRF-000","腰腹焦点护理套","","套",3980,"小1580" from dual union 
select "赫芮碧希HRBC","HRT-000","腰臀焦点护理套","","套",3980,"" from dual union 
select "赫芮碧希HRBC","HRS-000","手臂焦点护理套","","套",3980,"" from dual union 
select "赫芮碧希HRBC","HRD-000","大腿焦点护理套","","套",3980,"" from dual union 
select "赫芮碧希HRBC","HRM-000","小腿焦点护理套","","套",3980,"" from dual union 
select "赫芮碧希HRBC","HRHY-000","涵养清通护理套","","套",3280,"" from dual union 
select "赫芮碧希HRBC","HRSH-000","舒活调理护理套","","套",4580,"" from dual union 
select "赫芮碧希HRBC","HRQC-000","青春呵补护理套","","套",14800,"" from dual union 
select "赫芮碧希HRBC","HRXT-000","先天之本护理套","","套",3380,"" from dual union 
select "赫芮碧希HRBC","HRHT-000","后天之本护理套","","套",4280,"" from dual union 
select "赫芮碧希HRBC","HRNX-000","女性保养护理套","","套",4280,"" from dual union 
select "赫芮碧希HRBC","HRIN-000","女性私密保养套","","套",2880,"" from dual union 
select "赫芮碧希HRBC","HRAS-000","安神舒缓闻嗅套","","套",2780,"" from dual union 
select "赫芮碧希HRBC","HRJ-001","活肌洁面乳","","瓶",380,"" from dual union 
select "赫芮碧希HRBC","HRJ-002","活肌保湿纯露","","瓶",380,"" from dual union 
select "赫芮碧希HRBC","HRJ-003","活肌紧致精华液","","瓶",760,"" from dual union 
select "赫芮碧希HRBC","HRJ-004","活肌紧致膜","","瓶",580,"" from dual union 
select "赫芮碧希HRBC","HRJ-005","活肌紧致眼霜","","瓶",560,"" from dual union 
select "赫芮碧希HRBC","HRJ-006","活肌保湿乳霜","","瓶",580,"" from dual union 
select "赫芮碧希HRBC","HRJX-001","胸部焦点精华液","","瓶",1680,"" from dual union 
select "赫芮碧希HRBC","HRJX-002","胸部焦点精华乳霜","","瓶",760,"" from dual union 
select "赫芮碧希HRBC","HRJS-001","身体焦点精华液","","瓶",1680,"" from dual union 
select "赫芮碧希HRBC","HRJS-002","身体焦点紧实乳霜","","瓶",760,"" from dual union 
select "赫芮碧希HRBC","HAGJ-001","飞鱼棒","","瓶",55,"工具" from dual union 
select "赫芮碧希HRBC","HAGJ-002","人面小蜜蜂","","瓶",40,"工具" from dual union 
select "赫芮碧希HRBC","HAGJ-003","摩塑绷带","","套",50,"工具" from dual union 
select "赫芮碧希HRBC","HAGJ-004","摩塑能量刷","","瓶",200,"工具" from dual union 
select "赫芮碧希HRBC","","精油bb霜","","瓶",460,"" from dual union 
select "脊良","JL-JJ","肩颈疏通养生疗程","","套",2980,"" from dual union 
select "脊良","JL-GJ","关节正骨养生疗程","","套",3280,"" from dual union 
select "脊良","JL-GY","固腰培肾养生疗程","","套",3680,"" from dual union 
select "脊良","JL-WG","温宫祛寒理疗套组 草","","套",1680,"" from dual union 
select "脊良","JL-QF","祛风湿关节理疗套组 草","","套",1680,"" from dual union 
select "脊良","JL-JY","健腰补肾理疗套组 草","","套",2380,"" from dual union 
select "脊良","JL-JJ","肩颈头部理疗套组 草","","套",1680,"" from dual union 
select "脊良","","温宫祛寒理疗粉 草","","包",168,"" from dual union 
select "脊良","","祛风湿关节理疗粉 草","","包",168,"" from dual union 
select "脊良","","裸包","","包",0,"" from dual 

select * from product;


