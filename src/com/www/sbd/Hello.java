package com.www.sbd;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Hello {
    public static void main(String[] args) {
        Hello h = new Hello();

        for (int j = 101; j <= 200; j++) {
            if (h.shushu(j) == true)
                System.out.println(j);
        }
    }
    public boolean shushu(int x) {
        for (int i = 0;i<=x/2;i++)
            if (x%2 == 0)
                return false;
        return true;
    }
}




