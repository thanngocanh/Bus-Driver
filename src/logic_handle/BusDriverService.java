package logic_handle;

import entity.Assignments;
import entity.BusDriver;
import entity.BusLine;

import java.util.*;

public class BusDriverService {

    static List<BusDriver> busDriverList = new ArrayList<>();


    public static void inputNewBusDriver() {
        System.out.println();
        // int numberOfDrivers = Integer.parseInt(JOptionPane.showInputDialog("Mời nhập số lượng tài xế mới: "));
        System.out.println("Mời nhập số lượng tài xế mới: ");
        try {
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
//                Assignments assignments = new Assignments(busDriver, ); //tạo liên kết dữ liệu
//                AssignmentsService.assignmentsList.add(assignments);

            }
        } catch (InputMismatchException exception) {
            System.out.println("\nĐÃ XẢY RA LỖI! SỐ LƯỢNG TÀI XẾ CHỈ CHO PHÉP NHẬP SỐ NGUYÊN THÔI!!! \n" +
                    "Phải nhập lại rồi!");
            inputNewBusDriver();
        }
    }

    public static void showBusDriver() {
        //for (BusDriver i : busDriverList) {
        //    System.out.println(i.toString()); // object.toString() biến dữ liệu của object thành một chuỗi
        if (busDriverList.isEmpty()) {
            System.out.println("DANH SÁCH TÀI XẾ HIỆN TẠI ĐANG RỖNG!!! \n\n" +
                    " ----->> Mời chọn [1] để thêm danh sách tài xế.");
        } else {
            busDriverList.forEach(busDriver -> System.out.println(busDriver.toString()));
        }
        //}

    }
    public static BusDriver findDriverName(String name) {
        BusDriver busDriver = null;
        for (BusDriver i : busDriverList) {
            if (i.getName() == name)
                busDriver = i;
        }
        return busDriver;
    }
}
