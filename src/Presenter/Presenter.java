package Presenter;

import Model.*;
import View.View;
import log.Logger;

/**Класс создает связь между классоми View, Model и Logger
 * Описывается взаимодействие с пользователем */
public class Presenter {
    View view;
    Model model;
    Logger logger;

    public Presenter(View view, Model model, Logger logger) {
        this.view = view;
        this.model = model;
        this.logger = logger;
    }

    public void buttonClick() {
        view.showMenuDouble();
        int choose = view.getChoose();
        if (choose == 5) {System.exit(0);}
        double x = view.getDouble("Введите число X: ");
        double y = view.getDouble("Введите число Y: ");
        switch (choose) {
            case 1: {
                SumModel sumModel = new SumModel();
                sumModel.setX(x);
                sumModel.setY(y);
                double res = sumModel.result(sumModel.getX(), sumModel.getY());
                view.print(res);
                logger.recLog(sumModel.getX(), sumModel.getY(), choose, res);
                buttonClick();
            }
            case 2: {
                DifModel difModel = new DifModel();
                difModel.setX(x);
                difModel.setY(y);
                double res = difModel.result(difModel.getX(), difModel.getY());
                view.print(res);
                logger.recLog(difModel.getX(), difModel.getY(), choose, res);
                buttonClick();
            }
            case 3: {
                MultiModel multiModel = new MultiModel();
                multiModel.setX(x);
                multiModel.setY(y);
                double res = multiModel.result(multiModel.getX(), multiModel.getY());
                view.print(res);
                logger.recLog(multiModel.getX(), multiModel.getY(), choose, res);
                buttonClick();
            }
            case 4: {
                ShareModel shareModel = new ShareModel();
                shareModel.setX(x);
                shareModel.setY(y);
                double res = shareModel.result(shareModel.getX(), shareModel.getY());
                view.print(res);
                logger.recLog(shareModel.getX(), shareModel.getY(), choose, res);
                buttonClick();
            }
        }
    }
}
