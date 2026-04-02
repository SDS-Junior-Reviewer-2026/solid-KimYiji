package birds;

public class Penguin implements SwimableBird { // 방법 2, 방법 1은 Bird도 다중 상속
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}