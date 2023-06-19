package lab4.bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
protected String hoTen;
protected String gioiTinh;
protected String queQuan;
protected int namSinh;

Person (String hoTen, String gioiTinh, String queQuan, int namSinh){
	this.hoTen = hoTen;
	this.gioiTinh = gioiTinh;
	this.queQuan = queQuan;
	this.namSinh = namSinh;
}

public String getHoTen() {
	return hoTen;
}

public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}

public String getGioiTinh() {
	return gioiTinh;
}

public void setGioiTinh(String gioiTinh) {
	this.gioiTinh = gioiTinh;
}

public String getQueQuan() {
	return queQuan;
}

public void setQueQuan(String queQuan) {
	this.queQuan = queQuan;
}

public int getNamSinh() {
	return namSinh;
}

public void setNamSinh(int namSinh) {
	this.namSinh = namSinh;
}

@Override
public String toString() {
	return "Họ tên: " + this.getHoTen() + " Giới tính: " + this.getGioiTinh() + " Quê quán: " + this.getQueQuan() + " Năm sinh: " + this.getNamSinh();
}
public void hienThiThongTin() {
System.out.println(this.toString());
}

public void nhapThongTin(Scanner scan) {
	try {
System.out.println("Nhập họ tên");
this.hoTen = scan.nextLine();

System.out.println("Nhập giới tính");
this.gioiTinh = scan.nextLine();
System.out.println("Nhập quê quán");
this.queQuan = scan.nextLine();
System.out.println("Nhập năm sinh");
this.namSinh = scan.nextInt();
	} catch (InputMismatchException e) {
		System.err.print(e);
	}
	catch (NumberFormatException e) {
		System.err.print(e);
	}
}

}
