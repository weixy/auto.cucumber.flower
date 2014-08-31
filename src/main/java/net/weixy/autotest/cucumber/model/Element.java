package net.weixy.autotest.cucumber.model;

/**
 * Created by weixy on 31/08/14.
 */
public class Element {

    private String id;
    private String name;
    private String description;
    private String keyword;
    private Tag[] tags;
    private String line;
    private Step[] steps;

    public Element() {
    }

    public String getId() {
        return id;
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

    public String getLine() {
        return line;
    }

    public Step[] getSteps() {
        return steps;
    }
}
