//lái xe trong một ngày được phân công lái xe trên một hoặc nhiều tuyến,
// với mỗi tuyến cần cho biết lái xe đó sẽ lái bao nhiêu lượt.
// Giả sử tổng số lượt trong ngày của lái xe không vượt quá 15.

package logic_handle;

import entity.Assignments;
import entity.BusDriver;
import entity.BusLine;

import java.util.*;
import java.util.stream.Collectors;

public class AssignmentsService {

    static List<Assignments> assignmentsList = new ArrayList<>();
    static List<BusDriver> busDriverList = new ArrayList<>();

    static List<BusLine> busLineList = new ArrayList<>();

    public static void addAssignments() {
        if (BusDriverService.busDriverList.isEmpty() || BusLineService.busLineList.isEmpty()) {
            System.out.println("\nDANH SÁCH TÀI XẾ HOẶC DANH SÁCH TUYẾN XE BUÝT HIỆN ĐANG RỖNG!!! \n\n" +
                    " ----->> Mời chọn [1] để thêm << DANH SÁCH TÀI XẾ >> " +
                    "hoặc ----->> chọn [3] để thêm << DANH SÁCH TUYẾN XE BUÝT >> mới.");
        } else {
            System.out.print("Mời nhập số lượng tài xế muốn phân công: ");
            int busDriverNumber = 0;
            do {
                try {
                    busDriverNumber = new Scanner(System.in).nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("\nĐÃ XẢY RA LỖI! SỐ LƯỢNG TÀI XẾ CHỈ CHO PHÉP NHẬP SỐ NGUYÊN THÔI!!! \n" +
                            "Mời nhập lại: ");
                    continue;
                }
                if (busDriverNumber > 0) {
                    break;
                }
                System.out.println("\nSỐ LƯỢNG TÀI XẾ PHẢI LỚN HƠN 0!!! \n" +
                        "Mời nhập lại: ");
            } while (true);
            for (int i = 0; i < busDriverNumber; i++) {
                System.out.println("\nMời nhập tên tài xế: ");
                String name = new Scanner(System.in).nextLine();
                List<String> driverNameList = busDriverList.stream().map(BusDriver::getName).collect(Collectors.toList());
                if (!driverNameList.contains(name)) {
                    System.out.println("\nTÊN TÀI XẾ VỪA NHẬP HIỆN KHÔNG TỒN TẠI TRONG DANH SÁCH!!! \n\n" +
                            " ----->> Mời chọn [1] để thêm danh sách tài xế. " +
                            "Hoặc nhập lại tên tài xế khác hiện đang có trong danh sách.");
                } else {
                System.out.print("Mời nhập số tuyến cần phân công hôm nay cho tài xế _" + name + "_: ");}
                int busLineNumber = 0;
                do {
                    try {
                        busLineNumber = new Scanner(System.in).nextInt();
                    } catch (InputMismatchException exception) {
                        System.out.println("\nĐÃ XẢY RA LỖI! SỐ TUYẾN CHỈ CHO PHÉP NHẬP SỐ NGUYÊN THÔI!!! \n" +
                                "Mời nhập lại: ");
                        continue;
                    }
                    if (busLineNumber > 0) {
                        break;
                    }
                    System.out.println("\nPHẢI PHÂN CÔNG TÀI XẾ TRONG MỘT NGÀY LÁI XE TRÊN MỘT HOẶC NHIỀU TUYẾN!!! \n" +
                            "Mời nhập lại: ");
                } while (true);
                for (int j = 0; j < busLineNumber; j++) {
                    for (BusDriver busDriver : busDriverList) {
                        if (name.equalsIgnoreCase(busDriver.getName())) {
                            System.out.println("Mời nhập mã tuyến: ");
                            try {
                                int id = new Scanner(System.in).nextInt();
                                List<Integer> busIDList = busLineList.stream().map(BusLine::getBusLineID).collect(Collectors.toList());
                                if (!busIDList.contains(id)) {
                                    System.out.println("\nMÃ TUYẾN VỪA NHẬP HIỆN KHÔNG TỒN TẠI TRONG DANH SÁCH!!! \n\n" +
                                            " ----->> Mời chọn [3] để thêm tuyến xe buýt mới. " +
                                            "Hoặc nhập lại mã tuyến khác hiện đang có trong danh sách.");
                                }
                                BusLine busLine = BusLineService.findBusLine(id);
                                busLineList.add(busLine);
                                int turnsNumber = 0;
                                do {
                                    try {
                                        turnsNumber = new Scanner(System.in).nextInt();
                                    } catch (InputMismatchException exception) {
                                        System.out.println("\nĐÃ XẢY RA LỖI! SỐ LƯỢT CHẠY CHỈ CHO PHÉP NHẬP SỐ NGUYÊN THÔI!!! \n" +
                                                "Mời nhập lại: ");
                                        continue;
                                    }
                                    if (turnsNumber > 0 && turnsNumber <= 15) {
                                        break;
                                    }
                                    System.out.println("\nSỐ LƯỢT CHẠY MỖI NGÀY PHẢI LỚN HƠN 0 " +
                                            "VÀ KHÔNG ĐƯỢC VƯỢT QUÁ 15 LƯỢT!!! \n" +
                                            "Phải nhập lại rồi!!");
                                } while (true);
                                for (int k = 0; k < turnsNumber; k++) {
                                    Assignments driverAssignments = new Assignments(name, id, turnsNumber);
                                    assignmentsList.add(driverAssignments);
                                }
                            } catch (InputMismatchException exception) {
                                System.out.println("\nĐÃ XẢY RA LỖI! CHƯƠNG TRÌNH CHỈ CHO PHÉP NHẬP SỐ NGUYÊN THÔI!!! \n" +
                                        "Phải nhập lại rồi!");
                            }

                        }

                    }
                }
            }
        }
    }
}