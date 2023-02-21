import grids.*;
import utils.Calculations;

public class Main {
    public static void main(String[] args) {
        CurrentGrid currentGrid = new CurrentGrid();
        System.out.println(currentGrid.top4);
        Calculations calculations = new Calculations();
        calculations.calculate();
        System.out.println("Node Grid: ");
        System.out.println("");
        CurrentGrid nodeGrid = new CurrentGrid();
        nodeGrid.printGrid();
        System.out.println("");
        System.out.println("Point Potential Grid: ");
        System.out.println("");
        PotentialPoints potentialPoints = new PotentialPoints();
        potentialPoints.printGrid();
        System.out.println("");
        System.out.println("Difficulty Score Grid:");
        System.out.println("");
        DifficultyScore difficultyScore = new DifficultyScore();
        difficultyScore.printGrid();
        System.out.println("");
        System.out.println("Dynamic Location Score Grid:");
        System.out.println("");
        DynamicLocationScore dynamicLocationScore = new DynamicLocationScore();
        dynamicLocationScore.printGrid();
        System.out.println("");
        System.out.println("Dynamic Link Location Grid:");
        System.out.println("");
        DynamicLinkLocation dynamicLinkLocation = new DynamicLinkLocation();
        dynamicLinkLocation.printGrid();
        System.out.println("");
        System.out.println("Dynamic Cooperation Bonus Grid:");
        System.out.println("");
        DynamicCooperationBonus dynamicCooperationBonus = new DynamicCooperationBonus();
        dynamicCooperationBonus.printGrid();
        System.out.println("");
        System.out.println("Dynamic Link Starts Grid:");
        System.out.println("");
        DynamicLinkStarts dynamicLinkStarts = new DynamicLinkStarts();
        dynamicLinkStarts.printGrid();
        System.out.println("");
        System.out.println("Next Grid Spot Grid:");
        System.out.println("");
        NextGridSpot nextGridSpot = new NextGridSpot();
        nextGridSpot.printGrid();


    }
}
