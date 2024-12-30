package kiosk.dto;

public class Food {
    private String name;
    private int price;
    private int orderedNumber = 0;



    public Food(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void incrementOrderedNumber() {
        orderedNumber++;
    }

    public void decreaseOrderedNumber() {
        orderedNumber--;
    }

    public int getOrderedNumber() {
        return orderedNumber;
    }

    public void setOrderedNumber(int orderedNumber) {
        this.orderedNumber = orderedNumber;
    }

    @Override
    public String toString() {
        return name + " " + orderedNumber + "개";
    }
}
