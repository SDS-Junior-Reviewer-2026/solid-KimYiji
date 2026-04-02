package house;

public abstract class UnitUpgrader { // 방법 2는 얘를 abstract UnitUpgrader로 만들기.
    public abstract void upgrade(Apartment apartment);
//    {
//        apartment.squareFootage += 40;
//
////        if (apartment.getClass() != Studio.class) // studio인지 판단 -> LSP에 어긋남.
////            apartment.numberOfBedrooms += 1;
//
//        //방법 1
//        apartment.upgradeBedroomNumber();

//    }
    public void upgradeFootage(Apartment apartment) {
        apartment.squareFootage += 40;
    };
}

class PentHouseUpgrader extends UnitUpgrader {
    public void upgrade(Apartment apartment) {
        upgradeFootage(apartment);
    }
    public void upgradeBedRoomNumber(Apartment apartment) {
        apartment.numberOfBedrooms++;
    }
}
class StudioUpgrader extends UnitUpgrader {
    public void upgrade(Apartment apartment) {
        upgradeFootage(apartment);
    }
}