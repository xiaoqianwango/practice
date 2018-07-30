package per.smart.chapter1.util;


import com.sun.xml.internal.ws.util.StringUtils;

/**
 * Created by wangxiaoqian on 2018/7/30.
 */
public class CastUtil {
    /*
    转化为String类型
     */
    public  static String castString(Object object){
        return CastUtil.castString(object,"");
    }
    /*
    转化为String，提供默认值
     */
    public static String castString(Object object,String defaultValue){
        return object != null ?String.valueOf(object) : defaultValue;
    }
    /*
    转化为Double
     */
    public  static double castDouble(Object object){
        return CastUtil.castDouble(object,0);
    }
    /*
    转化为Double,提供默认值
     */
    public static double castDouble(Object object,double defaultValue){
        double doubleValue = defaultValue;
        if(object != null){
            String strValue = castString(object);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    doubleValue = Double.parseDouble(strValue);
                }catch (NumberFormatException e){
                    doubleValue = defaultValue;
                }

            }
        }
        return doubleValue;
    }
    /*
    转化为Long型
     */
    public  static long castLong(Object object){
        return CastUtil.castLong(object,0);
    }
    /*
    转化为Long型，提供默认值
     */
    public static long castLong(Object object,long defaultValue){
        long longValue = defaultValue;
        if(object != null){
            String strValue = castString(object);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    longValue = Long.parseLong(strValue);
                }catch (NumberFormatException e){
                    longValue = defaultValue;
                }

            }
        }
        return longValue;
    }
    /*
    转为Int
     */
    public  static int castInt(Object object){
        return CastUtil.castInt(object,0);
    }
    /*
    转化为Int，提供默认值
     */
    public static int castInt(Object object,int defaultValue){
        int intValue = defaultValue;
        if(object != null){
            String strValue = castString(object);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    intValue = Integer.parseInt(strValue);
                }catch (NumberFormatException e){
                    intValue = defaultValue;
                }

            }
        }
        return intValue;
    }
    /*
    转化为boolean
     */
    public  static boolean castBoolean(Object object){
        return CastUtil.castBoolean(object,false);
    }
    /*
    转为boolean，提供默认值
     */
    public static boolean castBoolean(Object object,boolean defaultValue){
        boolean booleanValue = defaultValue;
        if(object != null){
            booleanValue = Boolean.parseBoolean(castString(object));
        }
        return booleanValue;
    }
}
