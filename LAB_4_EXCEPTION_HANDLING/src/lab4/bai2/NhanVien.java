package lab4.bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NhanVien extends Person{
private String phongBan;
private String chucVu;

NhanVien(String hoTen, String gioiTinh, String queQuan, int namSinh, String phongBan, String chucVu){
	super (hoTen, gioiTinh, queQuan, namSinh);
	this.phongBan = phongBan;
	this.chucVu = chucVu;
}

public String getPhongBan() {
	return phongBan;
}

public void setPhongBan(String phongBan) {
	this.phongBan = phongBan;
}

public String getChucVu() {
	return chucVu;
}

public void setChucVu(String chucVu) {
	this.chucVu = chucVu;
}

@Override
public void nhapThongTin(Scanner scan) {
	try {
System.out.print("Nhập họ tên: ");
this.hoTen = scan.nextLine();
System.out.print("Nhập giới tính: ");
this.gioiTinh = scan.nextLine();
System.out.print("Nhập quê quán: ");
this.queQuan = scan.nextLine();
System.out.print("Nhập năm sinh: ");
this.namSinh = Integer.parseInt(scan.nextLine());
System.out.print("Nhập phòng ban: ");
this.phongBan = scan.nextLine();
System.out.print("Nhập chức vụ: ");
this.chucVu = scan.nextLine();

	} catch (InputMismatchException e) {
		System.err.print(e);
	}
	catch (NumberFormatException e) {
		System.err.print(e);
	}
}
}
