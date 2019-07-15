package org.fasttrackit;

public class App {
    public static void main(String[] args) {
        LogicalOp countingForwards =new LogicalOp();
        countingForwards.countingForwards(4);
        System.out.println();
        LogicalOp countingBackwards = new LogicalOp();
        countingBackwards.countingBackwards(-4);
        LogicalOp countingBetween =new LogicalOp();
        System.out.println();
        countingBetween.countingBetween(24,8);
        System.out.println();
        LogicalOp countingBetweenForwards = new LogicalOp();
        countingBetweenForwards.countingBetweenForwards(24,6);
        System.out.println();
        LogicalOp evenNumbers = new LogicalOp();
        evenNumbers.evenNumbers();
        System.out.println();
        LogicalOp oddNumbers =new LogicalOp();
        oddNumbers.oddNumbers();
        System.out.println();
        LogicalOp sumFromXTo100 =new LogicalOp();
        sumFromXTo100.sumFromXTo100(13);
        System.out.println();
        LogicalOp averageFromXTo100 =new LogicalOp();
        averageFromXTo100.averageFromXTo100(13);
        System.out.println();
        LogicalOp print =new LogicalOp();
        print.print(9);

    }
}
