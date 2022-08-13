//Khai báo lớp Tuyến (mã tuyến, khoảng cách, số điểm dừng),
// mã tuyến là một số nguyên có 3 chữ số, tự động tăng.

package entity;

import java.util.Scanner;

public class BusLine implements Inputable {

    private static int AUTO_ID = 100;

    protected int busLineID;

    protected String distance;
    protected int busStop;

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
        this.busLineID = BusLine.AUTO_ID++;
        System.out.println("Mời nhập khoảng cách các tuyến: ");
        this.setDistance(new Scanner(System.in).nextLine());
        System.out.println("Mời nhập số điểm dừng: ");
        this.setBusStop(new Scanner(System.in).nextInt());
    }
}
