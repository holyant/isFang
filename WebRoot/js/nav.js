function content(key){
    if(key==1){
      window.location = "proManage!init";
    }else if(key==2){
      window.location = "orderManage!init";
    }else if(key==3){
      window.location = "proManage!addProductInit";
    }else if(key=='shopList'){
	  window.location = "shopManage!init";
    }else if(key=='addShop'){
      window.location = "shopManage!addShopInit";
    }
    else if(key=='orderSearch'){
      window.location = "orderManage!showSearchFrame";
    }
 }