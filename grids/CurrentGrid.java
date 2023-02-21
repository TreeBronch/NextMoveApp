package grids;

import java.util.Arrays;

public class CurrentGrid {
            public boolean top1 = true; //G3
            public boolean top2 = true; //H3
            public boolean top3 = true; //I3
            public boolean top4; //J3
            public boolean top5 = true; //K3
            public boolean top6 = true; //L3
            public boolean top7 = true; //M3
            public boolean top8 = true; //N3
            public boolean top9 = true; //O3

            public boolean middle1 = false; //G4
            public boolean middle2 = false; //H4
            public boolean middle3 = false; //I4
            public boolean middle4 = false; //J4
            public boolean middle5 = false; //K4
            public boolean middle6 = false; //L4
            public boolean middle7 = false; //M4
            public boolean middle8 = false; //N4
            public boolean middle9 = false; //O4

            public boolean bottom1 = true; //G5
            public boolean bottom2 = true; //H5
            public boolean bottom3 = true; //I5
            public boolean bottom4 = true; //J5
            public boolean bottom5 = true; //K5
            public boolean bottom6 = true; //L5
            public boolean bottom7 = true; //M5
            public boolean bottom8 = true; //N5
            public boolean bottom9 = true; //O5
private boolean[][] booleanCells;

    public CurrentGrid() {
        booleanCells = new boolean[3][9];
    }

    public void setTopRow(boolean[] topRow) {
        for (int i = 0; i < 9; i++) {
            booleanCells[0][i] = topRow[i];
        }
    }

    public void setMiddleRow(boolean[] middleRow) {
        for (int i = 0; i < 9; i++) {
            booleanCells[1][i] = middleRow[i];
        }
    }

    public void setBottomRow(boolean[] bottomRow) {
        for (int i = 0; i < 9; i++) {
            booleanCells[2][i] = bottomRow[i];
        }
    }

    public boolean[][] getIntCells() {
        return booleanCells;
    }

    public void printGrid() {
        boolean[] topRow = getIntCells()[0];
        boolean[] middleRow = getIntCells()[1];
        boolean[] bottomRow = getIntCells()[2];

        boolean[] newTopRow = {top1, top2, top3, top4, top5, top6, top7, top8, top9};
        setTopRow(newTopRow);

        boolean[] newMiddleRow = {middle1, middle2, middle3, middle4, middle5, middle6, middle7, middle8, middle9};
        setMiddleRow(newMiddleRow);

        boolean[] newBottomRow = {bottom1, bottom2, bottom3, bottom4, bottom5, bottom6, bottom7, bottom8, bottom9};
        setBottomRow(newBottomRow);

        System.out.println("Top: " + Arrays.toString(topRow));
        System.out.println("Middle: " + Arrays.toString(middleRow));
        System.out.println("Bottom: " + Arrays.toString(bottomRow));
    }

}