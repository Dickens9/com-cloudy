<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@include file="/WEB-INF/jsp/mgr/common.jsp" %>
<html>
<head>
<script type="application/javascript">
	 function advRotation(moduleId,size,tagId) {
		 $.ligerDialog.open({ url: '${ctx}/decorate/dialog.html', 
			 height: 600,
			 width: 800, 
			 buttons: [ 
			          { text: '确定', onclick: function (item, dialog) { alert(item.text); } },
			          { text: '取消', onclick: function (item, dialog) { dialog.close(); } } 
			         ] 
		 });
	}
	 var isDecorate = "N";
     function decorate(){
        if(isDecorate=='N'){
            isDecorate = 'Y';
            $('#decBtn').val("停止装修");
        }else{
            isDecorate = "N";
            $('#decBtn').val("开始装修");
        }
        var url = urlUpdateParams(window.result.location.href,"frameEdit",isDecorate);

        window.result.location.href = url;
     }

     function refresh(){
         window.result.location.href = urlUpdateParams(window.result.location.href,"frameEdit",isDecorate);
     }

     function urlUpdateParams(url, name, value) {
         var r = url;
         if (r != null && r != 'undefined' && r != "") {
             value = encodeURIComponent(value);
             var reg = new RegExp("(^|)" + name + "=([^&]*)(|$)");
             var tmp = name + "=" + value;
             if (url.match(reg) != null) {
                 r = url.replace(eval(reg), tmp);
             }
             else {
                 if (url.match("[\?]")) {
                     r = url + "&" + tmp;
                 } else {
                     r = url + "?" + tmp;
                 }
             }
         }
         return r;
     }
 </script>
</head>
<body>
<div style="position:fixed;top:0px;width: 100%;height: 40px;background-color:rgba(0, 0, 0, 0.69);padding:5px;overflow:hidden">
    <span style="color: #10887d">提示：开始装修后页面所有的链接将会失效，如果需要装修其它页面需先停止装修页面恢复正常，修改装修后如果需要点击刷新页面可查看最新效果。</span>
    <input id="decBtn" style="float: right;width:100px" class="l-button l-button-submit" type="submit" value="开始装修" onclick="decorate()"/>
    <input id="refresh" style="float: right;;width:100px" class="l-button l-button-submit" type="submit" value="刷新页面" onclick="refresh()" />
</div>
 <iframe id="result" name="result" style="border:0;padding-top:50px;width: 100%;height: 600px;" src="${ctx }/decorate/decorateDemo.html"/>
</body>
</html>