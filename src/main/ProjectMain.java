package main;

import logic_handle.AssignmentsService;
import logic_handle.BusDriverService;
import logic_handle.BusLineService;

import java.util.InputMismatchException;
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
                    System.out.println("\nĐã lưu danh sách tài xế mới! " +
                            "\nChọn [2] để hiển thị thông tin danh sách tài xế." +
                            "\n[Lưu ý] Nếu trong quá trình nhập dữ liệu thông tin xảy ra lỗi, danh sách tài xế mới thêm vào sẽ không được lưu lại.");
                    break;
                case 2: //In ra danh sách tài xế
                    System.out.println("\n\n/////---------- DANH SÁCH THÔNG TIN TÀI XẾ ------------/////\n\n");
                    BusDriverService.showBusDriver();
                    break;
                case 3://Thêm danh sách tuyến xe buýt mới
                    BusLineService.inputNewBusLine();
                    System.out.println("\nĐã lưu danh sách tuyến xe buýt mới! " +
                            "\nChọn [4] để hiển thị thông tin danh sách tuyến xe buýt." +
                            "\n[Lưu ý] Nếu trong quá trình nhập dữ liệu thông tin xảy ra lỗi, danh sách tuyến xe buýt mới thêm vào sẽ không được lưu lại.");
                    break;
                case 4://In ra danh sách tuyến xe buýt
                    System.out.println("\n\n/////---------- DANH SÁCH THÔNG TIN TUYẾN XE BUÝT ------------/////\n\n");
                    BusLineService.showBusLine();
                    break;
                case 5://Nhập bảng phân công cho tài xế
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
        System.out.print("\nChọn từ [1] ~ [8] để quản lí và hiển thị thông tin. Chọn [9] để thoát khỏi ứng dụng.");
        System.out.println("\nXIN MỜI LỰA CHỌN CHỨC NĂNG: ");
        int choice = 0;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
            } catch (InputMismatchException exception) {
                System.out.print("\nĐÃ XẢY RA LỖI! CHƯƠNG TRÌNH HIỆN TẠI CHỈ CHO PHÉP NHẬP <SỐ NGUYÊN> TỪ [1] ~ [9]!!! \n" +
                        "Mời chọn lại: ");
                continue;
            }
                if (choice >= 1 && choice <= 9) {
                    break;
            } System.out.print("\nĐÃ XẢY RA LỖI! CHƯƠNG TRÌNH HIỆN TẠI CHỈ CHO PHÉP NHẬP <SỐ NGUYÊN> TỪ [1] ~ [9]!!! \n" +
                    "Mời chọn lại: ");
        } while (true);
        return choice;
    }

    private static void showMenu() {
        System.out.println("\n\n---------- PHẦN MỀM QUẢN LÝ PHÂN CÔNG LÁI XE BUÝT ------------");
        System.out.println("1. Nhập danh sách tài xế mới.");
        System.out.println("2. Hiển thị danh sách tài xế hiện tại.");
        System.out.println("3. Nhập danh sách tuyến xe buýt mới.");
        System.out.println("4. Hiển thị danh sách tuyến xe buýt hiện tại.");
        System.out.println("5. Nhập bảng phân công cho tài xế.");
        System.out.println("6. Hiển thị bảng phân công đã đăng kí");
        System.out.println("7. Sắp xếp danh sách phân công.");
        System.out.println("8. Hiển thị bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe.");
        System.out.println("9. Thoát khỏi ứng dụng.");
    }


}