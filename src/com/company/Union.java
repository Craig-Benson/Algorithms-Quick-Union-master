package com.company;

public class Union {

//    private int[] intArray = {0, 9, 6, 4, 4, 2, 6, 1, 0, 5};
private int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
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
        this.count = 0;
        int a = this.intArray[p-1];
        int b = this.intArray[a];

        while(a!=b) {
            this.count++;
            a=this.intArray[b];
            b=this.intArray[a];

            this.count++;
    }
        for(int i: intArray){
            if(intArray[i]==a){
                this.count++;
            }
        }
           return a;
        }


    }


