package edu.sharif.test.mutationPrac.mutants.ScalarVariableReplacement;

import edu.sharif.test.mutationPrac.ArrayElemQuizArgsProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.*;

class MU_11_SVR_04Test {
    @DisplayName("MU_11_SVR_04")
    @ParameterizedTest(name = "Test {index} : remove {1} from {0} results {2}.")
    @ArgumentsSource(ArrayElemQuizArgsProvider.class)
    public void removeFromArrayTest(int inputArray[], int inputInteger, int expectedOutputArray[]){
        Assertions.assertArrayEquals(expectedOutputArray, MU_11_SVR_04.deleteAllVal(inputArray,inputInteger));
    }
}