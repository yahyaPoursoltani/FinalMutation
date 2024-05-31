package edu.sharif.test.mutationPrac.mutants.ScalarVariableReplacement;

public class MU_11_SVR_04 {
    /*
    * Effects
    *numbers -> remnum
    * */
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
            if(remnum[i]>=val1) //TODO FAULTY INSTRUCTION
            {
                remnum[j] = numbers[i];
                j=j+1;
            }

        return remnum;
    }
}
