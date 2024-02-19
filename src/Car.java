public class Car {
    private int id;
    private int numberAuto;

    public Car(int id, int numberAuto) {
        this.id = id;
        this.numberAuto = numberAuto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(int numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberAuto=" + numberAuto +
                '}';
    }
}
