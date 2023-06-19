package lab4.bai2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class HocSinh extends Person implements HocSinhVaGiaoVien{
	private ArrayList<ArrayList<String>> lichHoc;
	private String giaoVienChuNhiem;
	private LopHoc lopDangHoc;
	

	HocSinh(String hoTen, String gioiTinh, String queQuan, int namSinh, ArrayList<ArrayList<String>> lichHoc, String giaoVienChuNhiem, LopHoc lopDangHoc){
		super (hoTen, gioiTinh, queQuan, namSinh);
		this.lichHoc = lichHoc;
		this.giaoVienChuNhiem = giaoVienChuNhiem;
		this.lopDangHoc = lopDangHoc;
	}


	public ArrayList<ArrayList<String>> getLichHoc() {
		return lichHoc;
	}


	public void setLichHoc(ArrayList<ArrayList<String>> lichHoc) {
		this.lichHoc = lichHoc;
	}


	public String getGiaoVienChuNhiem() {
		return giaoVienChuNhiem;
	}


	public void setGiaoVienChuNhiem(String giaoVienChuNhiem) {
		this.giaoVienChuNhiem = giaoVienChuNhiem;
	}


	public LopHoc getLopDangHoc() {
		return lopDangHoc;
	}


	public void setLopDangHoc(LopHoc lopDangHoc) {
		this.lopDangHoc = lopDangHoc;
	}

	public void hienThiThoKhoaBieu() {
		System.out.println("Thời khóa biểu của " + this.hoTen);
		for (ArrayList<String> thu : lichHoc) {
			System.out.println();
			
			for(String mon : thu) {
				
			System.out.println(mon);
			}
		}
		}
	
	public void hienThiThongTinLop() {
		System.out.println("Lớp đang học " + lopDangHoc);
		
		
		
		}
	private void nhapThoiKhoaBieu(Scanner scanner) {
		lichHoc = new ArrayList<ArrayList<String>>();
		for(int i=0;i<6;i++) {
			ArrayList<String>ngay = new ArrayList<String>();
			System.out.println("Nhập thời khóa biểu thứ " + (i+2));
			ngay.add("thứ " + (i+2));
			System.out.println("Nhập số lượng môn học thứ " + (i+2));
			int soLuong = Integer.parseInt(scanner.nextLine());
			for (int j = 0; j < soLuong;j++) {
				System.out.println("Nhập môn học thứ " + (j+1));
				String monHoc = scanner.nextLine();
				ngay.add(monHoc);
			}
			lichHoc.add(ngay);
	}
		
	}
	
	@Override
	public void nhapThongTin(Scanner scanner) {
		try {
		System.out.print("Nhập họ tên học sinh: ");
		hoTen = scanner.nextLine();
		
		System.out.print("Nhập giới tính: ");
		gioiTinh = scanner.nextLine();
		System.out.print("Nhập quê quán: ");
		queQuan = scanner.nextLine();
		
		
		System.out.print("Nhập tên giáo viên chủ nhiệm: ");
		giaoVienChuNhiem = scanner.nextLine();
		
		System.out.print("Nhập năm sinh: ");
		namSinh = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập lớp đang học: ");
		
		lopDangHoc.nhapThongTin(scanner);
		
		System.out.print("Nhập thời khóa biểu: ");
		nhapThoiKhoaBieu(scanner);
		} catch (InputMismatchException e) {
			System.err.print(e);
		}
		catch (NumberFormatException e) {
			System.err.print(e);
		}

		}
	
	}
		
		
	
	
	
	


