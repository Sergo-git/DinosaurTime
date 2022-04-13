package com.example.android.jp;

import java.io.Serializable;

public class ListElementEra implements Serializable {

    public String nameEra;
    public String textEra0;
    public String textEra1;
    public String textEra2;
    public String textEra3;
    public String textEra4;
    public String textEra5;
    public String textEra6;

    public int imageEra;
    public int imageEra1;
    public int imageEra2;
    public int imageEra3;
    public int imageEra4;
    public int imageEra5;
    public int imageEra6;


    public ListElementEra(String nameEra,String textEra0,String textEra1,String textEra2,String textEra3,String textEra4,String textEra5,String textEra6,
                          int imageEra, int imageEra1, int imageEra2, int imageEra3, int imageEra4, int imageEra5,int imageEra6) {
        this.nameEra = nameEra;
        this.textEra0=textEra0;
        this.textEra1 = textEra1;
        this.textEra2 = textEra2;
        this.textEra3 = textEra3;
        this.textEra4 = textEra4;
        this.textEra5 = textEra5;
        this.textEra6 = textEra6;
        this.imageEra = imageEra;
        this.imageEra1=imageEra1;
        this.imageEra2=imageEra2;
        this.imageEra3=imageEra3;
        this.imageEra4=imageEra4;
        this.imageEra5=imageEra5;
        this.imageEra6=imageEra6;
    }

    public String getNameEra() {
        return nameEra;
    }

    public void setNameEra(String nameEra) {
        this.nameEra = nameEra;
    }

    public int getImageEra() {
        return imageEra;
    }

    public String getTextEra0() {
        return textEra0;
    }

    public String getTextEra1() {
        return textEra1;
    }

    public String getTextEra2() {
        return textEra2;
    }

    public String getTextEra3() {
        return textEra3;
    }

    public String getTextEra4() {
        return textEra4;
    }

    public String getTextEra5() {
        return textEra5;
    }

    public String getTextEra6() {
        return textEra6;
    }

    public void setImageEra(int imageEra) {
        this.imageEra = imageEra;
    }

    public int getImageEra1() {
        return imageEra1;
    }

    public int getImageEra2() {
        return imageEra2;
    }

    public int getImageEra3() {
        return imageEra3;
    }

    public int getImageEra4() {
        return imageEra4;
    }

    public int getImageEra5() {
        return imageEra5;
    }
    public int getImageEra6() {
        return imageEra6;
    }

}

