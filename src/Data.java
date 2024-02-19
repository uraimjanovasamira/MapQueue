public class Data {
    private int yearOfRelease;
    private int price;
    private String model;
    private String color;

    public Data(int yearOfRelease, int price, String model, String color) {
        this.yearOfRelease = yearOfRelease;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Data{" +
                "yearOfRelease=" + yearOfRelease +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}