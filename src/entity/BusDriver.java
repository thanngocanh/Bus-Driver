// mã LX là một số nguyên có 5 chữ số, tự động tăng.

package entity;

import constant.DrivingSkill;

import java.util.Scanner;

public class BusDriver extends Person implements Comparable<BusDriver> {

    private static int AUTO_ID = 10000;

    private DrivingSkill drivingSkill;

    //get and set
    public DrivingSkill getDrivingSkill() {
        return drivingSkill;
    }

    public void setDrivingSkill(DrivingSkill drivingSkill) {
        this.drivingSkill = drivingSkill;
    }

    //constructor
    public BusDriver(DrivingSkill drivingSkill) {
        this.drivingSkill = drivingSkill;
    }

    @Override
    public String toString() {
        return "BusDriver{" +
                "driverId=" + driverId +
                ", driverName='" + driverName + '\'' +
                ", driverAddress='" + driverAddress + '\'' +
                ", driverPhoneNumber='" + driverPhoneNumber + '\'' +
                ", drivingSkill=" + drivingSkill.value +
                '}';
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        this.driverId = BusDriver.AUTO_ID++;
        this.inputDrivingSkill();
    }

    public void inputDrivingSkill() {
        System.out.println("Mời lựa chọn một trong những trình độ lái xe dưới đây (A ~ F): ");
        System.out.println("1. Skill level A - MASTER");
        System.out.println("2. Skill level B - EXPERT");
        System.out.println("3. Skill level C - PROFESSIONAL");
        System.out.println("4. Skill level D - ADVANCED");
        System.out.println("5. Skill level E - INTERMEDIATE");
        System.out.println("6. Skill level F - BEGINNER");

        int skillChoice = 0;
        do {
            skillChoice = new Scanner(System.in).nextInt();
            if (skillChoice >= 1 && skillChoice <= 6) {
                break;
            }
        } while (true);
        switch (skillChoice) {
            case 1:
                this.setDrivingSkill(DrivingSkill.A);
                break;

            case 2:
                this.setDrivingSkill(DrivingSkill.B);
                break;

            case 3:
                this.setDrivingSkill(DrivingSkill.C);
                break;

            case 4:
                this.setDrivingSkill(DrivingSkill.D);
                break;

            case 5:
                this.setDrivingSkill(DrivingSkill.E);
                break;

            case 6:
                this.setDrivingSkill(DrivingSkill.F);
                break;
        }
    }

    @Override
    public int compareTo(BusDriver busDriver) {
        if (this.driverId > busDriver.getDriverId()) {
            return 1;
        } else if (this.driverId < busDriver.getDriverId()) {
            return -1;
        }
        return 0;
    }
}
