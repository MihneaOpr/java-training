package com.gym;

public class PowerliftingTraining implements Training{
    @Override
    public String getTraining(WorkDay workDay) {
        return "Your training plan for today is: \n" + "10 sets with 1-5 reps of " + workDay.getHeavyExercise();
    }
}
