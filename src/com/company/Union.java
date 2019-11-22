package com.company;

public class Union {

    private int[] intArray = {0, 9, 6, 4, 4, 2, 6, 1, 0, 5};
    private int count;


    int[] getArray(){
        return intArray;
    }
    int getCount(){

        return this.count;

    }

    public boolean connected(int p, int q) {

        return this.intArray[p - 1] == this.intArray[q - 1];

    }

    public void union(int p,int q) {

        this.intArray[p-1] = q;

        }

         int root(int p) {
        this.count = 1;
        int a = this.intArray[p-1];
        int b = this.intArray[a];

        while(a!=b) {

            a=this.intArray[b];
            b=this.intArray[a];

            this.count++;
    }
           return a;
        }


    }


