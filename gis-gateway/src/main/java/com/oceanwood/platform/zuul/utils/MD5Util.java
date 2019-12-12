package com.oceanwood.platform.zuul.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密
 *
 * @author By TianF
 **/

public class MD5Util {
    public static String encode(String enStr) {
        StringBuffer sb = new StringBuffer();
        try {
            // 加密对象，指定加密方式
            MessageDigest md5 = MessageDigest.getInstance("md5");
            // 准备要加密的数据
            byte[] byteStr = enStr.getBytes();
            // 加密
            byte[] digest = md5.digest(byteStr);
            // 十六进制的字符
            char[] chars = new char[]{'0', '1', '2', '3', '4', '5',
                    '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            // 处理成十六进制的字符串(通常)
            for (byte bte : digest) {
                sb.append(chars[(bte >> 4) & 15]);
                sb.append(chars[bte & 15]);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        // 打印加密后的字符串
        return sb.toString();
    }
}
