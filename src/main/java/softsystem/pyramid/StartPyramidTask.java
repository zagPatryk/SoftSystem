package softsystem.pyramid;

public class StartPyramidTask {
    public static void main(String[] args) {
        Functions functions = new Functions();

        System.out.println(functions.countElements(4));
        System.out.println(functions.getBlockNumber(2,2,2,3));
    }
}
