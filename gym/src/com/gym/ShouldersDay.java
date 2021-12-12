package com.gym;

import java.util.ArrayList;
import java.util.List;

public class ShouldersDay implements WorkDay{
    @Override
    public String getHeavyExercise() { return "Military press"; }

    @Override
    public List<String> getIsolationExercises() {
        List<String> exercises = new ArrayList<>();
        exercises.add("Shoulder press");
        exercises.add("Dumbbell shoulder press");
        exercises.add("Lateral raises");
        exercises.add("Rear delt fly");
        exercises.add("Face pulls");
        return exercises;
    }
}
