//Khai báo lớp Tuyến (mã tuyến, khoảng cách, số điểm dừng),
// mã tuyến là một số nguyên có 3 chữ số, tự động tăng.

package entity;

import java.util.Objects;

public class BusLine {

    private static int AUTO_ID = 100;

    protected int busLineID;

    protected int distance;
    protected int busStop;

    public BusLine(int distance, int busStop) {
        this.busLineID = BusLine.AUTO_ID++;
        this.busStop = busStop;
        this.distance = distance;
    }

    public int getBusLineID() {
        return busLineID;
    }

    public void setBusLineID(int busLineID) {
        this.busLineID = busLineID;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getBusStop() {
        return busStop;
    }

    public void setBusStop(int busStop) {
        this.busStop = busStop;
    }

    @Override
    public String toString() {
        System.out.println("\n　<< THÔNG TIN TUYẾN XE BUÝT _ " + busLineID + " _ >>" + '\n');
        System.out.println("∥　[1] MÃ TUYẾN     : --≫　【　 " + busLineID + " 　】\n" +
                "∥　[2] KHOẢNG CÁCH  : --≫　【　 " + distance + " m　　】\n" +
                "∥　[3] SỐ ĐIỂM DỪNG : --≫　【　 " + busStop + "　　】\n");
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusLine)) return false;
        BusLine busLine = (BusLine) o;
        return getBusLineID() == busLine.getBusLineID() && getDistance() == busLine.getDistance() && getBusStop() == busLine.getBusStop();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusLineID(), getDistance(), getBusStop());
    }

}
