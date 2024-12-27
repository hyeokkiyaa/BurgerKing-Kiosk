package kiosk;

import kiosk.controller.KioskMainController;
import kiosk.print.Printer;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        //TODO: 구현
        Application app = new Application();
        app.run();
    }

    private void run() throws IOException {
        int menuHomeSelectedNumber = Printer.selectHomeMenuPrint();

    }
}