package logic_handle;

import entity.Assignments;
import entity.BusLine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AssignmentsService {

    public static final String ASSIGNMENTS_FILE_NAME = "Assignments.dat";

    static List<Assignments> assignmentsList = new ArrayList<>();

    public static int addAssignments() {
        System.out.println("\nMời nhập tên tài xế: ");
        String name = new Scanner(System.in).nextLine();
        List<String> driverNameList = assignmentsList.stream()
                .map(x -> x.getBusDriver().getName()).collect(Collectors.toList());
        if (!driverNameList.contains(name)) {
            System.out.println("\nTÊN TÀI XẾ VỪA NHẬP HIỆN KHÔNG TỒN TẠI TRONG DANH SÁCH!!! \n\n" +
                    " ----->> Mời chọn [1] để thêm danh sách tài xế. " +
                    "Hoặc nhập lại tên tài xế khác hiện đang có trong danh sách.");
            return 1;
        }
        for (Assignments i : assignmentsList) {
            if (name.equalsIgnoreCase(i.getBusDriver().getName())){
                System.out.println("Mời nhập mã tuyến: ");
                int id = new Scanner(System.in).nextInt();
                List<Integer> busIDList = BusLineService.busLineList.stream()
                        .map(BusLine::getBusLineID).collect(Collectors.toList());
                if (!busIDList.contains(id)) {
                    System.out.println("\nMÃ TUYẾN VỪA NHẬP HIỆN KHÔNG TỒN TẠI TRONG DANH SÁCH!!! \n\n" +
                            " ----->> Mời chọn [3] để thêm tuyến xe buýt mới. " +
                            "Hoặc nhập lại mã tuyến khác hiện đang có trong danh sách.");
                    return 1;
                }
                BusLine busLine = BusLineService.findBusLine(id);
                i.getBusLineList().add(busLine);

            }
        }
        return 1;
    }
}
