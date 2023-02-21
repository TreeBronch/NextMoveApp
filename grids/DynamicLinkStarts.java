package grids;

import java.util.Arrays;
public class DynamicLinkStarts {
    int[][] intCell;

    public DynamicLinkStarts() {
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
        int top1 = 0; //G33
        int top2 = 0; //H33
        int top3 = 0; //I33
        int top4 = 0; //J33
        int top5 = 0; //K33
        int top6 = 0; //L33
        int top7 = 0; //M33
        int top8 = 0; //N33
        int top9 = 0; //O33

        int middle1 = 0; //G34
        int middle2 = 0; //H34
        int middle3 = 0; //I34
        int middle4 = 0; //J34
        int middle5 = 0; //K34
        int middle6 = 0; //L34
        int middle7 = 0; //M34
        int middle8 = 0; //N34
        int middle9 = 0; //O34

        int bottom1 = 0; //G35
        int bottom2 = 0; //H35
        int bottom3 = 0; //I35
        int bottom4 = 0; //J35
        int bottom5 = 0; //K35
        int bottom6 = 0; //L35
        int bottom7 = 0; //M35
        int bottom8 = 0; //N35
        int bottom9 = 0; //O35

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
