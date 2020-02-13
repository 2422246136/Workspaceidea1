package com.java;

import java.util.ArrayList;

/**
 * @autor 段昶峰
 * @date 2020/2/12 - 10:14
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println("hello");
        String[] arr = {"a1", "a2", "a3"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(12);
        for (Object o : list) {
            
        }
    }
}
