package com.qyn.demo01;

/**
 *  冒泡排序算法
 * @author qiaoyn
 **/
public class BubbleSort {
    public static void main(String args[]){
        int arr[] = {1,34,23,27,43,13};
        System.out.println("排序前的顺序");
        printArr(arr);

        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的顺序：");
        printArr(arr);

    }

    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

}
