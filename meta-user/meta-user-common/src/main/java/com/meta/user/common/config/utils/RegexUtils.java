package com.meta.user.common.config.utils;

import java.util.regex.Pattern;

/**
 * @author zhoupeng
 * @date 2021/3/3 20:15
 */
public class RegexUtils {

    /**
     * 正整数
     */
    private static final String POSITIVE_INTEGER = "^[1-9]\\d*$";

    /**
     * 非负整数
     */
    private static final String NONNEGATIVE_INTEGER = "^[0-9]\\d*$";




    /**
     * 校验正整数
     * @param str 入参
     */
    public static boolean positiveInteger(String str){
        return Pattern.matches(POSITIVE_INTEGER, str);
    }


    /**
     * 校验非负整数
     * @param str 入参
     */
    public static boolean nonnegativeInteger(String str){
        return Pattern.matches(NONNEGATIVE_INTEGER, str);
    }


}
