package view.commands;

import view.Console;

import java.util.Scanner;

public class addCommand {
    private Console console;

    public addCommand(Console console) {
        this.console = console;
    }

    public String getDescription() {
        return "Обучить команде";
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID животного: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите новую команду: ");
        String command = scanner.nextLine();

        console.addCommand(id, command);
    }
}