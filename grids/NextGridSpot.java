package grids;

import java.util.Arrays;

public class NextGridSpot {

    public int top1 = 0; //G38
    public int top2 = 0; //H38
    public int top3 = 0; //I38
    public int top4; //J38
    public int top5 = 0; //K38
    public int top6 = 0; //L38
    public int top7 = 0; //M38
    public int top8 = 0; //N38
    public int top9 = 0; //O38

    public int middle1 = 0; //G39
    public int middle2 = 0; //H39
    public int middle3 = 0; //I39
    public int middle4 = 0; //J39
    public int middle5 = 0; //K39
    public int middle6 = 0; //L39
    public int middle7 = 0; //M39
    public int middle8 = 0; //N39
    public int middle9 = 0; //O39

    public int bottom1 = 0; //G40
    public int bottom2 = 0; //H40
    public int bottom3 = 0; //I40
    public int bottom4 = 0; //J40
    public int bottom5 = 0; //K40
    public int bottom6 = 0; //L40
    public int bottom7 = 0; //M40
    public int bottom8 = 0; //N40
    public int bottom9 = 0; //O40

    int[][] intCell;

    public NextGridSpot() {
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
