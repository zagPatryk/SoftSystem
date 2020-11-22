package softsystem.equation;

import java.util.Arrays;

public class Functions {
    private final Integer[] elements = {1,2,3,4,5,6,7,8,9};

    public void equationSolver(Integer[] elements) {
        if (elements.length == 9) {
            int firstNumber = elements[0];
            int secondNumber = elements[1] * 10 + elements[2];
            int thirdNumber = elements[3] * 100 + elements[4] * 10 + elements[5];
            int forthNumber = elements[6] * 10 + elements[7];
            int fifthNumber = elements[8];

            if (firstNumber * secondNumber == thirdNumber && thirdNumber == forthNumber * fifthNumber) {
                System.out.println(Arrays.toString(elements));
            }
        }
    }

    public void swap(Integer[] elements, int a, int b) {
        int tmpElement = elements[a];
        elements[a] = elements[b];
        elements[b] = tmpElement;
    }

    public void processAlgorithm(Algorithm algorithm) {

        System.out.println("/* Start Obliczeń */");
        algorithm.printName();
        long startTime = System.currentTimeMillis();

        System.out.println("/* Obliczenia */");
        algorithm.process(elements);

        System.out.println("/* Koniec obliczeń */");
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Czas obliczeń: " + result);

        System.out.println();
    }
}
