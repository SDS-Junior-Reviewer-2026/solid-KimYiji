package birds;

public class Eagle implements FlyableBird { // 방법 2, 방법 1은 Bird도 다중 상속
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void fly() {
        this.currentLocation = "in the air";
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
}