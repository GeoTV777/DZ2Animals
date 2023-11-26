import animals.Animal;
import data.CommandsData;
import data.CommandsData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите одну из следующих команд: add/list/exit");
            String commandStr = scanner.next().toUpperCase().trim();
            boolean isCommandExist = false;

            for (CommandsData commandData : CommandsData.values()) {
                if (CommandsData.name().equals(commandStr)) {
                    isCommandExist = true;
                    break;
                }
            }

            if (!isCommandExist) {
                System.out.println("Вы ввели некорректную команду");
                continue;
            }

            CommandsData commandsData = CommandsData.valueOf(commandStr);

            switch (commandsData) {
                case ADD:

                case LIST:
                   for (Animal animal : animalList) {
                        System.out.printf(animal.toString());
                    }
                case EXIT:
                    System.exit(0);

            }
        }
    }
}
