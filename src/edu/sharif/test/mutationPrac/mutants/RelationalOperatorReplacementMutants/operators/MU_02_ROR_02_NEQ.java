package edu.sharif.test.mutationPrac.mutants.RelationalOperatorReplacementMutants.operators;

public class MU_02_ROR_02_NEQ {

    public static int[] deleteAllVal(int[] numbers, int val1)
    {
        int[] remnum = new int[numbers.length];
        if(numbers==null){
            return numbers;
        }
        if(numbers.length==0){
            return numbers;
        }

        int len= numbers.length;
        int j=0;
        for(int i=0; i<len; i++)
            if(numbers[i]!=val1) //TODO FAULTY INSTRUCTION
            {
                remnum[j] = numbers[i];
                j=j+1;
            }

        return remnum;
    }
}
