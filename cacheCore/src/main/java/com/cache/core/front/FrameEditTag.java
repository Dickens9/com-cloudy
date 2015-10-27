
package com.cache.core.front;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 页面装修自定义标签
 */
public class FrameEditTag extends TagSupport {

    private static final long serialVersionUID = 1L;

    public static final String FRAME_EDIT="Y";
    public static final String REMOVE_TARGET="Y";

    @Override
    public int doStartTag() throws JspException {
        try{
            pageContext.getOut().print(showFrameHtml());
        }catch (Exception ex){
            throw new JspTagException(ex.getMessage());
        }

        return SKIP_BODY;
    }

    //标签结束时调用的处理方法
    public int doEndTag() {
        //继续执行后续的JSP页面内容
        return EVAL_PAGE;
    }

    private String showFrameHtml(){
        StringBuilder html=new StringBuilder();
        String frontPath=pageContext.getServletContext().getContextPath();

        HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
        String frameEdit= request.getParameter("frameEdit");
        String removeTarget=request.getParameter("removeTarget");
        if(FRAME_EDIT.equals(frameEdit)){
            html.append("<link href=\"").append(frontPath).append("/static/css/decorate/framepoint.css\" rel=\"stylesheet\" type=\"text/css\" />");
            html.append("<script type=\"text/javascript\" src=\"").append(frontPath).append("/static/js/decorate/framepoint.js\"></script>");
            html.append("<div class=\"framepoint_bar\" style=\"display: none;\"> <div class=\"framepoint_bar_bg\"></div>  <input id=\"frameinfo_cache\" type=\"hidden\" value=\"\" name=\"frameinfo_cache\"> </div>");
            html.append("<div class=\"framepoint_bar_tools\" style=\"display: none;\"> <a id=\"framepoint_edit\" href=\"javascript:;\">编辑</a> </div>");
        }
        if(REMOVE_TARGET.equals(removeTarget)){
            html.append("<script type=\"text/javascript\" src=\"").append(frontPath).append("/commons/frameEdit/removeTarget.js?time=").append(System.currentTimeMillis()).append("\"></script>");
        }
        return html.toString();
    }

}

