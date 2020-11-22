package softsystem.equation;

import softsystem.equation.alghoritms.Algorithm;

public class AlgorithmRunner {
    private final Integer[] elements;

    public AlgorithmRunner(Integer[] elements) {
        this.elements = elements;
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
