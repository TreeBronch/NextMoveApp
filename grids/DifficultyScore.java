package grids;

import java.util.Arrays;

public class DifficultyScore {
    private int[][] intCell;

    public DifficultyScore() {
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

        int top1 = 0; //G13
        int top2 = 0; //H13
        int top3 = 0; //I13
        int top4 = 0; //J13
        int top5 = 0; //K13
        int top6 = 0; //L13
        int top7 = 0; //M13
        int top8 = 0; //N13
        int top9 = 0; //O13

        int middle1 = 0; //G14
        int middle2 = 0; //H14
        int middle3 = 0; //I14
        int middle4 = 0; //J14
        int middle5 = 0; //K14
        int middle6 = 0; //L14
        int middle7 = 0; //M14
        int middle8 = 0; //N14
        int middle9 = 0; //O14

        int bottom1 = 0; //G15
        int bottom2 = 0; //H15
        int bottom3 = 0; //I15
        int bottom4 = 0; //J15
        int bottom5 = 0; //K15
        int bottom6 = 0; //L15
        int bottom7 = 0; //M15
        int bottom8 = 0; //N15
        int bottom9 = 0; //O15

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
