package grids;

import java.util.Arrays;

public class PotentialPoints {
    private int[][] intCell;

    public PotentialPoints() {
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

        int top1 = 0; //G8
        int top2 = 0; //H8
        int top3 = 0; //I8
        int top4 = 0; //J8
        int top5 = 0; //K8
        int top6 = 0; //L8
        int top7 = 0; //M8
        int top8 = 0; //N8
        int top9 = 0; //O8

        int middle1 = 0; //G9
        int middle2 = 0; //H9
        int middle3 = 0; //I9
        int middle4 = 0; //J9
        int middle5 = 0; //K9
        int middle6 = 0; //L9
        int middle7 = 0; //M9
        int middle8 = 0; //N9
        int middle9 = 0; //O9

        int bottom1 = 0; //G10
        int bottom2 = 0; //H10
        int bottom3 = 0; //I10
        int bottom4 = 0; //J10
        int bottom5 = 0; //K10
        int bottom6 = 0; //L10
        int bottom7 = 0; //M10
        int bottom8 = 0; //N10
        int bottom9 = 0; //O10

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
