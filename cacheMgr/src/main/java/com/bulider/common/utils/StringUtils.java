package com.bulider.common.utils;


/**
 * Created by lxd on 2014/11/28.
 */
public class StringUtils extends org.springframework.util.StringUtils {
    public static String insertFileNameSuffixToUrl(String url, String suffix){
        int index = url.lastIndexOf('.');
        if(index > 0){
            StringBuilder sb = new StringBuilder(url);
            sb.insert(index, "_"+suffix);
            return sb.toString();
        }
        return url;
    }
}
