
$(function(){

    /*开启编辑模式，需要屏蔽所有A标签的href*/
    $("a").attr("href","javascript:;");
    $(".emptyCustom").parent().parent().show();
    /*点击编辑时出发的事件*/
    $("#framepoint_edit").click(function(){
        //cacheInfo is frameInfo&frameType&TagId
        var cacheInfoStr =$("#frameinfo_cache").val();
        var cacheInfoAry = cacheInfoStr.split("&");
        var frameinfo = cacheInfoAry[0];
        var type = cacheInfoAry[1];
        var tagId =cacheInfoAry[2];

        var frameinfoAry = frameinfo.split("|");
        var moduleId = frameinfoAry[0];
        var size = frameinfoAry[1];

        switch (type){
            //轮换广告装修
            case "0":
                parent.advRotation(moduleId,size,tagId);
                break;
            //单图片广告装修
            case "1":
                parent.advSinglePic(moduleId,size,tagId);
                break;
            //多文字链接装修
            case "2":
                parent.advMultiFonts(moduleId,size,tagId);
                break;
            //单文字链接装修
            case "3":
                parent.advSingleFont(moduleId,size,tagId);
                break;
            case "4":
                parent.advLabel(moduleId,size);
                break;
            case "5":
                parent.recommend(moduleId,size,tagId);
                break;
            //目的地推荐
            case "6":
                parent.destinationRecommend(moduleId,tagId);
                break;
            //游记推荐
            case "7":
                parent.travelNoteRecommend(moduleId,tagId);
                break;
            //攻略推荐
            case "8":
                parent.strategyRecommend(moduleId,tagId);
                break;
            default :
                break;
        }
    })
    $(".frameEdit").css({
        "min-height":"24px",
        "min-width":"30px"
    });


    /*显示隐藏主体部分编辑工具*/
    $(".frameEdit").bind("mouseover",function(){
        //缓存
        var frameInfo = $(this).attr("frameInfo");
        var frameType =  $(this).attr("frameType");
        var tagId = $(this).attr("tagId");
        var blockname = $(this).attr("frameinfo").split('|')[1];

        var frameinfos=frameInfo+"&"+frameType+"&"+tagId;
        $(":hidden[name='frameinfo_cache']").attr("value", frameinfos);
        //显示
        var framepoint_bar = $(".framepoint_bar");
        framepoint_bar.show().css({
            'width' : $(this).width()-4 + 'px',
            'height' : (blockname == 'header') ? $(this).height()-39 + 'px' : $(this).height()-4 + 'px',
            'top' : (blockname == 'header') ? $(this).offset().top+30 + 'px' : $(this).offset().top + 'px',
            'left' : $(this).offset().left + 'px'
        });
        $(".framepoint_bar_tools").show().css({
            'width' : '40px',
            'height' : '30px',
            'top' : (blockname == 'header') ? framepoint_bar.offset().top+30 + 'px' : framepoint_bar.offset().top + 'px',
            'left' : framepoint_bar.offset().left + 'px'
        });

    });
    $(".framepoint_bar").hover(
        function(){
            $(this).show();
            $(this).next(".framepoint_bar_tools").show();
        },
        function(){
            $(this).hide();
            $(this).next(".framepoint_bar_tools").hide();
        }
    );
});
