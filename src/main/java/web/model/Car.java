package web.model;

public class Car {

    private String model;
    private Number series;
    private String color;

    public Car() {
    }

    public Car(String model, Number series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Number getSeries() {
        return series;
    }

    public void setSeries(Number series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", model='" + model + '\'' +
                ", series=" + series +
                ", color='" + color + '\'' +
                '}';
    }
}
