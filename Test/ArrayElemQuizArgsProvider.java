import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class ArrayElemQuizArgsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(new int[]{},1,new int[]{}),
                Arguments.of(new int[]{2},1,new int[]{2}),
                Arguments.of(new int[]{2,3},1,new int[]{2,3}),
                Arguments.of(new int[]{2,2},-1,new int[]{2,2}),
                Arguments.of(new int[]{3,2},-1,new int[]{3,2}),
                Arguments.of(new int[]{0,0},-1,new int[]{0,0}),
                Arguments.of(new int[]{},-1,new int[]{}),
                Arguments.of(new int[]{1,2},0,new int[]{1,2}),
                Arguments.of(new int[]{2,1},0,new int[]{2,1}),
                Arguments.of(new int[]{0},0,new int[]{0})
        );
    }
}
