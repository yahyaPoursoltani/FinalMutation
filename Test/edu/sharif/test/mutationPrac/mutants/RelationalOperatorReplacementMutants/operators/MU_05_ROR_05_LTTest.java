package edu.sharif.test.mutationPrac.mutants.RelationalOperatorReplacementMutants.operators;

import edu.sharif.test.mutationPrac.ArrayElemQuizArgsProvider;
import edu.sharif.test.mutationPrac.KillerArgsProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.*;

class MU_05_ROR_05_LTTest {
    @DisplayName("MU_05_ROR_05_LT")
    @ParameterizedTest(name = "Test {index} : remove {1} from {0} results {2}.")
    @ArgumentsSource(ArrayElemQuizArgsProvider.class)
    public void removeFromArrayTest(int inputArray[], int inputInteger, int expectedOutputArray[]){
        Assertions.assertArrayEquals(expectedOutputArray, MU_05_ROR_05_LT.deleteAllVal(inputArray,inputInteger));
    }

    @DisplayName("Killer MU_05_ROR_05_LT")
    @ParameterizedTest(name = "Test {index} : remove {1} from {0} results {2}.")
    @ArgumentsSource(KillerArgsProvider.class)
    public void removeFromArrayTestKiller(int inputArray[], int inputInteger, int expectedOutputArray[]){
        Assertions.assertArrayEquals(expectedOutputArray, MU_05_ROR_05_LT.deleteAllVal(inputArray,inputInteger));
    }
}