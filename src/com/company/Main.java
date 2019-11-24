package com.company;

public class Main {

    public static void main(String[] args) {
		Union union = new Union();
		WeightedUnion weightedUnion = new WeightedUnion();


		weightedUnion.weightedUnion(5,4);
		weightedUnion.weightedUnion(4,9);
		weightedUnion.weightedUnion(7,6);
		weightedUnion.weightedUnion(10,5);
		weightedUnion.weightedUnion(3,2);
		weightedUnion.weightedUnion(6,1);
		weightedUnion.weightedUnion(8,3);
		weightedUnion.weightedUnion(7,2);
		weightedUnion.weightedUnion(8,4);
		System.out.println();
    }
}
