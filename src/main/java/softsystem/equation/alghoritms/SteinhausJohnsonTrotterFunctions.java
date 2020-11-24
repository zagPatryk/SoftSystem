package softsystem.equation.alghoritms;

import java.util.HashMap;

public class SteinhausJohnsonTrotterFunctions extends AlgorithmsFunctions implements Algorithm {
    private Integer[] index;
    private Integer[] elements;
    private HashMap<Integer, String> direction;

    @Override
    public void process(Integer[] elements) {
        this.elements = elements;
        index = new Integer[elements.length];
        direction = new HashMap<>();
        steinhausJohnsonTrotterAlgorithm();
    }

    public void steinhausJohnsonTrotterAlgorithm() {
        for(int i = 0; i < index.length; i++) {
            index[i] = i;
            direction.put(i, "left");
        }

        int mobile = 0;
        while(mobile != -1) {
            mobile = getMobile();
            createPermutation();
            swapMobile(mobile);
        }
    }

    public int getMobile(){
        int lm1 = index.length - 1;
        int maxMobile = -1;
        if(direction.get(index[0]) == "right") {
            if(index[0] > index[1]) {
                maxMobile = index[0];
            }
        }

        for(int i = 1; i < lm1; i++) {
            if(index[i] > maxMobile) {
                if (direction.get(index[i]) == "left") {
                    if(index[i] > index[i-1]) {
                        maxMobile = index[i];
                    }
                } else {
                    if(index[i] > index[i + 1]) {
                        maxMobile = index[i];
                    }
                }
            }
        }

        if(direction.get(lm1) == "left") {
            if(index[lm1] > maxMobile && index[lm1] > index[lm1-1]) {
                maxMobile = index[lm1];
            }
        }

        for(int j : index) {
            if(maxMobile < j) {
                if(direction.get(j) == "left") {
                    direction.put(j, "right");
                } else {
                    direction.put(j, "left");
                }
            }
        }
        return maxMobile;
    }

    public void swapMobile(int mobile) {
        int x = 0;
        for(int i = 0; i < index.length; i++) {
            if(mobile == index[i]){
                x = i;
            }
        }
        if(direction.get(mobile) == "left") {
            swap(index, x, x - 1);
        } else {
            swap(index, x, x + 1);
        }
    }

    public void createPermutation() {
        Integer[] results = new Integer[index.length];
        for(int i = 0; i < index.length; i++) {
            results[i] = elements[index[i]];
        }
        equationSolver(results);
    }

    @Override
    public void printName() {
        System.out.println("Steinhaus Johnson Trotter Algorithm");
    }
}
