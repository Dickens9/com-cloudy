$(function(){
    $(".tbsporg,.tbspuser").css({ "width": "154px", "padding-right": "20px" });
});
/**
 * 选择组织
 * @param param
 */
function orgSelect(param){
	var options = {
	        dialogId : "selectOrgDialog", //指定别名，自定义关闭时需此参数
	        dialog : { 
				height: 463
			   ,width: 580
			   ,title:'选择组织'
			   ,url: appCtx['tbsp-uam-web']+'/userOrgSelect/orgSelect.html'
			   ,isHidden:false
			   ,data:param
			   ,buttons: [
                      { text: '确定', onclick: function (item, dialog) { dialog.frame.save();}},
                      { text: '取消', onclick: function (item, dialog) { dialog.close(); } }
                   ]
			}
	    };
	openDialog(options);
}
/**
 * 选择用户
 * @param param
 */
function userSelect(param){
	var options = {
	        dialogId : "selectUserDialog", //指定别名，自定义关闭时需此参数
	        dialog : { 
				height: 463
			   ,width: 756
			   ,title:'选择用户'
			   ,url: appCtx['tbsp-uam-web']+'/userOrgSelect/userSelect.html'
			   ,data:param
			   ,buttons: [
	                      { text: '确定', onclick: function (item, dialog) { dialog.frame.save();}},
	                      { text: '取消', onclick: function (item, dialog) { dialog.close(); } }
	                   ]
			}
	    };
	openDialog(options);
} 