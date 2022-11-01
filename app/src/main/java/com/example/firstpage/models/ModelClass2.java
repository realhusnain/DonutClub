package com.example.firstpage.models;

public class ModelClass2 {

    private int iv_alex;
    private int main_img;
    private int draw_dot;

    private String text1;
    private String text2;

    private String text4;
    private String text5;

    private int iv_heart;
    private int iv_comment;
    private String text6;
    private String text7;

    boolean isLike;

    public boolean isLike() {
        return isLike;
    }

    public void setLike(boolean like) {
        isLike = like;
    }




    public ModelClass2(int iv_alex, int main_img, String text1, String text2, int draw_dot, String text4, String text5, int iv_heart, int iv_comment, String text6, String text7) {
        this.iv_alex = iv_alex;
        this.main_img = main_img;

        this.text1 = text1;
        this.text2 = text2;
        this.draw_dot = draw_dot;
        this.text4 = text4;
        this.text5 = text5;

        this.iv_heart = iv_heart;
        this.iv_comment = iv_comment;
        this.text6 = text6;
        this.text7 = text7;
    }

    public int getIv_alex() {
        return iv_alex;
    }


    public int getmainimg() {

        return main_img;
    }


    public int getDraw_dot() {
        return draw_dot;
    }

    public int getIv_heart() {
        return iv_heart;
    }

    public int getIv_comment() {
        return iv_comment;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }


    public String getText4() {
        return text4;
    }

    public String getText5() {
        return text5;
    }

    public String getText6() {
        return text6;
    }

    public String getText7() {
        return text7;
    }


}
