package lab4.bai2;
import java.util.InputMismatchException;
import java.util.Scanner;


public class LopHoc {
private String tenLop;
private int siSo;
private int khoi;

LopHoc (String tenLop, int siSo, int khoi){
	this.tenLop = tenLop;
	this.siSo = siSo;
	this.khoi = khoi;
}

public String getTenLop() {
	return tenLop;
}

public void setTenLop(String tenLop) {
	this.tenLop = tenLop;
}

public int getSiSo() {
	return siSo;
}

public void setSiSo(int siSo) {
	this.siSo = siSo;
}

public int getKhoi() {
	return khoi;
}

public void setKhoi(int khoi) {
	this.khoi = khoi;
}


	@Override
	public String toString() {
		return "Lớp " + this.getTenLop() + " Khối " + this.getKhoi() + " Sĩ số " + this.getSiSo();
	}
public void hienThiThongTin() {
	System.out.println(this.toString());
}

public void nhapThongTin(Scanner scanner) {
	try {
System.out.println("Nhập tên lớp");
	
	tenLop = scanner.nextLine();
	
	
	System.out.println("Nhập khối");
	khoi = Integer.parseInt(scanner.nextLine());
	
	System.out.println("Nhập sĩ số");
	
	siSo = Integer.parseInt(scanner.nextLine());
	
	} catch (InputMismatchException e) {
		System.err.print(e);
	}
	catch (NumberFormatException e) {
		System.err.print(e);
	}
}

}
