package softsystem.pyramid;

public class StartPyramidTask {
    public static void main(String[] args) {
        Functions functions = new Functions();

        System.out.println(functions.countElements(11));
        System.out.println(functions.getBlockNumber(1,1,11,11));
    }
}
