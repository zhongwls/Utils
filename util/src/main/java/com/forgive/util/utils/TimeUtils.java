package com.forgive.util.utils;


import com.forgive.util.common.TimeType;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zwl on 2018/1/3.
 */

public class TimeUtils {

    private TimeUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 时间戳转字符串  动态格式
     */
    public static String getTime(long timeInMillis, String format) {
        return new SimpleDateFormat(format).format(new Date(timeInMillis));
    }

    /**
     * 时间转字符串  -默认格式 yyyy-MM-dd HH:mm:ss
     */
    public static String getTime(long timeInMillis) {
        return getTime(timeInMillis, TimeType.SECOND_LINE_COLON);
    }

    /**
     * 获取当前时间的时间戳
     */
    public static long getCurrentTimeInLong() {
        return System.currentTimeMillis();
    }

    /**
     * 获取当前时间的字符串格式  默认格式
     */
    public static String getCurrentTimeInString() {
        return getTime(getCurrentTimeInLong());
    }

    /**
     * 获取当前时间的字符串格式  动态格式
     */
    public static String getCurrentTimeInString(String format) {
        return getTime(getCurrentTimeInLong(), format);
    }
}
