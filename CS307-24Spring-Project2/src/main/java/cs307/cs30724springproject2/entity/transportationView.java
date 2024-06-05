package cs307.cs30724springproject2.entity;

public class transportationView {

    private String stationName;

    private String exit;

    private String buses;

    private String buildings;

    public transportationView(String stationName, String exit, String buses, String buildings) {
        this.stationName = stationName;
        this.exit = exit;
        this.buses = buses;
        this.buildings = buildings;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public String getBuses() {
        return buses;
    }

    public void setBuses(String buses) {
        this.buses = buses;
    }

    public String getBuildings() {
        return buildings;
    }

    public void setBuildings(String buildings) {
        this.buildings = buildings;
    }
}
