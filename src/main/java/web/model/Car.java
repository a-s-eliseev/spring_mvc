package web.model;

public class Car {
    private String brand;
    private String name;
    private int series;

    public Car() {
    }

    public Car(String brand, String name, int series) {
        this.brand = brand;
        this.name = name;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
