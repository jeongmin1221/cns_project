package com.example.cns_456;

public class keyword_class {

    private String LawName;
    private String LawContent;

    public keyword_class(String LawName, String LawContent){
        this.LawName=LawName;
        this.LawContent=LawContent;
    }

    public void setLawName(String LawName) {
        this.LawName =LawName;
    }

    public void setLawContent(String LawContent) {
        this.LawContent=LawContent;
    }

    public String getLawName() {
        return LawName;
    }

    public String getLawContent() {
        return LawContent;
    }
}
