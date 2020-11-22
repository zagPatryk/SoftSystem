package softsystem.equation;

// https://www.baeldung.com/java-array-permutations
public class HeapFunctions extends Functions {

    public void recursiveMethod(Integer[] elements) {
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

    public void iterativeMethod(Integer[] elements) {
        int n = elements.length;
        int[] indexes = new int[n];

        equationSolver(elements);

        int i = 0;
        while (i < n) {
            if (indexes[i] < i) {
                swap(elements, i % 2 == 0 ? 0 : indexes[i], i);
                equationSolver(elements);
                indexes[i]++;
                i = 0;
            } else {
                indexes[i] = 0;
                i++;
            }
        }
    }
}
