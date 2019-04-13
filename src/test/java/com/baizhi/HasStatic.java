package com.baizhi;

public class HasStatic {// 1
    private static int x = 100;// 2

    public static void main(String args[]) {// 3
        HasStatic hsl = new HasStatic();// 4
        System.out.println(x);
        hsl.x++;// 5
        System.out.println(x);
        HasStatic hs2 = new HasStatic();// 6
        hs2.x++;// 7
        System.out.println(x);
        hsl = new HasStatic();// 8
        hsl.x++;// 9
        System.out.println(x);
        HasStatic.x--;// 10
        System.out.println(x);
        System.out.println(" x=" + x);// 11
    }
}