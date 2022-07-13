
function init(chk){
	if(chk){
		$('#loginPage').removeClass('hidePage').addClass('showPage');
		$('#logoutPage').removeClass('showPage').addClass('hidePage');
		
	}else{
		console.log(chk);
		$('#loginPage').removeClass('showPage').addClass('hidePage');
		$('#logoutPage').removeClass('hidePage').addClass('showPage');
	}
}

/**
 * 
 */