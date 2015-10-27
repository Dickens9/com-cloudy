package com.bulider.common.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by zelinyang on 2014/11/28.
 */
public class Tools {
    /**
     * 获取异常堆栈字符串<br>
     * <p>
     * <strong>Note:</strong> 把异常堆栈打印成字符串.
     *
     * @param e
     *            异常
     * @return 异常堆栈字符串
     */
    public static String getStackTrace(Throwable e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString();
    }
}
