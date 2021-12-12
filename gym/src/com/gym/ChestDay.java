package com.gym;

import java.util.ArrayList;
import java.util.List;

public class ChestDay implements WorkDay {
    @Override
    public String getHeavyExercise() {
        return "Bench press";
    }

    @Override
    public List<String> getIsolationExercises() {
        List<String> exercises = new ArrayList<>();
        exercises.add("Dumbbell incline chest press");
        exercises.add("Pec Dec chest fly");
        exercises.add("Machine chest press");
        exercises.add("Cable chest fly");
        exercises.add("Chest dips");
        return exercises;
    }
}
