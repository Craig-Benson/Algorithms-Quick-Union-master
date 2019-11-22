package com.company;

public class WeightedUnion {

    private int[] intArray;
    Union union = new Union();

    public WeightedUnion(){
        
    this.intArray = union.getArray();

    }

    public int weightedUnion(int a, int b){


        int rootA = union.root(a);
        int countA = union.getCount();
        int rootB = union.root(b);
        int countB = union.getCount();

        if(countA<countB) {
            return intArray[rootA] = intArray[rootB];
        }else{
            return intArray[rootB] = intArray[rootA];
        }
    }






}
