var $valid={
	notEmpty : 'can not be empty' ,
	notInput : 'can not enter the single quotes',
	illegalCharacters : 'Illegal Characters',
	illegalToInt : 'Entered illegal characters. Please input integer.',
	illegalInt : "Illegal Integer .",
	illegalToFloat : 'Please input float(integer or decimal)',
	illegalFloat : 'Illegal Float',
	illegalInput : 'Input is invalid',
	maxFraction : 'can only enter two decimals',
	maxLength : 'input characters\'s length can not exceed 128!',
	paramError : 'parameter error' ,
	week:['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'],
	weekStr:''
}
//---------------------------------------------------   
// 判断闰年   
//---------------------------------------------------   
Date.prototype.isLeapYear = function()    
{    
    return (0==this.getYear()%4&&((this.getYear()%100!=0)||(this.getYear()%400==0)));    
}    
   
//---------------------------------------------------   
// 日期格式化   
// 格式 YYYY/yyyy/YY/yy 表示年份   
// MM/M 月份   
// W/w 星期   
// dd/DD/d/D 日期   
// hh/HH/h/H 时间   
// mm/m 分钟   
// ss/SS/s/S 秒   
//---------------------------------------------------   
Date.prototype.Format = function(formatStr)    
{    
    var str = formatStr;    
    var Week =$valid.week;   
   
    str=str.replace(/yyyy|YYYY/,this.getFullYear());    
    str=str.replace(/yy|YY/,(this.getYear() % 100)>9?(this.getYear() % 100).toString():'0' + (this.getYear() % 100));    
    var month = this.getMonth() + 1;
    str=str.replace(/MM/,month>9?month:'0' + month);    
    str=str.replace(/M/g,month);  
     
    str=str.replace(/dd|DD/,this.getDate()>9?this.getDate().toString():'0' + this.getDate());    
    str=str.replace(/d|D/g,this.getDate());    
   
    str=str.replace(/hh|HH/,this.getHours()>9?this.getHours().toString():'0' + this.getHours());    
    str=str.replace(/h|H/g,this.getHours());    
    str=str.replace(/mm/,this.getMinutes()>9?this.getMinutes().toString():'0' + this.getMinutes());    
    str=str.replace(/m/g,this.getMinutes()); 
    str=str.replace(/ss|SS/,this.getSeconds()>9?this.getSeconds().toString():'0' + this.getSeconds());    
    str=str.replace(/s|S/g,this.getSeconds());    
    str=str.replace(/w|W/g,Week[this.getDay()]); 
    return str;    
}    
   
//+---------------------------------------------------   
//| 求两个时间的天数差 日期格式为 YYYY-MM-dd    
//+---------------------------------------------------   
function daysBetween(DateOne,DateTwo)   
{    
    var OneMonth = DateOne.substring(5,DateOne.lastIndexOf ('-'));   
    var OneDay = DateOne.substring(DateOne.length,DateOne.lastIndexOf ('-')+1);   
    var OneYear = DateOne.substring(0,DateOne.indexOf ('-'));   
   
    var TwoMonth = DateTwo.substring(5,DateTwo.lastIndexOf ('-'));   
    var TwoDay = DateTwo.substring(DateTwo.length,DateTwo.lastIndexOf ('-')+1);   
    var TwoYear = DateTwo.substring(0,DateTwo.indexOf ('-'));   
   
    var cha=((Date.parse(OneMonth+'/'+OneDay+'/'+OneYear)- Date.parse(TwoMonth+'/'+TwoDay+'/'+TwoYear))/86400000);    
    return Math.abs(cha);   
}   
   
   
//+---------------------------------------------------   
//| 日期计算   
//+---------------------------------------------------   
Date.prototype.DateAdd = function(strInterval, Number) {    
    var dtTmp = this;   
    switch (strInterval) {    
        case 's' :return new Date(Date.parse(dtTmp) + (1000 * Number));   
        case 'n' :return new Date(Date.parse(dtTmp) + (60000 * Number));   
        case 'h' :return new Date(Date.parse(dtTmp) + (3600000 * Number));   
        case 'd' :return new Date(Date.parse(dtTmp) + (86400000 * Number));   
        case 'w' :return new Date(Date.parse(dtTmp) + ((86400000 * 7) * Number));   
        case 'q' :return new Date(dtTmp.getFullYear(), (dtTmp.getMonth()) + Number*3, dtTmp.getDate(), dtTmp.getHours(), dtTmp.getMinutes(), dtTmp.getSeconds());   
        case 'm' :return new Date(dtTmp.getFullYear(), (dtTmp.getMonth()) + Number, dtTmp.getDate(), dtTmp.getHours(), dtTmp.getMinutes(), dtTmp.getSeconds());   
        case 'y' :return new Date((dtTmp.getFullYear() + Number), dtTmp.getMonth(), dtTmp.getDate(), dtTmp.getHours(), dtTmp.getMinutes(), dtTmp.getSeconds());   
    }   
}   
   
//+---------------------------------------------------   
//| 比较日期差 dtEnd 格式为日期型或者 有效日期格式字符串   
//+---------------------------------------------------   
Date.prototype.DateDiff = function(strInterval, dtEnd) {    
    var dtStart = this;   
    if (typeof dtEnd == 'string' )//如果是字符串转换为日期型   
    {    
        dtEnd = StringToDate(dtEnd);   
    }   
    switch (strInterval) {    
        case 's' :return parseInt((dtEnd - dtStart) / 1000);   
        case 'n' :return parseInt((dtEnd - dtStart) / 60000);   
        case 'h' :return parseInt((dtEnd - dtStart) / 3600000);   
        case 'd' :return parseInt((dtEnd - dtStart) / 86400000);   
        case 'w' :return parseInt((dtEnd - dtStart) / (86400000 * 7));   
        case 'm' :return (dtEnd.getMonth()+1)+((dtEnd.getFullYear()-dtStart.getFullYear())*12) - (dtStart.getMonth()+1);   
        case 'y' :return dtEnd.getFullYear() - dtStart.getFullYear();   
    }   
}   
   
//+---------------------------------------------------   
//| 日期输出字符串，重载了系统的toString方法   
//+---------------------------------------------------   
Date.prototype.toString = function(showWeek)   
{    
    var myDate= this;   
    var str = myDate.toLocaleDateString();   
    if (showWeek)   
    {    
        var Week =$valid.week;   
        str += $valid.weekStr + Week[myDate.getDay()];   
    }   
    return str;   
}   
   
//+---------------------------------------------------   
//| 日期合法性验证   
//| 格式为：YYYY-MM-DD或YYYY/MM/DD   
//+---------------------------------------------------   
function IsValidDate(DateStr)    
{    
    var sDate=DateStr.replace(/(^\s+|\s+$)/g,''); //去两边空格;    
    if(sDate=='') return true;    
    //如果格式满足YYYY-(/)MM-(/)DD或YYYY-(/)M-(/)DD或YYYY-(/)M-(/)D或YYYY-(/)MM-(/)D就替换为''    
    //数据库中，合法日期可以是:YYYY-MM/DD(2003-3/21),数据库会自动转换为YYYY-MM-DD格式    
    var s = sDate.replace(/[\d]{ 4,4 }[\-/]{ 1 }[\d]{ 1,2 }[\-/]{ 1 }[\d]{ 1,2 }/g,'');    
    if (s=='') //说明格式满足YYYY-MM-DD或YYYY-M-DD或YYYY-M-D或YYYY-MM-D    
    {    
        var t=new Date(sDate.replace(/\-/g,'/'));    
        var ar = sDate.split(/[-/:]/);    
        if(ar[0] != t.getYear() || ar[1] != t.getMonth()+1 || ar[2] != t.getDate())    
        {    
            //alert('错误的日期格式！格式为：YYYY-MM-DD或YYYY/MM/DD。注意闰年。');    
            return false;    
        }    
    }    
    else    
    {    
        //alert('错误的日期格式！格式为：YYYY-MM-DD或YYYY/MM/DD。注意闰年。');    
        return false;    
    }    
    return true;    
}    
   
//+---------------------------------------------------   
//| 日期时间检查   
//| 格式为：YYYY-MM-DD HH:MM:SS   
//+---------------------------------------------------   
function CheckDateTime(str)   
{    
    var reg = /^(\d+)-(\d{ 1,2 })-(\d{ 1,2 }) (\d{ 1,2 }):(\d{ 1,2 }):(\d{ 1,2 })$/;    
    var r = str.match(reg);    
    if(r==null)return false;    
    r[2]=r[2]-1;    
    var d= new Date(r[1],r[2],r[3],r[4],r[5],r[6]);    
    if(d.getFullYear()!=r[1])return false;    
    if(d.getMonth()!=r[2])return false;    
    if(d.getDate()!=r[3])return false;    
    if(d.getHours()!=r[4])return false;    
    if(d.getMinutes()!=r[5])return false;    
    if(d.getSeconds()!=r[6])return false;    
    return true;    
}    
   
//+---------------------------------------------------   
//| 把日期分割成数组   
//+---------------------------------------------------   
Date.prototype.toArray = function()   
{    
    var myDate = this;   
    var myArray = Array();   
    myArray[0] = myDate.getFullYear();   
    myArray[1] = myDate.getMonth();   
    myArray[2] = myDate.getDate();   
    myArray[3] = myDate.getHours();   
    myArray[4] = myDate.getMinutes();   
    myArray[5] = myDate.getSeconds();   
    return myArray;   
}   
   
//+---------------------------------------------------   
//| 取得日期数据信息   
//| 参数 interval 表示数据类型   
//| y 年 m月 d日 w星期 ww周 h时 n分 s秒   
//+---------------------------------------------------   
Date.prototype.DatePart = function(interval)   
{    
    var myDate = this;   
    var partStr='';   
    var Week =$valid.week;   
    switch (interval)   
    {    
        case 'y' :partStr = myDate.getFullYear();break;   
        case 'm' :partStr = myDate.getMonth()+1;break;   
        case 'd' :partStr = myDate.getDate();break;   
        case 'w' :partStr = Week[myDate.getDay()];break;   
        case 'ww' :partStr = myDate.WeekNumOfYear();break;   
        case 'h' :partStr = myDate.getHours();break;   
        case 'n' :partStr = myDate.getMinutes();break;   
        case 's' :partStr = myDate.getSeconds();break;   
    }   
    return partStr;   
}   
   
//+---------------------------------------------------   
//| 取得当前日期所在月的最大天数   
//+---------------------------------------------------   
Date.prototype.MaxDayOfDate = function()   
{    
    var myDate = this;   
    var ary = myDate.toArray();   
    var date1 = (new Date(ary[0],ary[1]+1,1));   
    var date2 = date1.dateAdd(1,'m',1);   
    var result = dateDiff(date1.Format('yyyy-MM-dd'),date2.Format('yyyy-MM-dd'));   
    return result;   
}   
   
//+---------------------------------------------------   
//| 取得当前日期所在周是一年中的第几周   
//+---------------------------------------------------   
Date.prototype.WeekNumOfYear = function()   
{    
    var myDate = this;   
    var ary = myDate.toArray();   
    var year = ary[0];   
    var month = ary[1]+1;   
    var day = ary[2];   
    document.write('< script language=VBScript\> \n');   
    document.write('myDate = DateValue('+month+'-'+day+'-'+year+') \n');   
    document.write('result = DatePart("ww", myDate) \n');   
    document.write(' \n');   
    return result;   
}   
   
//+---------------------------------------------------   
//| 字符串转成日期类型    
//| 格式 MM/dd/YYYY MM-dd-YYYY YYYY/MM/dd YYYY-MM-dd   
//+---------------------------------------------------   
function StringToDate(DateStr)   
{    
   
    var converted = Date.parse(DateStr);   
    var myDate = new Date(converted);   
    if (isNaN(myDate))   
    {    
        //var delimCahar = DateStr.indexOf('/')!=-1?'/':'-';   
        var arys= DateStr.split('-');   
        myDate = new Date(arys[0],--arys[1],arys[2]);   
    }   
    return myDate;   
}
//+---------------------------------------------------   
//| 数字，金额 用逗号 隔开。数字格式化     
//+---------------------------------------------------   
function fnumber(s, n)   
{   
   n = n > 0 && n <= 20 ? n : 2;   
   s = parseFloat((s + "").replace(/[^\d\.-]/g, "")).toFixed(n) + "";   
   var l = s.split(".")[0].split("").reverse(),   
   r = s.split(".")[1];   
   t = "";   
   for(i = 0; i < l.length; i ++ )   
   {   
      t += l[i] + ((i + 1) % 3 == 0 && (i + 1) != l.length ? "," : "");   
   }   
   return t.split("").reverse().join("") + "." + r;   
} 

/** 下面两个函数都能对浮点数进行四舍五入，保留小数点后两位 **/

function CurrencyFormatted(amount) {
    var i = parseFloat(amount);
    if(isNaN(i)) { i = 0.00; }
    var minus = '';
    if(i < 0) { minus = '-'; }
    i = Math.abs(i);
    i = parseInt((i + .005) * 100);
    i = i / 100;
    s = new String(i);
    if(s.indexOf('.') < 0) { s += '.00'; }
    if(s.indexOf('.') == (s.length - 2)) { s += '0'; }
    s = minus + s;
    return s;
}
 
/**
*   Usage:  CurrencyFormatted(12345.678);
*   result: 12345.68
**/

function format_number(pnumber,decimals){
    if (isNaN(pnumber)) { return 0};
    if (pnumber=='') { return 0};
     
    var snum = new String(pnumber);
    var sec = snum.split('.');
    var whole = parseFloat(sec[0]);
    var result = '';
     
    if(sec.length > 1){
        var dec = new String(sec[1]);
        dec = String(parseFloat(sec[1])/Math.pow(10,(dec.length - decimals)));
        dec = String(whole + Math.round(parseFloat(dec))/Math.pow(10,decimals));
        var dot = dec.indexOf('.');
        if(dot == -1){
            dec += '.';
            dot = dec.indexOf('.');
        }
        while(dec.length <= dot + decimals) { dec += '0'; }
        result = dec;
    } else{
        var dot;
        var dec = new String(whole);
        dec += '.';
        dot = dec.indexOf('.');    
        while(dec.length <= dot + decimals) { dec += '0'; }
        result = dec;
    }  
    return result;
}
 
/**
*   Usage:  format_number(12345.678, 2);
*   result: 12345.68
**/