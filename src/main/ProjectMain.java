package main;

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


                    break;
                case 2: //In ra danh sách tài xế

                    break;
                case 3://

                    break;
                case 4://

                    break;
                case 5://

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
//                    System.exit(0);
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
            if (choice >= 1 && choice <= 8) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return choice;
    }

    private static void showMenu() {
        System.out.println("\n\n\n----------PHẦN MỀM QUẢN LÝ PHÂN CÔNG LÁI XE BUÝT------------");
        System.out.println("1. Nhập danh sách tài xế mới.");
        System.out.println("2. In ra danh sách sách tài xế.");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. Thoát chương trình.");
    }


}