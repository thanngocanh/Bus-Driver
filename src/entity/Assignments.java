//Khai báo lớp Bảng phân công có quan hệ kết hợp với lớp Lái xe và lớp Tuyến. Trong đó một
package entity;

import java.util.ArrayList;
import java.util.List;


public class Assignments {

    List<BusDriver> busDriverList = new ArrayList<>();
    List<BusLine> busLineList = new ArrayList<>();

    private String name;
    private int id;
    private int turnsNumber;


    public Assignments(String name, int id, int turnsNumber) {
        this.name = name;
        this.id = id;
        this.turnsNumber = turnsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTurnsNumber() {
        return turnsNumber;
    }

    public void setTurnsNumber(int turnsNumber) {
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
}
