package logic_handle;

import entity.BusLine;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BusLineService {

    static List<BusLine> busLineList = new ArrayList<>();

    public static void inputNewBusLine() {
        try {
            System.out.println("Mời nhập số lượng tuyến xe mới: ");
            int numberOfBusLine = new Scanner(System.in).nextInt();
            if (numberOfBusLine <= 0) {
                System.out.println("\nĐÃ XẢY RA LỖI! SỐ LƯỢNG TUYẾN XE PHẢI LỚN HƠN 0!!! \n" +
                        "Phải nhập lại rồi!");
                inputNewBusLine();
            } else {
                for (int i = 0; i < numberOfBusLine; i++) {
                    System.out.println("Mời nhập khoảng cách (Tính theo đơn vị mét. VD: 700 m ): ");
                    int distance = new Scanner(System.in).nextInt();
                    if (distance <= 0) {
                        System.out.println("\nĐÃ XẢY RA LỖI! KHOẢNG CÁCH PHẢI LỚN HƠN 0!!! \n" +
                                "Phải nhập lại rồi!");
                        inputNewBusLine();
                    } else {
                        System.out.println("Mời nhập số lượng điểm dừng: ");
                        int busStop = new Scanner(System.in).nextInt();
                        if (busStop <= 0) {
                            System.out.println("\nĐÃ XẢY RA LỖI! SỐ LƯỢNG ĐIỂM DỪNG PHẢI LỚN HƠN 0!!! \n" +
                                    "Đến đây rồi còn phải nhập lại, tiếc quá!");
                            inputNewBusLine();
                        } else {
                            BusLine busLine = new BusLine(distance, busStop);
                            busLineList.add(busLine);
                        }
                    }
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("\nĐÃ XẢY RA LỖI! <<SỐ LƯỢNG TUYẾN XE, KHOẢNG CÁCH, SỐ ĐIỂM DỪNG>> CHỈ CHO PHÉP NHẬP SỐ NGUYÊN THÔI!!! \n" +
                    "Phải nhập lại rồi!");
            inputNewBusLine();
        }
    }

    public static void showBusLine() {
        //for (BusLine i : busLineList) {
        //System.out.println(i.toString());  // object.toString() biến dữ liệu của object thành một chuỗi
        if (busLineList.isEmpty()) {
            System.out.println("DANH SÁCH TUYẾN XE BUÝT HIỆN TẠI ĐANG RỖNG!!! \n\n" +
                    " ----->> Mời chọn [3] để thêm tuyến xe buýt.");
            //}
        } else {
            busLineList.forEach(busLine -> System.out.println(busLine.toString()));
        }
    }

    public static BusLine findBusLine(int id) {
        BusLine busLine = null;
        for (BusLine i : busLineList) {
            if (i.getBusLineID() == id)
                busLine = i;
        }
        return busLine;
    }


}
