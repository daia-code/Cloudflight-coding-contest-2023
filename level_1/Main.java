package folder;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String inputFile = "C:\\Users\\daian\\IdeaProjects\\cloudflight\\src\\level1_5.in";

        String outputFile = "C:\\Users\\daian\\IdeaProjects\\cloudflight\\src\\out.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));

             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Read the number of iterations from the first line

            int numIterations = Integer.parseInt(reader.readLine());

            // Process each iteration

            for (int i = 0; i < numIterations; i++) {

                // Read the next line from the input file

                String inputLine = reader.readLine();

                // Apply the login rules to the input and write the output to the output file

                String outputLine = applyLoginRules(inputLine);

                writer.write(outputLine);

                writer.newLine();

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }







    // Applies the login rules to the input and returns the output

    private static String applyLoginRules(String input) {

        switch (input) {

            case "PR":

            case "RP":

                return "P";

            case "SP":

            case "PS":

                return "S";

            case "RS":

            case "SR":

                return "R";

            case "SS":

                return "S";

            case "RR":

                return "R";

            case "PP":

                return "P";

            default:

                return "";

        }

    }

}