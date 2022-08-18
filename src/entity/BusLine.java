//Khai báo lớp Tuyến (mã tuyến, khoảng cách, số điểm dừng),
// mã tuyến là một số nguyên có 3 chữ số, tự động tăng.

package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BusLine implements Inputable {

    private static int AUTO_ID = 100;

    protected int busLineID;

    protected String distance;
    protected int busStop;

    List<Turns> turns = new ArrayList<>();

    public BusLine(int busLineID, String distance, int busStop) {
        this.busLineID = BusLine.AUTO_ID++;
        this.distance = distance;
        this.busStop = busStop;
    }

    public int getBusLineID() {
        return busLineID;
    }

    public void setBusLineID(int busLineID) {
        this.busLineID = busLineID;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getBusStop() {
        return busStop;
    }

    public void setBusStop(int busStop) {
        this.busStop = busStop;
    }

    public List<Turns> getTurns() {
        return turns;
    }

    public void setTurns(List<Turns> turns) {
        this.turns = turns;
    }

    @Override
    public String toString() {
        return "BusLine{" +
                "busLineID=" + busLineID +
                ", distance='" + distance + '\'' +
                ", busStop=" + busStop +
                '}';
    }

    @Override
    public void inputInfo() {
        System.out.println("Mời nhập khoảng cách các tuyến: ");
        this.setDistance(new Scanner(System.in).nextLine());
        System.out.println("Mời nhập số điểm dừng: ");
        this.setBusStop(new Scanner(System.in).nextInt());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusLine)) return false;
        BusLine busLine = (BusLine) o;
        return getBusLineID() == busLine.getBusLineID() &&
                getBusStop() == busLine.getBusStop() &&
                getDistance().equals(busLine.getDistance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusLineID(), getDistance(), getBusStop());
    }

}
