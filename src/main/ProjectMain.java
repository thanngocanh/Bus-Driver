package main;

import logic_handle.AssignmentsService;
import logic_handle.BusDriverService;
import logic_handle.BusLineService;

import java.util.Scanner;

public class ProjectMain {

    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        boolean isExit = false;
        do {
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1: //Thêm danh sách tài xế mới
                    BusDriverService.inputNewBusDriver();
                    break;
                case 2: //In ra danh sách tài xế
                    BusDriverService.showBusDriver();
                    break;
                case 3://Thêm danh sách tuyến xe buýt mới
                    BusLineService.inputNewBusLine();
                    break;
                case 4://In ra danh sách tuyến xe buýt
                    BusLineService.showBusLine();
                    break;
                case 5://Nhập danh sách phân công cho tài xế
                    AssignmentsService.addAssignments();
                    break;
                case 6://In ra bảng phân công

                    break;
                case 7://Sắp xếp danh sách phân công

                    break;
                case 8://Hiển thị bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe

                    break;
                case 9:
//                   System.exit(0);
                    isExit = true;
            }
        } while (!isExit);
    }

    private static int functionChoice() {
        showMenu();
        System.out.print("Xin mời chọn chức năng: ");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, chọn lại: ");
        } while (true);
        return choice;
    }

    private static void showMenu() {
        System.out.println("\n\n\n---------- PHẦN MỀM QUẢN LÝ PHÂN CÔNG LÁI XE BUÝT ------------");
        System.out.println("1. Nhập danh sách tài xế mới.");
        System.out.println("2. Hiển thị danh sách tài xế hiện tại.");
        System.out.println("3. Nhập danh sách tuyến xe buýt mới.");
        System.out.println("4. Hiển thị danh sách tuyến xe buýt hiện tại.");
        System.out.println("5. Đăng kí tuyến xe cho tài xế.");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. ");
        System.out.println("9. Thoát khỏi ứng dụng.");
    }


}