package grids;

import java.util.Arrays;

public class DynamicLocationScore {
    int[][] intCell;

    public DynamicLocationScore() {
        intCell = new int[3][9];
    }

    public void setTopRow(int[] topRow) {
        for (int i = 0; i < 9; i++) {
            intCell[0][i] = topRow[i];
        }
    }

    public void setMiddleRow(int[] middleRow) {
        for (int i = 0; i < 9; i++) {
            intCell[1][i] = middleRow[i];
        }
    }

    public void setBottomRow(int[] bottomRow) {
        for (int i = 0; i < 9; i++) {
            intCell[2][i] = bottomRow[i];
        }
    }

    public int[][] getIntCells() {
        return intCell;
    }

    public void printGrid() {
        int[] topRow = getIntCells()[0];
        int[] middleRow = getIntCells()[1];
        int[] bottomRow = getIntCells()[2];

        int top1 = 0; //G18
        int top2 = 0; //H18
        int top3 = 0; //I18
        int top4 = 0; //J18
        int top5 = 0; //K18
        int top6 = 0; //L18
        int top7 = 0; //M18
        int top8 = 0; //N18
        int top9 = 0; //O18

        int middle1 = 0; //G19
        int middle2 = 0; //H19
        int middle3 = 0; //I19
        int middle4 = 0; //J19
        int middle5 = 0; //K19
        int middle6 = 0; //L19
        int middle7 = 0; //M19
        int middle8 = 0; //N19
        int middle9 = 0; //O19

        int bottom1 = 0; //G20
        int bottom2 = 0; //H20
        int bottom3 = 0; //I20
        int bottom4 = 0; //J20
        int bottom5 = 0; //K20
        int bottom6 = 0; //L20
        int bottom7 = 0; //M20
        int bottom8 = 0; //N20
        int bottom9 = 0; //O20

        int[] newTopRow = {top1, top2, top3, top4, top5, top6, top7, top8, top9};
        setTopRow(newTopRow);

        int[] newMiddleRow = {middle1, middle2, middle3, middle4, middle5, middle6, middle7, middle8, middle9};
        setMiddleRow(newMiddleRow);

        int[] newBottomRow = {bottom1, bottom2, bottom3, bottom4, bottom5, bottom6, bottom7, bottom8, bottom9};
        setBottomRow(newBottomRow);

        System.out.println(Arrays.toString(topRow));
        System.out.println(Arrays.toString(middleRow));
        System.out.println(Arrays.toString(bottomRow));
    }
}
