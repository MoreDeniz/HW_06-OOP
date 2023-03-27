package ui.commands;

import ui.ConsoleUI;

public class Exit extends Command implements Options{
    public Exit(ConsoleUI console) {
        super(console);
    }

    @Override
    public String description() {
        return "Завершение работы";
    }

    @Override
    public void run() {
        System.exit(0);
    }
}
