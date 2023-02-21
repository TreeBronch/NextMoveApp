package grids;

import java.util.Arrays;

public class DynamicCooperationBonus {
    int[][] intCell;

    public DynamicCooperationBonus() {
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

        int top1 = 0; //G28
        int top2 = 0; //H28
        int top3 = 0; //I28
        int top4 = 0; //J28
        int top5 = 0; //K28
        int top6 = 0; //L28
        int top7 = 0; //M28
        int top8 = 0; //N28
        int top9 = 0; //O28

        int middle1 = 0; //G29
        int middle2 = 0; //H29
        int middle3 = 0; //I29
        int middle4 = 0; //J29
        int middle5 = 0; //K29
        int middle6 = 0; //L29
        int middle7 = 0; //M29
        int middle8 = 0; //N29
        int middle9 = 0; //O29

        int bottom1 = 0; //G30
        int bottom2 = 0; //H30
        int bottom3 = 0; //I30
        int bottom4 = 0; //J30
        int bottom5 = 0; //K30
        int bottom6 = 0; //L30
        int bottom7 = 0; //M30
        int bottom8 = 0; //N30
        int bottom9 = 0; //O30

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
