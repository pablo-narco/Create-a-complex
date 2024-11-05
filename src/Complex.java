public class Complex {
    private String complexName;
    private House[] houses;
    private int houseCount;

    public Complex(String complexName, int numHouses) {
        this.complexName = complexName;
        houses = new House[numHouses];
        houseCount = 0;
    }

    public String getComplexName() {
        return complexName;
    }

    public House[] getHouses() {
        return houses;
    }

    public void addHouse(House house) {
        if (houseCount < houses.length) {
            houses[houseCount++] = house;
        } else {
            System.out.println("Complex to'lgan,boshqa uy qosha olmaysz.");
        }
    }
}
