package ui;

import presenter.Presenter;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Presenter presenter;
    private Scanner scanner;
    private boolean flag;
    private Menu menu;

    @Override
    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void start() {
        menu = new Menu(this);
        flag = true;
        while (flag){
            System.out.println("Выберите пункт меню: ");
            System.out.println(menu.showMenu());

            int userChoice = scanner.nextInt();
            menu.run(userChoice);
        }
    }

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
    }

    public void addNewNote(){
        System.out.println("Введите текст: \n");
        String newNote = scanner.next();
        presenter.addNewNote(newNote);
    }

    public void print(){
        System.out.println(presenter.print());
    }
}
