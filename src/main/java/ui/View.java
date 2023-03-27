package ui;

import presenter.Presenter;

import java.util.ArrayList;

//import presenter.presenter.Presenter;

public interface View {
//    private Presenter presenter;
//    private Scanner scanner;
//
//    void showMenu();
//    int choice();
////    String addNote();
//    ArrayList<String> addNewNote();
//    void emptyNotepad();
//    void showAllNotes(String text);

    void setPresenter(Presenter presenter);
    void start();

//    public View(){
//        scanner = new Scanner(System.in);
//    }

//    public void setPresenter(Presenter presenter){
//        this.presenter = presenter;
//    }


//    public void start() throws IOException{
//        int choice = scan();
//        presenter.onClick(choice);
//    }

//    private int scan(){
//        System.out.println("Select an item\n1 - Make an entry in a notebook\n2 - ui.View all entries in notepad\n3 - Exit");
//        int choice = scanner.nextInt();
//        return choice;
//    }
}
