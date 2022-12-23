package com.exercise.project.exerciseproject.trees;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.List;
import java.util.stream.Stream;

import static com.exercise.project.exerciseproject.trees.TreeProvider.*;

public class RightSideViewProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of(List.of(1, 2), createTree1()),
                Arguments.of(List.of(1, 5, 3, 4), createTree2()),
                Arguments.of(List.of(1, 3, 6), createTree3())
        );
    }


}
