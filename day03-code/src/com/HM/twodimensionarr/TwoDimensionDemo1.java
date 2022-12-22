package com.HM.twodimensionarr;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        int[][] arr1 =new int[][]{{1,2,3},{4,3,5,6,7}};

        System.out.println(arr1[0]);
        System.out.println(arr1[0][1]);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] +" ");
            }
            System.out.println();
        }
    }
}
