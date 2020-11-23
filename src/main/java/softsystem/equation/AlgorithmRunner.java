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
        long startTime = System.nanoTime();

        System.out.println("/* Obliczenia */");
        algorithm.process(elements);

        System.out.println("/* Koniec obliczeń */");
        long endTime = System.nanoTime();
        long resultNano = endTime - startTime;
        double resultMillis = (double) (endTime - startTime) / 1000000 ;
        System.out.println("Czas obliczeń: " + resultNano + " nanosec");
        System.out.println("Czas obliczeń: " + resultMillis + " milisec");

        System.out.println();
    }

}
