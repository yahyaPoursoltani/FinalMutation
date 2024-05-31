package edu.sharif.test.mutationPrac.mutants.ScalarVariableReplacement;

import edu.sharif.test.mutationPrac.ArrayElemQuizArgsProvider;
import edu.sharif.test.mutationPrac.mutants.RelationalOperatorReplacementMutants.operators.MU_02_ROR_02_NEQ;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.*;

class MU_09_SVR_02Test {
    @DisplayName("MU_09_SVR_02")
    @ParameterizedTest(name = "Test {index} : remove {1} from {0} results {2}.")
    @ArgumentsSource(ArrayElemQuizArgsProvider.class)
    public void removeFromArrayTest(int inputArray[], int inputInteger, int expectedOutputArray[]){
        Assertions.assertArrayEquals(expectedOutputArray, MU_09_SVR_02.deleteAllVal(inputArray,inputInteger));
    }
}