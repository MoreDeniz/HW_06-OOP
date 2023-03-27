package ui.commands;

import ui.ConsoleUI;

public class ShowAllNotes extends Command implements Options{
    private ConsoleUI console;

    public ShowAllNotes(ConsoleUI console) {
        super(console);
    }

    @Override
    public String description() {
        return "Показать все записи";
    }

    @Override
    public void run() {
        getConsole().print();
    }
}
