package softsystem.equation;

public class HeapIterativeFunctions extends Functions implements Algorithm {

    public void process(Integer[] elements) {
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

    @Override
    public void printName() {
        System.out.println("Heap Iterative Functions");
    }
}
