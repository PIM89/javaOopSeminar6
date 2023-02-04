import Model.Model;
import Presenter.Presenter;
import View.View;
import log.Logger;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View(), new Model(), new Logger());
        presenter.buttonClick();
    }
}