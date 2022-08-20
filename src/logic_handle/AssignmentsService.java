package logic_handle;

import entity.Assignments;
import entity.BusLine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AssignmentsService {

    static List<Assignments> assignmentsList = new ArrayList<>();

    public static int addAssignments() {
        System.out.println("Nhap ten tai xe: ");
        String name = new Scanner(System.in).nextLine();
        List<String> driverNameList = assignmentsList.stream()
                .map(x -> x.getBusDriver().getName()).collect(Collectors.toList());
        if (!driverNameList.contains(name)) {
            System.out.println("Tai xe khong ton tai!");
            return 1;
        }
        for (Assignments i : assignmentsList) {
            if (name.equalsIgnoreCase(i.getBusDriver().getName())){
                System.out.println("Moi nhap ma so xe buyt: ");
                int id = new Scanner(System.in).nextInt();
                List<Integer> busIDList = BusLineService.busLineList.stream()
                        .map(BusLine::getBusLineID).collect(Collectors.toList());
                if (!busIDList.contains(id)) {
                    System.out.println("Ma so xe buyt khong ton tai!");
                    return 1;
                }
                BusLine busLine = BusLineService.findBusLine(id);
                i.getBusLineList().add(busLine);

            }
        }
        return 1;
    }
}
