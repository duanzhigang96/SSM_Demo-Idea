package com.example.javaTest;

public class enumTest {
    enum Weekend {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURADAY, SUNDAY;
    }

    public static void printDay(Weekend weekend) {
        switch (weekend) {
            case MONDAY:
                System.out.println("today is monday...");
                break;
            case TUESDAY:
                System.out.println("today is tuesday...");
                break;
            case WEDNESDAY:
                System.out.println("today is wednesday...");
                break;
            case THURSDAY:
                System.out.println("today is thursday...");
                break;
            case FRIDAY:
                System.out.println("today is friday...");
                break;
            case SATURADAY:
                System.out.println("today is saturday...");
                break;
            case SUNDAY:
                System.out.println("today is sunday...");
                break;
        }
    }

    public static void main(String[] args) {
        printDay(Weekend.FRIDAY);
        for (Weekend wd : Weekend.values()) {
            System.out.println(wd);
        }
    }
}
