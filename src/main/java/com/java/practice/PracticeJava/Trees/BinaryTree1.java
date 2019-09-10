package com.java.practice.PracticeJava.Trees;

public class BinaryTree1 {

    public static void main(String[] args) {
        int [] arr={10,20,30};
        int p=0;
        System.out.println(binarytree(p,arr));
    }

    public static int binarytree(int p, int[] arr){

        if (p != arr.length-1){
            binarytree(p+1, arr);
        }

        return arr[p];
    }
}