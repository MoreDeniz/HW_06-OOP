import model.Note;
import model.Notepad;
import presenter.Presenter;
import ui.ConsoleUI;
import ui.View;

public class Program {
    public static void main(String[] args) throws Exception {
        Notepad note = new Note();
        View view = new ConsoleUI();
        new Presenter(view, note);

        view.start();
    }
}
