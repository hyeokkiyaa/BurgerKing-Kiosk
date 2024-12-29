package kiosk.print;

import kiosk.dto.Food;
import kiosk.util.makeFoodInstance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Printer {
    public static int selectHomeMenuPrint() throws IOException {
        int selectMenuNumber;
        String menuHomePrintString = """
                \n=====홈=====
                
                1. 햄버거
                2. 사이드
                3. 음료
                4. 장바구니
                5. 종료
                
                메뉴선택:\s""";
        selectMenuNumber = printerMenuFormat(menuHomePrintString, 5,1);
        return selectMenuNumber;
    }

    public static ArrayList<Food> selectBurgerMenuPrint(ArrayList<Food> addedFoodList) throws IOException {
        int selectMenuNumber;
        String menuBurgerPrintString = """
                \n=====햄버거 메뉴=====
               \s
                1. 와퍼 (6900원)
                2. 큐브 스테이크 와퍼 (8900원)
                3. 콰트로 치즈 와퍼 (7900원)
                4. 몬스터 와퍼 (9300원)
                5. 통새우 와퍼 (7900원)
                6. 블랙바베큐 와퍼 (9300원)
               \s
                메뉴선택 (0을 선택 시 홈으로):\s""";
        selectMenuNumber = printerMenuFormat(menuBurgerPrintString, 6,0);
        return makeFoodInstance.getBurgerOrder(selectMenuNumber, addedFoodList);
    }

    public static ArrayList<Food> selectSideMenuPrint(ArrayList<Food> addedFoodList) throws IOException {
        int selectMenuNumber;
        String menuSidePrintString = """
                \n=====사이드 메뉴=====
                
                1. 너겟킹 (2500원)
                2. 해쉬 브라운 (1800원)
                3. 치즈스틱 (1200원)
                4. 어니언링 (2400원)
                5. 바삭킹 (3000원)
                6. 감자튀김 (2000원)
                
                메뉴선택 (0을 선택 시 홈으로):\s""";
        selectMenuNumber = printerMenuFormat(menuSidePrintString, 6,0);
        return makeFoodInstance.getSideOrder(selectMenuNumber, addedFoodList);
    }
    public static ArrayList<Food> selectDrinkMenuPrint(ArrayList<Food> addedFoodList) throws IOException {
        int selectMenuNumber;
        String menuDrinkPrintString = """
                \n=====음료 메뉴=====
                
                1. 코카콜라 (2000원)
                2. 코카콜라 제로 (2000원)
                3. 펩시 (2000원)
                4. 펩시 제로 (2000원)
                5. 스프라이트 (2000원)
                6. 스프라이트 제로 (2000원)
                
                메뉴선택 (0을 선택 시 홈으로):\s""";
        selectMenuNumber = printerMenuFormat(menuDrinkPrintString, 6, 0);
        return makeFoodInstance.getDrinkOrder(selectMenuNumber, addedFoodList);
    }

    private static int printerMenuFormat(String menuList, int maximumMenuNo, int minimumMenuNo) throws IOException {
        BufferedReader getMenuValue = new BufferedReader(new InputStreamReader(System.in));
        int choiceFromListByUser;

        System.out.print(menuList);

        try{
            choiceFromListByUser = Integer.parseInt(getMenuValue.readLine());
            if (choiceFromListByUser > maximumMenuNo || choiceFromListByUser < minimumMenuNo)  {
                throw  new IllegalArgumentException("메뉴 선택은 1부터 "+ maximumMenuNo +"까지");
            }
            return choiceFromListByUser;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new IllegalArgumentException();
        }
    }

    public static void foodListShoppingCartPrint(ArrayList<Food> foodList) throws IOException {
        if (foodList.isEmpty()){
            System.out.println("No food in the shopping cart");
            return;
        }
        StringBuilder shoppingCartList = new StringBuilder("\n===== 장바구니 =====\n\n");
        int index = 1;
        for (Food food : foodList) {
            shoppingCartList.append(index).append(". ");
            shoppingCartList.append(food.toString()).append("\n");
            index++;
        }
        System.out.println(shoppingCartList);
    }

}
