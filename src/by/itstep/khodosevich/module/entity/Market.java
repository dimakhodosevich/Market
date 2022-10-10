package by.itstep.khodosevich.module.entity;

public class Market {
    private int product;
    private volatile  boolean empty;

    public int getProduct(){
        System.out.println("get product: " + product);
        return product;
    }

    public boolean getEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public void sendProduct(int product){
        this.product =product;
        System.out.println("send product: " + product);
    }



}
