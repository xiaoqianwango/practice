package per.smart.chapter1.util;


import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 * Created by wangxiaoqian on 2018/7/30.
 */
public class StringUtil {
    /*
    判断字符串是否为空
     */
    public  static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }
    /*
    判断字符串是否非空
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
