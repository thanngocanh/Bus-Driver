//Quy định trình độ lái xe được chọn trong các mức từ Loại A đến Loại F

package constant;

public enum DrivingSkill {
    A("Skill level A - MASTER"),
    B("Skill level B - EXPERT"),
    C("Skill level C - PROFESSIONAL"),
    D("Skill level D - ADVANCED"),
    E("Skill level E - INTERMEDIATE"),
    F("Skill level F - BEGINNER");

    public String value;

    DrivingSkill(String value) {
        this.value = value;
    }


}
