package lab4.bai2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class GiaoVien extends Person implements HocSinhVaGiaoVien {
	private LopHoc lopDangChuNhiem;
	private String tenBoMon;
	private ArrayList<ArrayList<String>> lichDay;
	
GiaoVien(String hoTen, String gioiTinh, String queQuan, int namSinh,LopHoc lopDangChuNhiem,String tenBoMon,ArrayList<ArrayList<String>> lichDay){
	super (hoTen, gioiTinh, queQuan, namSinh);
	this.lopDangChuNhiem = lopDangChuNhiem;
	this.tenBoMon = tenBoMon;
	this.lichDay = lichDay;
}

public LopHoc getLopDangChuNhiem() {
	return lopDangChuNhiem;
}

public void setLopDangChuNhiem(LopHoc lopDangChuNhiem) {
	this.lopDangChuNhiem = lopDangChuNhiem;
}

public String getTenBoMon() {
	return tenBoMon;
}

public void setTenBoMon(String tenBoMon) {
	this.tenBoMon = tenBoMon;
}

public ArrayList<ArrayList<String>> getLichDay() {
	return lichDay;
}

public void setLichDay(ArrayList<ArrayList<String>> lichDay) {
	this.lichDay = lichDay;
}

public void hienThiThoKhoaBieu() {
	System.out.println("Thời khóa biểu của " + this.hoTen);
	for (ArrayList<String> thu : lichDay) {
		System.out.println();
		for(String mon : thu) {
		System.out.println(mon);
		}
	}
	}

public void hienThiThongTinLop() {
	System.out.println("Lớp chủ nhiệm: " + lopDangChuNhiem);
	
	
	}

private void nhapThoiKhoaBieu(Scanner scan) {
	lichDay = new ArrayList<ArrayList<String>>();
	System.out.println("Nhập thời khóa biểu");
	
	for(int i=0;i<6;i++) {
		ArrayList<String> thu = new ArrayList<>();
		System.out.println("Nhập thời khóa biểu thứ " + (i+2));
		thu.add("thứ " + (i+2));
		System.out.println("Nhập số lượng lớp cần dạy thứ " + (i+2));
		int soLuong = Integer.parseInt(scan.nextLine());
		for (int j = 0; j < soLuong;j++) {
			System.out.println("Nhập lớp thứ " + (j+1));
			String monHoc = scan.nextLine();
			thu.add(monHoc);
			
		}
		lichDay.add(thu);
	}
	
	
	
}

@Override
public void nhapThongTin(Scanner scan) {
	try {
	System.out.print("Nhập họ tên giáo viên: ");
	this.hoTen = scan.nextLine();
	System.out.print("Nhập giới tính: ");
	this.gioiTinh = scan.nextLine();
	System.out.print("Nhập quê quán: ");
	this.queQuan = scan.nextLine();
	System.out.print("Nhập năm sinh: ");
	this.namSinh = Integer.parseInt(scan.nextLine());
	System.out.print("Nhập tên bộ môn: ");
	this.tenBoMon = scan.nextLine();
	System.out.print("Nhập lớp đang chủ nhiệm: ");
	lopDangChuNhiem.nhapThongTin(scan);
	
	System.out.print("Nhập thời khóa biểu: ");
	nhapThoiKhoaBieu(scan);
	
	} catch (InputMismatchException e) {
		System.err.print(e);
	}
	catch (NumberFormatException e) {
		System.err.print(e);
	}
}
}
