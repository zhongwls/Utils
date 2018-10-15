package com.forgive.util.utils;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.forgive.utils.MyApp;

/**
 * Created by zwl on 2018/1/3.
 */

public class ResourceUtil {

    private ResourceUtil() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 获取Resource对象
     */
    public static Resources getResources() {
        return MyApp.getContext().getResources();
    }

    /**
     * 获取Drawable资源
     */
    public static Drawable getDrawable(int resId) {
        return getResources().getDrawable(resId);
    }

    /**
     * 获取字符串资源
     */
    public static String getString(int resId) {
        return getResources().getString(resId);
    }

    /**
     * 获取color资源
     */
    public static int getColor(int resId) {
        return getResources().getColor(resId);
    }

    /**
     * 获取dimens资源
     */
    public static float getDimens(int resId) {
        return getResources().getDimension(resId);
    }

    /**
     * 获取字符串数组资源
     */
    public static String[] getStringArray(int resId) {
        return getResources().getStringArray(resId);
    }
}
