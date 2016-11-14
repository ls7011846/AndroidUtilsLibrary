package com.gc.utils;

/**
 * Created by gc on 2016/11/6.
 */
public class StringUtils {
    
    private StringUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * Unicode转中文
     *
     * @param utfString
     * @return
     */
    public String convertUnicodeToChina(String utfString) {
        StringBuilder sb = new StringBuilder();
        int i = -1;
        int pos = 0;

        while ((i = utfString.indexOf("\\u", pos)) != -1) {
            sb.append(utfString.substring(pos, i));
            if (i + 5 < utfString.length()) {
                pos = i + 6;
                sb.append((char) Integer.parseInt(utfString.substring(i + 2, i + 6), 16));
            }
        }
        return sb.toString();
    }

}
