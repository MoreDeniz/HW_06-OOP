package model;

import java.util.List;
import java.util.ArrayList;

public abstract class Notepad implements Service{
    private List<String> notepad;
    public Notepad(){
        notepad = new ArrayList<>();
    }
    @Override
    public String toString(){
        String string = "";
        for (int i = 0; i < this.notepad.size(); i++) {
            string += i + 1 + ". " + this.notepad.get(i) + "\n";
        }
        return string;
    }
    @Override
    public void addNewNote(String newNote) {
        this.notepad.add(newNote);
    }
}
