package com.example.dictionarydemo.Model;

public class Dictionary {
    private String vietnamese;
    private String english;
    private boolean check;

    public Dictionary(String vietnamese, String english, boolean check) {
        this.vietnamese = vietnamese;
        this.english = english;
        this.check = check;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
