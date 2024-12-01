package Collections;

public class Car  implements Comparable<Car>{
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setMake(String make) {
        this.make = make;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public String getMake() {
        return make;
    }


    public double getPrice() {
        return price;
    }

    String name;
    String make;
    double price;
    
    public Car(String name, String make, double price){
        this.name = name;
        this.make = make;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Name: "+name+" Make: "+make+" Price: "+price;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }


    @Override
    public int compareTo(Car o) {
        return Double.compare(this.price ,o.price);
    }

    
} 