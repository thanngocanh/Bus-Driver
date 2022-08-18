package logic_handle;

import entity.BusDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusDriverService {

    static List <BusDriver> busDriverList = new ArrayList<>();


    public static void inputNewBusDriver() {
        System.out.println("Xin mời nhập số lượng tài xế mới muốn thêm: ");
        int numberOfDrivers = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberOfDrivers; i++) {
            System.out.println("Mời nhập tên tài xế: ");
           String name = new Scanner(System.in).nextLine();
            System.out.println("Mời nhập địa chỉ: ");
           String address = new Scanner(System.in).nextLine();
            System.out.println("Mời nhập số điện thoại: ");
           String phone = new Scanner(System.in).nextLine();
           BusDriver busDriver = new BusDriver(name, address, phone);
           busDriver.inputDrivingSkill();
           busDriverList.add(busDriver);

        }
    }
}
