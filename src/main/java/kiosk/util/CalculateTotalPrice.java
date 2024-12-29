package kiosk.util;

import kiosk.dto.Food;

import java.util.ArrayList;

public class CalculateTotalPrice {
    public static int calculateTotalFoodPrice(ArrayList<Food> addedFoodList) {
        int totalPrice = 0;
        for (Food food : addedFoodList) {
            totalPrice += food.getPrice() * food.getOrderedNumber();
        }
        return totalPrice;
    }
}
