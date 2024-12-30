package kiosk.util;

import kiosk.dto.Food;

import java.util.ArrayList;

public class ModifyFood {
    public static void changeNumberOfFood(ArrayList<Food> foodList, int index, int numberChanged4Food) {
        Food food2ChangeNumber = foodList.get(index);
        food2ChangeNumber.setOrderedNumber(numberChanged4Food);
    }

    public static void deleteFoodFromList(ArrayList<Food> foodList, int choiceFromMenuListByUser) {

        foodList.remove(choiceFromMenuListByUser - 1);
    }
}
