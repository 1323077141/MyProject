package com.zstu.manage.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018-04-24.
 */

/**
 * 日期工具
 */
public class DateUtils {

    /**
     * 字符串转变为日期
     * @param date
     * @param format
     * @return
     * @throws Exception
     */
    public static Date StringToDate(String date, String format){
        if(format == null){
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date result = null;
        try {
            result = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 日期转换为字符串
     * @param date
     * @param format
     * @return
     * @throws Exception
     */
    public static String DateToString(Date date,String format){
        if(format == null){
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

}
