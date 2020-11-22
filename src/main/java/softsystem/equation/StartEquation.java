package softsystem.equation;

public class StartEquation {

    public static void main(String[] args) {
        Functions functions = new Functions();
        functions.processAlgorithm(new HeapIterativeFunctions());
        functions.processAlgorithm(new HeapRecursiveFunctions());
        functions.processAlgorithm(new LexicographicFunctions());
        functions.processAlgorithm(new SteinhausJohnsonTrotterFunctions());

    }
}

/*
 * Sources:
 * https://www.codeproject.com/Articles/1250925/Permutations-Fast-implementations-and-a-new-indexi
 * http://combos.org/perm
 * https://en.wikipedia.org/wiki/Permutation#Permutations_in_computing
 * https://www.baeldung.com/java-array-permutations
 * https://code.sololearn.com/cz8eU44ocu26/#java
 */