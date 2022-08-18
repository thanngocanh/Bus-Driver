package entity;

import java.util.ArrayList;
import java.util.List;

public class Assignments {

    private BusDriver busDriver;
    List<BusLine> busLineList = new ArrayList<>();

    public Assignments(BusDriver busDriver, List<BusLine> busLineList) {
        this.busDriver = busDriver;
        this.busLineList = busLineList;
    }

    public BusDriver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(BusDriver busDriver) {
        this.busDriver = busDriver;
    }

    public List<BusLine> getBusLineList() {
        return busLineList;
    }

    public void setBusLineList(List<BusLine> busLineList) {
        this.busLineList = busLineList;
    }



    @Override
    public String toString() {
        return "Assignments{" +
                "busDriver=" + busDriver +
                ", busLineList=" + busLineList +
                '}';
    }
}
