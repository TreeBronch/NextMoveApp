package grids;

import java.util.Arrays;

public class DynamicLinkLocation {
    int[][] intCell;

    public DynamicLinkLocation() {
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

        int top1 = 0; //G23
        int top2 = 0; //H23
        int top3 = 0; //I23
        int top4 = 0; //J23
        int top5 = 0; //K23
        int top6 = 0; //L23
        int top7 = 0; //M23
        int top8 = 0; //N23
        int top9 = 0; //O23

        int middle1 = 0; //G24
        int middle2 = 0; //H24
        int middle3 = 0; //I24
        int middle4 = 0; //J24
        int middle5 = 0; //K24
        int middle6 = 0; //L24
        int middle7 = 0; //M24
        int middle8 = 0; //N24
        int middle9 = 0; //O24

        int bottom1 = 0; //G25
        int bottom2 = 0; //H25
        int bottom3 = 0; //I25
        int bottom4 = 0; //J25
        int bottom5 = 0; //K25
        int bottom6 = 0; //L25
        int bottom7 = 0; //M25
        int bottom8 = 0; //N25
        int bottom9 = 0; //O25

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
