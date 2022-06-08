package com.Bridgelabz.LineComparision;

public class LineComparison {
    public static int length1() {

        int x1 = (int) (Math.random() * 10) % 3;
        int x2 = (int) (Math.random() * 10) % 3;
        int y1 = (int) (Math.random() * 10) % 3;
        int y2 = (int) (Math.random() * 10) % 3;
        int length1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line L1: " + length1);
        return length1;
    }

    public static int length2() {

        int a1 = (int) (Math.random() * 10) % 3;
        int a2 = (int) (Math.random() * 10) % 3;
        int b1 = (int) (Math.random() * 10) % 3;
        int b2 = (int) (Math.random() * 10) % 3;
        int length2 = (int) Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("Length of line L2: " + length2);
        return length2;
    }

    public static void compareTo(){
        int Line1 = length1();
        int Line2 = length2();

        if (length1() == length2()){
            System.out.println(" The Both lines are equal");
        } else if (length1() < length2()) {
            System.out.println(" Line1 length is Lesser than Line2 length ");
        }
        else
            System.out.println("Line1 length is Greater than Line2 length");
    }

    public static void equals(){
        int Line1 = length1();
        int Line2 = length2();

        if ( Line1 == Line2)
            System.out.println("Both lines are equal.");
        else
            System.out.println("Both lines are not equal.");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to LineComparison Computation");
        compareTo();
        equals();
    }
}