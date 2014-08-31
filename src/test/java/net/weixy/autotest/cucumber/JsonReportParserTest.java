package net.weixy.autotest.cucumber;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import net.weixy.autotest.cucumber.model.Feature;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by weixy on 31/08/14.
 */
public class JsonReportParserTest {

    @Test
    public void testJsonReportParserTest() throws IOException {
        List<String> jsonFiles = getTestJsonReport();
        JsonReportParser jsonParser = new JsonReportParser(jsonFiles);
        System.out.println(jsonParser.getJsonReports().size());
        for (String jsonFile : jsonFiles) {
            System.out.println(jsonFile);
            List<Feature> featureList = jsonParser.getJsonReports().get(jsonFile);
            for (Feature feature : featureList) {
                System.out.println("- " + feature.getName());
            }
        }
    }

    private List<String> getTestJsonReport() {
        List<String> jsonReports = new ArrayList<String>();
        jsonReports.add(Resources.getResource("net/weixy/autotest/cucumber/project1.json").getPath());
        jsonReports.add(Resources.getResource("net/weixy/autotest/cucumber/project2.json").getPath());
        jsonReports.add(Resources.getResource("net/weixy/autotest/cucumber/project3.json").getPath());
        return jsonReports;
    }
}
