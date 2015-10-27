package com.bulider.common.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>
 * Description: 日期、数字格式转换工具类
 * </p>
 * @author zelinyang
 * @date 2014/11/28.
 */
public class TransUtils {
    /**
     * <p>
     * Description: 将日期字符串按从一种格式转换为另一种格式
     * <p>
     * @param sourceDateStr 日期字符串
     * @param fromDatePattern 源时间格式
     * @param toDatePattern 目标时间格式
     * @return
     * @author 杨泽林
     * @date 2011-3-12上午10:21:01
     */
    public static String transDateString2formatString(String sourceDateStr,String fromDatePattern, String toDatePattern){
        String dateString = sourceDateStr;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(fromDatePattern);
            Date date = sdf.parse(sourceDateStr);
            sdf.applyPattern(toDatePattern);
            dateString = sdf.format(date);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
        }

        return dateString;
    }

    /**
     * <p>
     * Description: 将日期字符串转换到到一个该月的最后一天,将该月的最后一天按指定时间格式转换为字符串输出。
     * <p>
     * @param sourceDateStr	日期字符串
     * @param fromDatePattern 日期字符串时间格式
     * @param toDatePattern 目标时间格式
     * @return
     * @author   杨泽林
     * @date 2011-3-12下午01:22:01
     */
    public static String transDateString2LastDayOfMonth(String sourceDateStr,String fromDatePattern, String toDatePattern){
        String lastDayOfMonth = sourceDateStr;
        try {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat(fromDatePattern);
            Date month = sdf.parse(sourceDateStr);
            cal.setTime(month);
            cal.add(Calendar.MONTH, 1);
            cal.add(Calendar.DAY_OF_MONTH, -1);
            cal.add(Calendar.HOUR_OF_DAY, 23);
            cal.add(Calendar.MINUTE, 59);
            cal.add(Calendar.SECOND, 59);
            Date date = cal.getTime();
            sdf.applyPattern(toDatePattern);
            lastDayOfMonth = sdf.format(date);
        } catch (ParseException e) {

        }

        return lastDayOfMonth;
    }

    /**
     * 将日期按指定格式转换为字符串
     * @param time 日期
     * @param datePattern 指定日期格式
     * @return string 日期字符串
     */
    public static String convertTime2String(Timestamp time,String datePattern){
        String str = "";
        if(time == null || datePattern == null){
            return str;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            str = sdf.format(time);
        } catch (Exception e) {

        }
        return  str;
    }

    /**
     * 将日期按指定格式转换为字符串
     * @param time 日期
     * @param datePattern 指定日期格式
     * @return string 日期字符串
     */
    public static String convertTime2String(Date time,String datePattern){
        String str = "";
        if(time == null || datePattern == null){
            return str;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            str = sdf.format(time);
        } catch (Exception e) {

        }
        return  str;
    }

    /**
     * <p>
     * 	Description: 将指定定日期格式字符串转换为日期
     * <p>
     * @param dateStr	日期字符串
     * @param datePattern 日期格式
     * @return			Date 日期
     * @author   杨泽林
     * @date 2011-7-22
     */
    public static Date transString2Date(String dateStr, String datePattern){
        Date date = null;
        try {
            if(dateStr != null && datePattern != null &&
                    dateStr.length() == datePattern.length()){
                SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
                date = sdf.parse(dateStr);
            }
        } catch (ParseException e) {

        }

        return date;
    }

    /**
     * <p>
     * 	Description: 将指定定日期格式字符串转换为日期
     * <p>
     * @param dateStr	日期字符串
     * @param datePattern 日期格式
     * @return	Timestamp 日期
     * @author   杨泽林
     * @date 2011-7-22
     */
    public static Timestamp transString2Timestamp(String dateStr, String datePattern){
        Timestamp time = null;
        try {
            if(dateStr != null && datePattern != null &&
                    dateStr.length() == datePattern.length()){
                SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
                long l = sdf.parse(dateStr).getTime();
                time = new Timestamp(l);
            }
        } catch (ParseException e) {

        }

        return time;
    }

    /**
     * <p>
     * Description: 判断日期字符串是否是指定格式。
     * <p>
     * @param dateStr
     * @param datePattern
     * @return
     * @author   杨泽林
     * @date 2011-3-14下午12:16:42
     */
    public static boolean checkDateStrIsDateForamte(String dateStr, String datePattern){
        boolean result =  false;
        try {
            if(dateStr != null && datePattern != null &&
                    dateStr.length() == datePattern.length()){
                SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
                //新增判断错误格式，比如说 2011-14-14之类的，java还是能转换成日期\
                //author: yezhenhua
                Date date = sdf.parse(dateStr);
                String newDateStr = sdf.format(date);
                if ( dateStr.equals(newDateStr) )
                    return true;
                else
                    return false;
            }
        } catch (ParseException e) {

        }

        return result;
    }


    /**
     * <p>
     * Description: 根据指定时间格式的当前时间字符串
     * <p>
     * @param datePattern
     * @return
     * @author   杨泽林
     * @date 2011-3-15下午04:17:33
     */
    public static String getCurrentDate(String datePattern){
        String dateStr = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            dateStr = sdf.format(new Date());
        } catch (Exception e) {

        }
        return dateStr;
    }

    /**
     * <p>
     * Description: 根据但前时间获取当前时间上一个月的开始时间
     * <p>
     * @param datePattern
     * @return
     * @author   杨泽林
     * @date 2011-3-15下午02:39:13
     */
    public static String getLastMonthBeigeDate(String datePattern){
        String dateStr = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, -1);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            dateStr = sdf.format(cal.getTime());
        } catch (Exception e) {

        }
        return dateStr;
    }

    /**
     * <p>
     * Description: 根据但前时间获取当前时间上一个月的结束时间
     * <p>
     * @param datePattern
     * @return
     * @author   杨泽林
     * @date 2011-3-15下午02:40:08
     */
    public static String getLastMonthEndDate(String datePattern){
        String dateStr = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 23);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);
            cal.set(Calendar.MILLISECOND, 59);
            cal.add(Calendar.DAY_OF_MONTH, -1);
            dateStr = sdf.format(cal.getTime());
        } catch (Exception e) {

        }
        return dateStr;
    }

    /**
     * <p>
     * Description: 根据当前时间获取当前时间的月份开始时间
     * <p>
     * @param datePattern
     * @return
     * @author   杨泽林
     * @date 2011-3-15下午02:39:13
     */
    public static String getCurrentMonthBeigeDate(String datePattern){
        String dateStr = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            dateStr = sdf.format(cal.getTime());
        } catch (Exception e) {

        }
        return dateStr;
    }


    /**
     * <p>
     * Description: 根据当前时间获取当前时间的月份结束时间
     * <p>
     * @param datePattern
     * @return
     * @author   杨泽林
     * @date 2011-3-15下午02:40:08
     */
    public static String getCurrentMonthEndDate(String datePattern){
        String dateStr = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, 1);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 23);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);
            cal.set(Calendar.MILLISECOND, 59);
            cal.add(Calendar.DAY_OF_MONTH, -1);
            dateStr = sdf.format(cal.getTime());
        } catch (Exception e) {

        }
        return dateStr;
    }

    /**
     * <p>
     * Description: 根据当前时间获取当前时间的月份开始时间
     * <p>
     * @return
     * @author   杨泽林
     * @date 2011-3-15下午02:39:13
     */
    public static Date getCurrentMonthBeigeDate(){
        Date date = null;
        try {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            date = cal.getTime();
        } catch (Exception e) {

        }
        return date;
    }


    /**
     * <p>
     * Description: 根据当前时间获取当前时间的月份结束时间
     * <p>
     * @return
     * @author   杨泽林
     * @date 2011-3-15下午02:40:08
     */
    public static Date getCurrentMonthEndDate(){
        Date date = null;
        try {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, 1);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 23);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);
            cal.set(Calendar.MILLISECOND, 59);
            cal.add(Calendar.DAY_OF_MONTH, -1);
            date = cal.getTime();
        } catch (Exception e) {

        }
        return date;
    }

    /**
     * <p>
     * Description: 根据当前时间获取据当前时间前或者后几个月的份开始时间字符串
     * <p>
     * @param monthCount 据当前月份数
     * @return
     * @author   杨泽林
     * @date 2011-3-29下午02:28:52
     */
    public static Date getMonthBeginDateFromCurrent(int monthCount){
        Date date = null;
        try {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, monthCount);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            date = cal.getTime();
        } catch (Exception e) {

        }
        return date;
    }

    /**
     * <p>
     * Description: 根据当前时间获取据当前时间前或者后几个月的份结束时间字符串
     * <p>
     * @param monthCount 据当前月份数
     * @return
     * @author   杨泽林
     * @date 2011-3-29下午02:28:52
     */
    public static Date getMonthEndDateFromCurrent(int monthCount){
        Date date = null;
        try {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, monthCount+1);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 23);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);
            cal.set(Calendar.MILLISECOND, 59);
            cal.add(Calendar.DAY_OF_MONTH, -1);
            date = cal.getTime();
        } catch (Exception e) {

        }
        return date;
    }
    /**
     * <p>
     * Description: 根据当前时间获取据当前时间前或者后几个月的份开始时间字符串
     * <p>
     * @param monthCount 据当前月份数
     * @param datePattern 指定返回日期格式字符串
     * @return
     * @author   杨泽林
     * @date 2011-3-29下午02:28:52
     */
    public static String getMonthBeginDateFromCurrent(int monthCount, String datePattern){
        String dateStr = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, monthCount);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            dateStr = sdf.format(cal.getTime());
        } catch (Exception e) {

        }
        return dateStr;
    }

    /**
     * <p>
     * Description: 根据当前时间获取据当前时间前或者后几个月的份结束时间字符串
     * <p>
     * @param monthCount 据当前月份数
     * @param datePattern 指定返回日期格式字符串
     * @return
     * @author   杨泽林
     * @date 2011-3-29下午02:28:52
     */
    public static String getMonthEndDateFromCurrent(int monthCount, String datePattern){
        String dateStr = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, monthCount+1);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 23);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);
            cal.set(Calendar.MILLISECOND, 59);
            cal.add(Calendar.DAY_OF_MONTH, -1);
            dateStr = sdf.format(cal.getTime());
        } catch (Exception e) {

        }
        return dateStr;
    }

    /**
     * <p>
     * Description: 得到日期字符串的月份开始时间
     * <p>
     * @param sourceDateStr
     * @param fromDatePattern
     * @param toDatePattern
     * @return
     * @author   杨泽林
     * @date 2011-3-15下午03:49:14
     */
    public static String getMonthBeignDate(String sourceDateStr,String fromDatePattern, String toDatePattern){
        String dateStr = sourceDateStr;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(fromDatePattern);
            Date date = sdf.parse(sourceDateStr);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            sdf.applyPattern(toDatePattern);
            dateStr = sdf.format(cal.getTime());
        } catch (ParseException e) {

        }

        return dateStr;
    }

    /**
     * <p>
     * Description: 得到日期字符串的月份结束时间
     * <p>
     * @param sourceDateStr
     * @param fromDatePattern
     * @param toDatePattern
     * @return
     * @author   杨泽林
     * @date 2011-3-15下午03:49:14
     */
    public static String getMonthEndDate(String sourceDateStr,String fromDatePattern, String toDatePattern){
        String dateStr = sourceDateStr;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(fromDatePattern);
            Date date = sdf.parse(sourceDateStr);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH, 1);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            cal.set(Calendar.HOUR_OF_DAY, 23);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);
            cal.set(Calendar.MILLISECOND, 59);
            cal.add(Calendar.DAY_OF_MONTH, -1);
            sdf.applyPattern(toDatePattern);
            dateStr = sdf.format(cal.getTime());
        } catch (ParseException e) {

        }

        return dateStr;
    }

    //将字符串转换为数字
    public static int transStr2Number(String num){
        Integer value = transStr2Number(num, Integer.class);
        if(value != null){
            return value;
        }else{
            return 0;
        }
    }

    //将字符串转换为数字
    @SuppressWarnings("unchecked")
    public static <T> T transStr2Number(String num, Class<T> clazz){
        T instance =  null;
        if(!isEmpty(num)){
            num = trimToEmpty(num);
            try {
                if(Integer.class.equals(clazz)){
                    instance = (T) Integer.valueOf(num);

                }else if(Float.class.equals(clazz)){
                    instance = (T) Float.valueOf(num);

                }else if(Double.class.equals(clazz)){
                    instance = (T) Double.valueOf(num);

                }else if(Byte.class.equals(clazz)){
                    instance = (T) Byte.valueOf(num);

                }else if(Short.class.equals(clazz)){
                    instance = (T) Short.valueOf(num);

                }else if(Long.class.equals(clazz)){
                    instance = (T) Long.valueOf(num);

                }else if(BigDecimal.class.equals(clazz)){
                    instance = (T) new BigDecimal(num);

                }else if(BigInteger.class.equals(clazz)){
                    instance = (T) new BigInteger(num);

                }else{
                    instance = (T) Integer.valueOf(num);
                }
            } catch (NumberFormatException e) {
            }

        }

        return instance;
    }

    public static boolean isEmpty(String str){
        return !(str != null ? str.trim().length() > 0 : false);
    }
    public static String trimToEmpty(String str){
        return str != null ? str.trim() : "";
    }
    public static String trimToEmpty(Object obj){
        return obj != null ? obj.toString().trim() : "";
    }
}
