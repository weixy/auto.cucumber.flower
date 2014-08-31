package net.weixy.autotest.cucumber.model;

/**
 * Created by weixy on 30/08/14.
 */
public class Feature {

    private String name;
    private String description;
    private String keyword;
    private Tag[] tags;
    private String uri;

    public Feature() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getKeyword() {
        return keyword;
    }

    public Tag[] getTags() {
        return tags;
    }

    public String getUri() {
        return uri;
    }
}
