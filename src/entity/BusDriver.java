// mã LX là một số nguyên có 5 chữ số, tự động tăng.

package entity;

import constant.DrivingSkill;

import java.util.Scanner;

public class BusDriver extends Person {

    private static int AUTO_ID = 10000;

    private DrivingSkill drivingSkill;

    public BusDriver(String name, String address, String phone) {
        super();
        this.id = AUTO_ID++;
        this.name = name;
        this.address = address;
        this.phoneNumber = phone;
    }

    public DrivingSkill getDrivingSkill() {
        return drivingSkill;
    }

    public void setDrivingSkill(DrivingSkill drivingSkill) {
        this.drivingSkill = drivingSkill;
    }


    @Override
    public String toString() {
        System.out.println("\n　<< THÔNG TIN TÀI XẾ _ " + name + " _ >>" + '\n');
        System.out.println("∥　[1] MÃ TÀI XẾ       : --≫　【　 " + id + " 　】\n" +
                    "∥　[2] TÊN TÀI XẾ      : --≫　【　 " + name + "　　】\n" +
                    "∥　[3] ĐỊA CHỈ         : --≫　【　 "  + address + "　　】\n" +
                    "∥　[4] SỐ ĐIỆN THOẠI   : --≫　【　 " + phoneNumber + "　　】\n" +
                    "∥　[5] TRÌNH ĐỘ LÁI XE : --≫　【　 " + drivingSkill + "　　】\n");
        return "";
    }

    public void inputDrivingSkill() {
        System.out.println("Mời lựa chọn một trong những trình độ lái xe dưới đây (A ~ F): ");
        System.out.println("1. Skill level A - MASTER [BẬC THẦY] ");
        System.out.println("2. Skill level B - EXPERT [CHUYÊN GIA] ");
        System.out.println("3. Skill level C - PROFESSIONAL [NHÀ NGHỀ] ");
        System.out.println("4. Skill level D - ADVANCED [THÀNH THẠO] ");
        System.out.println("5. Skill level E - INTERMEDIATE [PHỔ THÔNG] ");
        System.out.println("6. Skill level F - BEGINNER [NHẬP MÔN] ");

        int skillChoice = 0;
        do {
            skillChoice = new Scanner(System.in).nextInt();
            if (skillChoice >= 1 && skillChoice <= 6) {
                break;
            }
        } while (true);
        switch (skillChoice) {
            case 1:
                this.setDrivingSkill(DrivingSkill.A_MASTER_BACTHAY);
                break;

            case 2:
                this.setDrivingSkill(DrivingSkill.B_EXPERT_CHUYENGIA);
                break;

            case 3:
                this.setDrivingSkill(DrivingSkill.C_PROFESSIONAL_NHANGHE);
                break;

            case 4:
                this.setDrivingSkill(DrivingSkill.D_ADVANCED_THANHTHAO);
                break;

            case 5:
                this.setDrivingSkill(DrivingSkill.E_INTERMEDIATE_PHOTHONG);
                break;

            case 6:
                this.setDrivingSkill(DrivingSkill.F_BEGINNER_NHAPMON);
                break;
        }
    }
}
