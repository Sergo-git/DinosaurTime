package com.example.android.jp;

import java.io.Serializable;

public class ListElement implements Serializable {

    String name;
    String description;
    String lifetime;
    String length;
    String height;
    String weight;
    String agression;
    int image;
    int image2;
    int image3;
    int image4;
    int image5;
    int image6;
    int image7;
    int image8;
    int imageAggressionIndex;
    String length0;
    String smlenght;
    String smheight;
    String kgweight;



    public ListElement(int image, int image2, int image3, int image4, int image5, int image6, int image7, int image8, int imageAggressionIndex,
                       String name,String length0, String length,String smlenght, String height,String smheight, String weight,String kgweight, String lifetime, String agression, String description) {

        this.name = name;
        this.description = description;
        this.image = image;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
        this.image5 = image5;
        this.image6 = image6;
        this.image7 = image7;
        this.image8 = image8;
        this.imageAggressionIndex = imageAggressionIndex;
        this.lifetime = lifetime;
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.agression = agression;
        this.length0 = length0;
        this.smlenght=smlenght;
        this.smheight=smheight;
        this.kgweight =kgweight;
    }







    public int getImage6() {
        return image6;
    }

    public void setImage6(int image6) {
        this.image6 = image6;
    }

    public int getImage7() {
        return image7;
    }

    public void setImage7(int image7) {
        this.image7 = image7;
    }

    public int getImage8() {
        return image8;
    }

    public void setImage8(int image8) {
        this.image8 = image8;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public int getImage4() {
        return image4;
    }

    public void setImage4(int image4) {
        this.image4 = image4;
    }

    public int getImage5() {
        return image5;
    }

    public void setImage5(int image5) {
        this.image5 = image5;
    }


    public String getLifetime() {
        return lifetime;
    }

    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAgression() {
        return agression;
    }

    public void setAgression(String agression) {
        this.agression = agression;
    }

    public int getImageAggressionIndex() {
        return imageAggressionIndex;

    }

    public void setImageAggressionIndex(int imageAggressionIndex) {
        this.imageAggressionIndex = imageAggressionIndex;
    }

    public String getLength0() {
        return length0;
    }

    public String getSmlenght() {
        return smlenght;
    }

    public String getSmheight() {
        return smheight;
    }

    public String getKgweight() {
        return kgweight;
    }




}
