package softsystem.equation;

// https://www.baeldung.com/java-array-permutations
public class HeapRecursiveFunctions extends Functions implements Algorithm {

    public void process(Integer[] elements) {
        recursiveMethod(elements.length, elements);
    }

    public void recursiveMethod(int n, Integer[] elements) {
        if(n == 1) {
            equationSolver(elements);
        } else {
            for(int i = 0; i < n-1; i++) {
                recursiveMethod(n - 1, elements);
                if(n % 2 == 0) {
                    swap(elements, i, n-1);
                } else {
                    swap(elements, 0, n-1);
                }
            }
            recursiveMethod(n - 1, elements);
        }
    }

    @Override
    public void printName() {
        System.out.println("Heap Recursive Functions");
    }
}
