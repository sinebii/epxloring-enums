package enums;

import lombok.Data;


public enum Package {
    Basic(40),Lite(120),premium(300);
    private int price;

    Package(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
