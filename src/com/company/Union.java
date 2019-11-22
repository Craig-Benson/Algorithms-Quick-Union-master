package com.company;

import java.util.Arrays;

public class Union {

        private int[] intArrayA = {0, 9, 6, 4, 4, 2, 6, 1, 0, 5};


    public boolean connected(int p, int q) {
        return intArrayA[p - 1] == intArrayA[q - 1];
    }

    public void union(int p,int q) {

        intArrayA[p-1] = q;

        }


    public void root(int p) {

        int y = intArrayA[p-1];
        int z = intArrayA[y];

        while(y!=z) {

            System.out.println(y+" "+z);
            y= intArrayA[z];
            z=intArrayA[y];

    }
        System.out.println(y);
    }
    }


