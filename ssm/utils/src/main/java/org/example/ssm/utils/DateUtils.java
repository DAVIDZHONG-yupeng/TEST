package org.example.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    //日志转换字符串
    public static String date2String(Date date,String patt){
        SimpleDateFormat sdf=new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }
    //字符转换日期
    public static Date string2Date(String str,String patt) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(patt);
        Date parse = sdf.parse(str);
        return parse;
    }
}