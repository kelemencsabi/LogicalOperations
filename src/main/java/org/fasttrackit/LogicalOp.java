package org.fasttrackit;

public class LogicalOp {
    public void countingForwards(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    public void countingBackwards(int x) {
        for (int i = x; i >= -100; i--) {
            System.out.print(i + " ");
        }
    }

    public void countingBetween(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = x; i >= y; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public void countingBetweenForwards(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = y; i <= x; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void evenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }

    public void oddNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }

    public int sumFromXTo100(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    public double averageFromXTo100(int x) {
        double sum = 0;
        for (int i = x; i <= 100; i++) {
            sum += i;
        }
        double average = sum / (100 - x);
        System.out.println(average);
        return average;
    }

    public void print(int x) {
        for (int i = x; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.printf(" (｡◕‿◕｡) ");
            }
        }
    }
}

