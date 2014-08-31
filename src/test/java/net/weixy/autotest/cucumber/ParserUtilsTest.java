package net.weixy.autotest.cucumber;

import net.weixy.autotest.cucumber.utils.ParserUtils;
import org.junit.Test;

/**
 * Created by weixy on 30/08/14.
 */
public class ParserUtilsTest {

    @Test
    public void testEmitUnicode() throws Exception {
        System.out.println(ParserUtils.emitUnicode("account-holder-withdraws-cash;account-has-\u0027sufficient-funds\u0027;;2"));
        System.out.println(ParserUtils.emitUnicode("\"output\": [\"\\u003cdiv\\u003esome other text\\u003c/div\\u003e\",\"<div>wooops</div>\"],\n" +
                "                        \"matchedColumns\":[0]"));
    }

}
