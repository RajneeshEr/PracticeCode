package com.java.practice.PracticeJava.MultiThreading.example3;

public class ImageProcessing {
    public static void main(String[] args) {

    }

    public static int getRed(int rbg){
        return (rbg & 0x00FF0000) >>16;
    }

    public static int getGreen(int rbg){
        return (rbg & 0x0000FF00) >>8;
    }

    public static int getBlue(int rgb){
        return rgb & 0x000000FF;
    }
}