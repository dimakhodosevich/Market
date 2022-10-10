package by.itstep.khodosevich.module.entity;

public class Market {
    private int product;

    public int getProduct(){
        System.out.println("get product: " + product);
        return product;
    }

    public void sendProduct(int product){
        this.product =product;
        System.out.println("send product: " + product);
    }



}
