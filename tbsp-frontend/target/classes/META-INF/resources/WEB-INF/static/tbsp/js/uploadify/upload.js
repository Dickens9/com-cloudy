function openUploadDialog(data){
	var url = appCtx['tbsp-filesvr-web'];
	var option = {
			dialogId : "uploadDialog",
			dialog:{
    	 	width:400,
    	 	height:420, 
    	 	//allowClose:false,
    	 	title: "上传文件", 
    	 	url:url+"/filesvr/openUpload.html?data="+ new Date(),
    	 	buttons: [
                  { text: '确定', onclick: function (item, dialog) { dialog.frame.save();}}
               ]
     }};
	if(data){ if(data.callBack){option.callBack = data.callBack;} option.dialog.data = data;}
	openDialog(option);
}
function downLoad(id){
	var url = appCtx['tbsp-filesvr-web'];
	window.location.href = url+"/filesvr/downLoad?id="+id;
}
