<%@page import="java.util.List"%>
<%@page import="com.cloudy.uam.permission.remote.vo.App"%>
<%@page import="com.cloudy.common.utils.SpringUtils"%>
<%@page import="com.cloudy.uam.permission.remote.UamPermissionService"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="${ctx}/static/tbsp/js/ligerui/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />  
<link href="${ctx}/static/tbsp/css/fonts/font-awesome.css" rel="stylesheet" type="text/css" />  
<script src="${ctx}/static/tbsp/js/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
<script src="${ctx}/static/tbsp/js/jquery/jquery-1.11.1.min.js" type="text/javascript"></script>    
<script src="${ctx}/static/tbsp/js/jquery-blockUI/jquery.blockUI.js" type="text/javascript"></script>
<script src="${ctx}/static/tbsp/js/jquery/jquery.components.js" type="text/javascript"></script>    
<script src="${ctx}/static/tbsp/js/ligerui/ligerui.all.js" type="text/javascript"></script> 
<script src="${ctx}/static/tbsp/js/json/json2.js" type="text/javascript"></script>
<script src="${ctx}/static/tbsp/js/pagebar/pagebar.js" type="text/javascript"></script>
<script> var ctx = '${ctx}';
         var appCtx={};
	  <c:forEach items="${appCtxList}" var="app">
	     appCtx['${app.appName}'] = '${app.genAbsoluteUrl()}';
	  </c:forEach>
</script>

<script type="text/javascript">
function openDialog(option){
   	var query = $; var dailogOption = option.dialog;
   	if(!dailogOption.data){dailogOption.data = {};}
   	if (self != top) { query = parent.$; dailogOption.data.frameId = window.frameElement.id; }
   	if(option.callBack){ var callBack = option.callBack; dailogOption.data.callBack = callBack; }
   	query.ligerDialog.open(dailogOption); 
}
function closeDialog(options){
  	var dialog = frameElement.dialog; 
  	var dialogData = dialog.get("data");
 	if(dialogData.callBack){ 
 		var userDefinedCallback ;
        if(options && options.data){ userDefinedCallback = dialogData.callBack+'(\''+JSON.stringify(options.data)+'\')'; }else{ userDefinedCallback = dialogData.callBack+"()"; }
	   	if(dialogData.frameId){ parent.document.getElementById(dialogData.frameId).contentWindow.eval(userDefinedCallback); }else{ parent.eval(userDefinedCallback); }
    }
  	dialog.close();
}
function openWaitting(opertion,msg,time){
	var query = $,_time =1000,_msg = "success";if(opertion == "edit"){_msg = "修改成功！";}else if(opertion == "save"){_msg = "保存成功！";}else if(opertion == "delete"){_msg = "删除成功！";} if (self != top) { query = parent.$; } if(time && Number(time)){_time = time;} if(msg){_msg = msg;} var manager = query.ligerDialog.waitting(_msg);  setTimeout(function () { manager.close(); }, _time);
}
$(function(){ try{$("body").bind("click",function(){ if(parent.menu){parent.menu.closeMenu();} });}catch(e){}});
</script>