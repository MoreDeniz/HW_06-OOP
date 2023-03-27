package presenter;

import model.Service;
import ui.View;

public class Presenter {
    private View view;

    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;

        view.setPresenter(this);
    }


    public void addNewNote(String newNote) {

        service.addNewNote(newNote);
    }

    public String print() {
        return service.toString();
    }
}
