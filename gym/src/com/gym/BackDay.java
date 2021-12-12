package com.gym;

import java.util.ArrayList;
import java.util.List;

public class BackDay implements WorkDay{
    @Override
    public String getHeavyExercise() {
        return "Deadlift";
    }

    @Override
    public List<String> getIsolationExercises() {
        List<String> exercises = new ArrayList<>();
        exercises.add("Pull-ups");
        exercises.add("Bent-over row");
        exercises.add("Lat pulldown");
        exercises.add("Chest supported row");
        exercises.add("Lat pullover");
        return exercises;

        }
    }

