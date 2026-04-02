package house;

public class UnitUpgrader { // 방법 2는 얘를 abstract UnitUpgrader로 만들기.
    public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;

//        if (apartment.getClass() != Studio.class) // studio인지 판단 -> LSP에 어긋남.
//            apartment.numberOfBedrooms += 1;

        //방법 1
        apartment.upgradeBedroomNumber();

    }
}