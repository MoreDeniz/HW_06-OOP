package ui.commands;

import ui.ConsoleUI;

public class Command {
    private ConsoleUI console;

    public Command(ConsoleUI console) {
            this.console = console;
        }

        public ConsoleUI getConsole () {
            return console;
        }
    }
