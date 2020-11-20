package softsystem.pyramid;

public class Functions {

    public int countElements(int baseSize) {
        if (baseSize <= 0) {
            System.out.println("Number cannot be less than or equal to 0");
            return -1;
        }

        int blocksNumber = 0;
        for (int i = baseSize; i > 0; i--) {
            blocksNumber += i * i;
        }

        return blocksNumber;
    }

    public int getBlockNumber(int row, int column, int level, int baseSize) {
        if (row <= 0 || column <= 0 || level <= 0 || baseSize <= 0) {
            System.out.println("Numbers cannot be less than or equal to 0");
            return -1;
        } else if (row > baseSize || column > baseSize || level > baseSize) {
            System.out.println("The row, column and level cannot be larger than the base size");
            return -1;
        } else if (row > (baseSize - level + 1) || column > (baseSize - level + 1) ) {
            System.out.println("The specified coordinates are incorrect");
            return -1;
        }

        int blocksUnder = 0;
        for (int i = baseSize; i > (baseSize - level + 1); i--) {
            blocksUnder += i * i;
        }

        int addRowValue = 1 + (row - 1) * (baseSize - level + 1);
        int addColumnValue = column - 1;

        return blocksUnder + addRowValue + addColumnValue;
    }
}
