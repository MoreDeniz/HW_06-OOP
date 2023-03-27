package ui;

import ui.commands.AddNewNote;
import ui.commands.Exit;
import ui.commands.Options;
import ui.commands.ShowAllNotes;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Options> commands;
    private ConsoleUI console;

    public Menu(ConsoleUI console){
        this.console = console;
        commands = new ArrayList<Options>();
        commands.add(new AddNewNote(console));
        commands.add(new ShowAllNotes(console));
        commands.add(new Exit(console));
    }

    public String showMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("======================\n");
        for (int i = 0; i < commands.size(); i++) {
            sb.append(i + 1)
                    .append(". ")
                    .append(commands.get(i).description())
                    .append("\n");
        }
        return sb.toString();
    }

//    public boolean showMenu() {
//    }

    void run(int userChoice) {
        Options option = commands.get(userChoice - 1);
        option.run();
    }
}
