package softsystem.equation;

public class HeapRecursiveFunctions extends Functions implements Algorithm {

    public void process(Integer[] elements) {
        recursiveMethod(elements.length, elements);
    }

    public void recursiveMethodC(int n, Integer[] elements) {
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

    public void recursiveMethod(int n, Integer[] elements) {
        if(n == elements.length - 1) {
            equationSolver(elements);
        } else {
            for(int i = n; i < elements.length; i++) {
                swap(elements, i, n);
                recursiveMethodC(n+1, elements);
                swap(elements, i, n);
            }
            recursiveMethod(n - 1, elements);
        }
    }

    @Override
    public void printName() {
        System.out.println("Heap Recursive Functions");
    }
}
