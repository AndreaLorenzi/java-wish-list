package org.lessons.java.collection;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("On the list are these gifts: ");
        try (Scanner fileReader = new Scanner(new File("./resource/listGift.txt"))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        }

        List<Gift> listGift = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        boolean procedi = true;

        while (procedi) {
            System.out.println("**********************");
            System.out.println("Enter gift information: ");

            System.out.println("Description of the gift: ");
            String description = scanner.nextLine();

            System.out.println("Gift receiver:");
            String receiver = scanner.nextLine();

            listGift.add(new Gift(description, receiver));

            System.out.println("List length: " + listGift.size());

            System.out.println("Do you want to add new gifts? (yes/no): ");
            String answer = scanner.nextLine().toLowerCase();
            procedi = answer.equals("yes");
        }
        System.out.println("List gift: " + listGift);

        try (FileWriter fileWriter = new FileWriter("./resource/listGift.txt", true)) {
            for (Gift gift : listGift) {
                fileWriter.write(gift.toString() + "/n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
