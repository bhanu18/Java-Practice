package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall(){
 this(5,4);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            width=0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            height=0;
        }
        this.height = height;
    }
    public double getArea(){
        return getWidth() * getHeight();
    }

    public Wall(double width, double height){
        if(width<0){
            width=0;
            System.out.println("Width = "+width);
        }
        if (height<0){
            height=0;
            System.out.println("Height = "+this.height);
        }
        this.width= width;
        this.height= height;
    }
}
