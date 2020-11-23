package softsystem.equation;

import softsystem.equation.alghoritms.HeapIterativeFunctions;
import softsystem.equation.alghoritms.HeapRecursiveFunctions;
import softsystem.equation.alghoritms.LexicographicFunctions;
import softsystem.equation.alghoritms.SteinhausJohnsonTrotterFunctions;

public class StartEquation {

    public static void main(String[] args) {
        final Integer[] elements = {1,2,3,4,5,6,7,8,9};

        AlgorithmRunner algorithmRunner = new AlgorithmRunner(elements);
        algorithmRunner.processAlgorithm(new HeapIterativeFunctions());
        algorithmRunner.processAlgorithm(new HeapRecursiveFunctions());
        algorithmRunner.processAlgorithm(new LexicographicFunctions());
        algorithmRunner.processAlgorithm(new SteinhausJohnsonTrotterFunctions());
    }
}

/*
 * Sources:
 * https://www.codeproject.com/Articles/1250925/Permutations-Fast-implementations-and-a-new-indexi - speed graph
 * http://combos.org/perm - generator
 * https://en.wikipedia.org/wiki/Permutation#Permutations_in_computing - wiki
 * https://www.baeldung.com/java-array-permutations - heap, lexico
 * https://code.sololearn.com/cz8eU44ocu26/#java - sjt algorithm
 * https://www.geeksforgeeks.org/johnson-trotter-algorithm/ - sjt theory
 * https://stackoverflow.com/questions/3255/big-o-how-do-you-calculate-approximate-it - big o
 */