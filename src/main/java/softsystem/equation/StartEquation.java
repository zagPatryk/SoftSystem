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
