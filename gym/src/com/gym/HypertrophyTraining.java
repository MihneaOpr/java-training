package com.gym;

public class HypertrophyTraining implements  Training{
    @Override
    public String getTraining(WorkDay workDay) {
        StringBuilder training = new StringBuilder();
        System.out.println("Your training plan for today is:");
        for(String exercise : workDay.getIsolationExercises()) {
            training.append("4 sets with 10-12 reps of ").append(exercise).append("\n");
        }
            return training.toString();

    }
}
