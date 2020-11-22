package softsystem.equation.alghoritms;

import java.util.Arrays;
import java.util.Collections;

public class LexicographicFunctions extends AlgorithmsFunctions implements Algorithm {

    @Override
    public void process(Integer[] elements) {
        Arrays.sort(elements);
        boolean hasNext = true;

        while (hasNext) {
            equationSolver(elements);
            int k = 0, l = 0;
            hasNext = false;
            for (int i = elements.length - 1; i > 0; i--) {
                if (elements[i].compareTo(elements[i - 1]) > 0) {
                    k = i - 1;
                    hasNext = true;
                    break;
                }
            }

            for (int i = elements.length - 1; i > k; i--) {
                if (elements[i].compareTo(elements[k]) > 0) {
                    l = i;
                    break;
                }
            }

            swap(elements, k, l);
            Collections.reverse(Arrays.asList(elements).subList(k + 1, elements.length));
        }
    }

    @Override
    public void printName() {
        System.out.println("Lexicographic Algorithm");
    }
}
