package birds;

public interface Bird{
    public void molt();
}

//방법 1
//interface FlyableBird{
//    public void fly();
//}
//
//interface SwimableBird{
//    public void swim();
//}

//방법 2
interface FlyableBird extends Bird {
    public void fly();
}

interface SwimableBird extends Bird {
    public void swim();
}