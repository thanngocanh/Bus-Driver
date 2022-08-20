//Quy định trình độ lái xe được chọn trong các mức từ Loại A đến Loại F

package constant;

public enum DrivingSkill {
    A_MASTER_BACTHAY("Skill level A - MASTER [BẬC THẦY] "),
    B_EXPERT_CHUYENGIA("Skill level B - EXPERT [CHUYÊN GIA] "),
    C_PROFESSIONAL_NHANGHE("Skill level C - PROFESSIONAL [NHÀ NGHỀ] "),
    D_ADVANCED_THANHTHAO("Skill level D - ADVANCED [THÀNH THẠO] "),
    E_INTERMEDIATE_PHOTHONG("Skill level E - INTERMEDIATE [PHỔ THÔNG] "),
    F_BEGINNER_NHAPMON("Skill level F - BEGINNER [NHẬP MÔN] ");

    public String value;

    DrivingSkill(String value) {
        this.value = value;
    }


}
