package house;

abstract class Apartment {
    int squareFootage;
    int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);

    //방법1 : 공통 함수 하나 더 만들기
    abstract void upgradeBedroomNumber();
}