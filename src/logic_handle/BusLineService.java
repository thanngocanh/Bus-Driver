package logic_handle;

import entity.BusLine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusLineService {

    static List<BusLine> busLineList = new ArrayList<>();

    public static void inputNewBusLine() {
        System.out.println("Mời nhập số lượng tuyến xe mới: ");
        int numberOfBusLine = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberOfBusLine; i++) {
            System.out.println("Mời nhập khoảng cách (Tính theo đơn vị mét. VD: 700 m ): ");
            int distance = new Scanner(System.in).nextInt();
            System.out.println("Mời nhập số điểm dừng: ");
            int busStop = new Scanner(System.in).nextInt();
            BusLine busLine = new BusLine(distance, busStop);
            busLineList.add(busLine);

        }
    }

    public static void showBusLine() {
        for (BusLine i : busLineList) {
            System.out.println(i.toString()); // object.toString() biến dữ liệu của object thành một chuỗi
        }
    }

    public static BusLine findBusLine(int id){
        BusLine busLine = null;
        for (BusLine i : busLineList) {
          if (i.getBusLineID()==id)
              busLine = i;
        }
        return busLine;
    }


}
