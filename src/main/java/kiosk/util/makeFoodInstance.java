package kiosk.util;

import kiosk.dto.Food;

import java.util.ArrayList;

public class makeFoodInstance {
    public static ArrayList<Food> getBurgerOrder(int numberSelected, ArrayList<Food> addedFoodList) {
        Food newBurger = null;
        switch (numberSelected) {
            case 1:
                newBurger = isExistInList("와퍼", addedFoodList);
                if (newBurger == null){
                    newBurger = new Food("와퍼",6900);
                    addedFoodList.add(newBurger);
                }
                newBurger.incrementOrderedNumber();
                break;
            case 2:
                newBurger = isExistInList("큐브 스테이크 와퍼", addedFoodList);
                if (newBurger == null){
                    newBurger = new Food("큐브 스테이크 와퍼",8900);
                    addedFoodList.add(newBurger);
                }
                newBurger.incrementOrderedNumber();
                break;
            case 3:
                newBurger = isExistInList( "콰트로 치즈 와퍼", addedFoodList);
                if (newBurger == null){
                    newBurger = new Food("콰트로 치즈 와퍼",7900);
                    addedFoodList.add(newBurger);
                }
                newBurger.incrementOrderedNumber();
                break;
            case 4:
                newBurger = isExistInList( "몬스터 와퍼", addedFoodList);
                if (newBurger == null){
                    newBurger = new Food("몬스터 와퍼",9300);
                    addedFoodList.add(newBurger);
                }
                newBurger.incrementOrderedNumber();
                break;
            case 5:
                newBurger = isExistInList( "통새우 와퍼", addedFoodList);
                if (newBurger == null){
                    newBurger = new Food("통새우 와퍼",7900);
                    addedFoodList.add(newBurger);
                }
                newBurger.incrementOrderedNumber();
                break;
            case 6:
                newBurger = isExistInList( "블랙바베큐 와퍼", addedFoodList);
                if (newBurger == null){
                    newBurger = new Food("블랙바베큐 와퍼", 9300);
                    addedFoodList.add(newBurger);
                }
                newBurger.incrementOrderedNumber();
                break;

            default:
                break;
        }
        return addedFoodList;
    }

    public static ArrayList<Food> getSideOrder(int numberSelected, ArrayList<Food> addedFoodList) {
        Food newSide = null;
        switch (numberSelected) {
            case 1:
                newSide = isExistInList("너겟킹", addedFoodList);
                if (newSide == null){
                    newSide = new Food("너겟킹",2500);
                    addedFoodList.add(newSide);
                }
                newSide.incrementOrderedNumber();
                break;
            case 2:
                newSide = isExistInList("해쉬 브라운", addedFoodList);
                if (newSide == null){
                    newSide = new Food("해쉬 브라운",1800);
                    addedFoodList.add(newSide);
                }
                newSide.incrementOrderedNumber();
                break;
            case 3:
                newSide= isExistInList( "치즈스틱", addedFoodList);
                if (newSide == null){
                    newSide = new Food("치즈스틱",1200);
                    addedFoodList.add(newSide);
                }
                newSide.incrementOrderedNumber();
                break;
            case 4:
                newSide = isExistInList( "어니언링", addedFoodList);
                if (newSide == null){
                    newSide = new Food("어니언링",2400);
                    addedFoodList.add(newSide);
                }
                newSide.incrementOrderedNumber();
                break;
            case 5:
                newSide = isExistInList( "바삭킹", addedFoodList);
                if (newSide == null){
                    newSide = new Food("바삭킹",3000);
                    addedFoodList.add(newSide);
                }
                newSide.incrementOrderedNumber();
                break;
            case 6:
                newSide = isExistInList( "감자튀김", addedFoodList);
                if (newSide == null){
                    newSide = new Food("감자튀김", 2000);
                    addedFoodList.add(newSide);
                }
                newSide.incrementOrderedNumber();
                break;

            default:
                break;
        }
        return addedFoodList;
    }

    public static ArrayList<Food> getDrinkOrder(int numberSelected, ArrayList<Food> addedFoodList) {
        Food newDrink = null;
        switch (numberSelected) {
            case 1:
                newDrink = isExistInList("코카콜라", addedFoodList);
                if (newDrink == null){
                    newDrink = new Food("코카콜라",2000);
                    addedFoodList.add(newDrink);
                }
                newDrink.incrementOrderedNumber();
                break;
            case 2:
                newDrink = isExistInList("코카콜라 제로", addedFoodList);
                if (newDrink == null){
                    newDrink = new Food("코카콜라 제로",2000);
                    addedFoodList.add(newDrink);
                }
                newDrink.incrementOrderedNumber();
                break;
            case 3:
                newDrink= isExistInList( "펩시", addedFoodList);
                if (newDrink == null){
                    newDrink = new Food("펩시",2000);
                    addedFoodList.add(newDrink);
                }
                newDrink.incrementOrderedNumber();
                break;
            case 4:
                newDrink = isExistInList( "펩시 제로", addedFoodList);
                if (newDrink == null){
                    newDrink = new Food("펩시 제로",2000);
                    addedFoodList.add(newDrink);
                }
                newDrink.incrementOrderedNumber();
                break;
            case 5:
                newDrink = isExistInList( "스프라이트", addedFoodList);
                if (newDrink == null){
                    newDrink = new Food("스프라이트",2000);
                    addedFoodList.add(newDrink);
                }
                newDrink.incrementOrderedNumber();
                break;
            case 6:
                newDrink = isExistInList( "스프라이트 제로", addedFoodList);
                if (newDrink == null){
                    newDrink = new Food("스프라이트 제로", 2000);
                    addedFoodList.add(newDrink);
                }
                newDrink.incrementOrderedNumber();
                break;

            default:
                break;
        }
        return addedFoodList;
    }

    private static Food isExistInList(String foodName, ArrayList<Food> addedFoodList) {
        for(Food food : addedFoodList) {
            if(food.getName().equals(foodName)) {
                return food;
            }
        }
        return null;
    }
}
