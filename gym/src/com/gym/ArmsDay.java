package com.gym;

import java.util.ArrayList;
import java.util.List;

public class ArmsDay implements WorkDay{
    @Override
    public String getHeavyExercise() {
        return "Barbell curl";
    }

    @Override
    public List<String> getIsolationExercises() {
        List<String> exercises = new ArrayList<>();
        exercises.add("Narrow grip bench press");
        exercises.add("Skull crushers");
        exercises.add("Triceps Cable extensions with rope");
        exercises.add("Preacher curl");
        exercises.add("Dumbbell curl");
        return exercises;
    }
}
