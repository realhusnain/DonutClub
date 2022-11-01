package com.example.firstpage.models;

public class ModelChat {

    private String txt;
    boolean isSender;

    public ModelChat(String txt, boolean isSender) {
        this.txt = txt;
        this.isSender = isSender;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public boolean isSender() {
        return isSender;
    }

    public void setSender(boolean sender) {
        isSender = sender;
    }
}
