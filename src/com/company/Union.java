package com.company;

public class Union {

    private int[] intArray = {0, 9, 6, 4, 4, 2, 6, 1, 0, 5};
    private int count;


    public int[] getArray(){
        return intArray;
    }
    public int getCount(){

        return this.count;

    }

    public boolean connected(int p, int q) {

        return this.intArray[p - 1] == this.intArray[q - 1];

    }

    public void union(int p,int q) {

        this.intArray[p-1] = q;

        }

        public int root(int p) {
        this.count = 1;
        int y = this.intArray[p-1];
        int z = this.intArray[y];


        while(y!=z) {

            System.out.println(y+" "+z);
            y= this.intArray[z];
            z=this.intArray[y];
            this.count++;
    }
           return y;
        }


    }


