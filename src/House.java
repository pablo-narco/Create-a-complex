public class House {
    private String houseName;
    private Floor[] floors;
    private Entrance[] entrances;

    public House(String houseName, int numFloors, int numEntrances) {
        this.houseName = houseName;
        floors = new Floor[numFloors];
        entrances = new Entrance[numEntrances];

        // Automatically populate floors and entrances
        for (int i = 0; i < numFloors; i++) {
            floors[i] = new Floor("Floor " + (i + 1));
        }
        for (int i = 0; i < numEntrances; i++) {
            entrances[i] = new Entrance(i + 1);
        }
    }

    public String getHouseName() {
        return houseName;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public Entrance[] getEntrances() {
        return entrances;
    }
}
