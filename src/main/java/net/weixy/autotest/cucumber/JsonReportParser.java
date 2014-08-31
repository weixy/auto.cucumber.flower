package net.weixy.autotest.cucumber;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import net.weixy.autotest.cucumber.model.Feature;
import net.weixy.autotest.cucumber.utils.ParserUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by weixy on 30/08/14.
 */
public class JsonReportParser {
    private Map<String, List<Feature>> jsonReports;

    public JsonReportParser(List<String> jsonReportFiles) throws IOException {
        jsonReports = parseJson(jsonReportFiles);
    }

    public Map<String, List<Feature>> getJsonReports() {
        return jsonReports;
    }

    private Map<String, List<Feature>> parseJson(List<String> jsonReportFiles) throws IOException {
        Map<String, List<Feature>> results = new LinkedHashMap<String, List<Feature>>();
        for (String jsonFile : jsonReportFiles) {
            String content = Files.toString(new File(jsonFile), Charsets.UTF_8);
            Feature[] features = new Gson().fromJson(ParserUtils.emitUnicode(content), Feature[].class);
            results.put(jsonFile, Arrays.asList(features));
        }
        return results;
    }
}
