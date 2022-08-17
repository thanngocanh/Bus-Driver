//Khai báo lớp Lái xe (mã LX, Họ tên, Địa chỉ, Số ĐT, Trình độ)

package entity;

import java.util.Objects;
import java.util.Scanner;

public abstract class Person implements Inputable {

    protected int driverId;
    protected String driverName;
    protected String driverAddress;
    protected String driverPhoneNumber;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }

    public void setDriverPhoneNumber(String driverPhoneNumber) {
        this.driverPhoneNumber = driverPhoneNumber;
    }


    @Override
    public void inputInfo() {
        System.out.println("Mời nhập họ tên: ");
        this.setDriverName(new Scanner(System.in).nextLine());
        System.out.println("Mời nhập địa chỉ: ");
        this.setDriverAddress(new Scanner(System.in).nextLine());
        System.out.println("Mời nhập số điện thoại: ");
        this.setDriverPhoneNumber(new Scanner(System.in).nextLine());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getDriverId() == person.getDriverId() && getDriverName().equals(person.getDriverName()) && getDriverAddress().equals(person.getDriverAddress()) && getDriverPhoneNumber().equals(person.getDriverPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDriverId(), getDriverName(), getDriverAddress(), getDriverPhoneNumber());
    }
}
