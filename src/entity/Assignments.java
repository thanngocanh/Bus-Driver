//Khai báo lớp Bảng phân công có quan hệ kết hợp với lớp Lái xe và lớp Tuyến. Trong đó một
package entity;

import java.util.ArrayList;
import java.util.List;


public class Assignments {

    List<BusDriver> busDriverList = new ArrayList<>();
    List<BusLine> busLineList = new ArrayList<>();

    private String busDriver;
    private int busLines;
    private int turnsNumber;


    public Assignments(String busDriver, int busLines, int turnsNumber) {
        this.busDriver = busDriver;
        this.busLines = busLines;
        this.turnsNumber = turnsNumber;
    }

    public List<BusDriver> getBusDriverList() {
        return busDriverList;
    }

    public void setBusDriverList(List<BusDriver> busDriverList) {
        this.busDriverList = busDriverList;
    }

    public List<BusLine> getBusLineList() {
        return busLineList;
    }

    public void setBusLineList(List<BusLine> busLineList) {
        this.busLineList = busLineList;
    }

    public String getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(String busDriver) {
        this.busDriver = busDriver;
    }

    public int getBusLines() {
        return busLines;
    }

    public void setBusLines(int busLines) {
        this.busLines = busLines;
    }

    public int getTurnsNumber() {
        return turnsNumber;
    }

    public void setTurnsNumber(int turnsNumber) {
        this.turnsNumber = turnsNumber;
    }
}
