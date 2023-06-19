package lab4.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nhập thông tin lóp
		System.out.println("Nhập thông tin lớp");
		Scanner data = new Scanner(System.in);		
	LopHoc lop = new LopHoc(null,0,0);	
	ArrayList<ArrayList<String>> thoiKhoaBieu = new ArrayList<ArrayList<String>> ();
	lop.nhapThongTin(data);
		lop.hienThiThongTin();
		
		//Nhập thông tin học sinh
		System.out.println("Nhập thông tin học sinh");
		
		HocSinh hs = new HocSinh(null, null, null, 0, thoiKhoaBieu, null, lop);
		hs.nhapThongTin(data);
		hs.hienThiThongTin();
		hs.hienThiThoKhoaBieu();
		hs.hienThiThongTinLop();
		
		//Nhập thông tin giáo viên
		System.out.println("Nhập thông tin giáo viên");
		
		GiaoVien gv = new GiaoVien(null, null, null, 0, lop, null, thoiKhoaBieu);
		gv.nhapThongTin(data);
		gv.hienThiThongTin();
		gv.hienThiThoKhoaBieu();
		gv.hienThiThongTinLop();
		
		//Nhập thông tin nhân viên
		System.out.println("Nhập thông tin nhân viên");
		NhanVien nv = new NhanVien(null, null, null, 0, null, null);
		nv.nhapThongTin(data);
		nv.hienThiThongTin();

	}

}
