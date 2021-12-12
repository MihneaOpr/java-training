package com.gym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

                BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

         System.out.println("Welcome to my gym!");
         System.out.println("What are we training today?");

         String type = reader.readLine();
         WorkDay workDay = WorkDayFactory.getWorkDay(type);

         System.out.println("Do you want to be strong or shredded?");
         type = reader.readLine();

        Training training;
         if(type.equals("Strong")) {
            training = new PowerliftingTraining();
         } else {
            training = new HypertrophyTraining();
         }

         System.out.println(training.getTraining(workDay));
    }
}
