package net.weixy.autotest.cucumber.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by weixy on 30/08/14.
 */
public class ParserUtils {

    public static String emitUnicode(String s) {
        final Pattern p = Pattern.compile("\\\\u\\s*([0-9(A-F|a-f)]{4})", Pattern.MULTILINE);
        String res = s;
        Matcher m = p.matcher(res);
        while (m.find()) {
            res = res.replaceAll("\\" + m.group(0),
                    Character.toString((char) Integer.parseInt(m.group(1), 16)));
        }
        return res;
    }
}
