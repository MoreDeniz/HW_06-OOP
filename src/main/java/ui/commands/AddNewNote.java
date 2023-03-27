package ui.commands;

import ui.ConsoleUI;


public class AddNewNote extends Command implements Options{
    public AddNewNote(ConsoleUI console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить новую запись";
    }

    @Override
    public void run() {
        getConsole().addNewNote();
    }
}
