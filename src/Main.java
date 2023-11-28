import data.CommandsData;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandStr = scanner.next();

        while(true) {
            System.out.println("Введите команду: add/list/exit");
            boolean isCommandsExist = false;
            for (CommandsData commandsData : CommandsData.values()) {
                if (commandsData.name().equals(commandStr.toUpperCase().trim())) {
                    isCommandsExist = true;
                    break;
                }
            }

            if (!isCommandsExist) {
                System.out.println("Введена некорректная команда");
                continue;
            }
            System.out.printf("Good!");
        }

    }
}
