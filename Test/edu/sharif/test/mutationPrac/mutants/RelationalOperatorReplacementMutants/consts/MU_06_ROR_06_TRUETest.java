package edu.sharif.test.mutationPrac.mutants.RelationalOperatorReplacementMutants.consts;

import edu.sharif.test.mutationPrac.ArrayElemQuizArgsProvider;
import edu.sharif.test.mutationPrac.KillerArgsProvider;
import edu.sharif.test.mutationPrac.MutationQuizUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.*;

class MU_06_ROR_06_TRUETest {

    @DisplayName("MU_06_ROR_06_TRUE")
    @ParameterizedTest(name = "Test {index} : remove {1} from {0} results {2}.")
    @ArgumentsSource(ArrayElemQuizArgsProvider.class)
    public void removeFromArrayTest(int inputArray[], int inputInteger, int expectedOutputArray[]){
        Assertions.assertArrayEquals(expectedOutputArray, MU_06_ROR_06_TRUE.deleteAllVal(inputArray,inputInteger));
    }

    @DisplayName("KILLER MU_06_ROR_06_TRUE")
    @ParameterizedTest(name = "Test {index} : remove {1} from {0} results {2}.")
    @ArgumentsSource(KillerArgsProvider.class)
    public void removeFromArrayTestKiller(int inputArray[], int inputInteger, int expectedOutputArray[]){
        Assertions.assertArrayEquals(expectedOutputArray, MU_06_ROR_06_TRUE.deleteAllVal(inputArray,inputInteger));
    }
}