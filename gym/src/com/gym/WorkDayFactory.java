package com.gym;

public class WorkDayFactory {
    public static WorkDay getWorkDay(String type) {
        if (type.equals("Back")) {
            return new BackDay();
        }
        if (type.equals("Chest")) {
            return new ChestDay();
        }
        if (type.equals("Legs")) {
            return new LegsDay();
        }
        if (type.equals("Shoulders")) {
            return new ShouldersDay();
        }
        if (type.equals("Arms")) {
            return new ArmsDay();
        }
        return null;
    }
}
