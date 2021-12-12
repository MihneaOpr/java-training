package com.gym;

import java.util.ArrayList;
import java.util.List;

public class LegsDay implements WorkDay {
    @Override
    public String getHeavyExercise() {
        return "Squat";
    }

    @Override
    public List<String> getIsolationExercises() {
        List<String> exercises = new ArrayList<>();
        exercises.add("Hack squat");
        exercises.add("Leg press");
        exercises.add("Leg extensions");
        exercises.add("RDL");
        exercises.add("Leg curl");
        return exercises;
    }
}