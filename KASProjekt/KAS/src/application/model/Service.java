package application.model;

public class Service {

    String name;
    double price;


    public Service(String name, double price){
        this.name = name;
        this.price = price;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }


}
