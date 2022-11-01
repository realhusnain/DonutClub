package com.example.firstpage.models;

public class ModelClass {
    private int imageview1;
    private String text1;
    private String text2;
    private String text3;


    public ModelClass(int imageview1, String text1, String text2, String text3) {
        this.imageview1 = imageview1;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }

    public int getImageview1() {
        return imageview1;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

}
