package edu.sharif.test.mutationPrac;

public class Main {
    public static void main(String[] args) {
        for (int x: MutationQuizUtils.deleteAllVal(new int[]{2,1,2,3,5},3)) {
            System.out.println(x);
        }
    }
}