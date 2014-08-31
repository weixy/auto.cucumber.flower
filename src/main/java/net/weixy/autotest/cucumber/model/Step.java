package net.weixy.autotest.cucumber.model;

/**
 * Created by weixy on 31/08/14.
 */
public class Step {

    private String name;
    private Result result;
    private String keyword;
    private String line;
    private Match match;
    private Object[] embeddings;
    private String[] output;

    public Step() {
    }

    public String getName() {
        return name;
    }

    public Result getResult() {
        return result;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getLine() {
        return line;
    }

    public Match getMatch() {
        return match;
    }

    public Object[] getEmbeddings() {
        return embeddings;
    }

    public String[] getOutput() {
        return output;
    }
}
