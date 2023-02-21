package utils;

import grids.CurrentGrid;
import grids.NextGridSpot;

public class Calculations {
    public void calculate() {
        CurrentGrid currentGrid = new CurrentGrid();

        currentGrid.top1 = true;
        currentGrid.top2 = true;
        currentGrid.top3 = true;
        currentGrid.top5 = true;
        currentGrid.top6 = true;
        currentGrid.top7 = true;
        currentGrid.top8 = true;
        currentGrid.top9 = true;

        currentGrid.middle1 = true;
        currentGrid.middle2 = true;
        currentGrid.middle3 = true;
        currentGrid.middle4 = true;
        currentGrid.middle5 = true;
        currentGrid.middle6 = true;
        currentGrid.middle7 = true;
        currentGrid.middle8 = true;
        currentGrid.middle9 = true;

        currentGrid.bottom1 = true;
        currentGrid.bottom2 = true;
        currentGrid.bottom3 = true;
        currentGrid.bottom4 = true;
        currentGrid.bottom5 = true;
        currentGrid.bottom6 = true;
        currentGrid.bottom7 = true;
        currentGrid.bottom8 = true;
        currentGrid.bottom9 = true;

        NextGridSpot nextGridSpot = new NextGridSpot();

        nextGridSpot.top1 = 0;
        nextGridSpot.top2 = 0;
        nextGridSpot.top3 = 0;
        nextGridSpot.top5 = 0;
        nextGridSpot.top6 = 0;
        nextGridSpot.top7 = 0;
        nextGridSpot.top8 = 0;
        nextGridSpot.top9 = 0;

        nextGridSpot.middle1 = 0;
        nextGridSpot.middle2 = 0;
        nextGridSpot.middle3 = 0;
        nextGridSpot.middle4 = 0;
        nextGridSpot.middle5 = 0;
        nextGridSpot.middle6 = 0;
        nextGridSpot.middle7 = 0;
        nextGridSpot.middle8 = 0;
        nextGridSpot.middle9 = 0;

        nextGridSpot.bottom1 = 0;
        nextGridSpot.bottom2 = 0;
        nextGridSpot.bottom3 = 0;
        nextGridSpot.bottom4 = 0;
        nextGridSpot.bottom5 = 0;
        nextGridSpot.bottom6 = 0;
        nextGridSpot.bottom7 = 0;
        nextGridSpot.bottom8 = 0;
        nextGridSpot.bottom9 = 0;

        if (currentGrid.top1) {
            nextGridSpot.top1 = 10;
        }
        else if (!currentGrid.top1) {
            nextGridSpot.top1 = 10;
        }
    }
}
