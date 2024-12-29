package kiosk;

import kiosk.dto.Food;
import kiosk.print.Printer;

import java.io.IOException;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws IOException {
        //TODO: 구현
        Application app = new Application();
        app.run();
    }

    private void run() throws IOException {
        ArrayList<Food> foodAddedList = new ArrayList<>();

        while (true) {
            int menuHomeSelectedNumber = Printer.selectHomeMenuPrint();

            if (menuHomeSelectedNumber == 5)
                break;
            else if (menuHomeSelectedNumber >=  1 & menuHomeSelectedNumber <= 3){
                foodAddedList = afterSelectedMenuOptionOfFoodAdd(menuHomeSelectedNumber, foodAddedList);

            }
            else {
                printCart(foodAddedList);

            }


        }
    }

    private ArrayList<Food> afterSelectedMenuOptionOfFoodAdd(int menuHomeSelectedNumber, ArrayList<Food> addedFoodList) throws IOException {
        return switch (menuHomeSelectedNumber) {
            case 1 -> Printer.selectBurgerMenuPrint(addedFoodList);
            case 2 -> Printer.selectSideMenuPrint(addedFoodList);
            case 3 -> Printer.selectDrinkMenuPrint(addedFoodList);
            default -> null;
        };
    }

    private void printCart(ArrayList<Food> foodAddedList) throws IOException {
        Printer.foodListShoppingCartPrint(foodAddedList);
    }
}