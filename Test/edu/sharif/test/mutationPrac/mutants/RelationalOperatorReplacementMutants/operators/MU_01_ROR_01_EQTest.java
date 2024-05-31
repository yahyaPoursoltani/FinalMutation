package edu.sharif.test.mutationPrac.mutants.RelationalOperatorReplacementMutants.operators;

import edu.sharif.test.mutationPrac.ArrayElemQuizArgsProvider;
import edu.sharif.test.mutationPrac.MutationQuizUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.*;

class MU_01_ROR_01_EQTest {
    @DisplayName("MU_01_ROR_01_EQ")
    @ParameterizedTest(name = "Test {index} : remove {1} from {0} results {2}.")
    @ArgumentsSource(ArrayElemQuizArgsProvider.class)
    public void removeFromArrayTest(int inputArray[], int inputInteger, int expectedOutputArray[]){
        Assertions.assertArrayEquals(expectedOutputArray, MU_01_ROR_01_EQ.deleteAllVal(inputArray,inputInteger));
    }
}