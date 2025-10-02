import java.util.Scanner;

public class MainClass {
	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float bienTam, diemTong;
		
		bienTam = nhapDiem("môn thứ nhất", scan);
		if(bienTam > 0) {
			diemTong = bienTam;
			bienTam = nhapDiem("môn thứ hai", scan);
			
			if(bienTam > 0) {
				diemTong += bienTam;
				bienTam = nhapDiem("môn thứ ba", scan);
				
				if(bienTam > 0) {
					diemTong += bienTam;
					diemTong += tinhDiemCong("Khu Vuc", scan);
					diemTong += tinhDiemCong("Doi Tuong", scan);
					
					kiemTraDiemChuan(nhapDiem("chuẩn", scan), diemTong);
				}
				
			}
		}
		System.out.println("Bạn đã rớt do có một điểm 0");
		return;
	}

	public static float nhapDiem(String tenMon, Scanner scan) {
		System.out.print("Mời bạn nhập điểm " + tenMon);
		return Float.parseFloat(scan.nextLine());
	}
	
	public static float tinhDiemCong(String loaiDiem, Scanner scan) {
		final byte DIEM_KHU_VUC_A = 2, DIEM_KHU_VUC_B = 1, DIEM_DOI_TUONG_3 = 1;
		final float DIEM_KHU_VUC_C = 0.5f, DIEM_DOI_TUONG_1 = 2.5f, DIEM_DOI_TUONG_2 = 1.5f;
		
		if(loaiDiem.equals("Khu Vuc")) {
			System.out.println("Nhập khu vực của thí sinh: ");
			System.out.println("A. Khu Vực A");
			System.out.println("B. Khu Vực B");
			System.out.println("C. Khu Vực C");
			System.out.println("X. Không có khu vực");
		} else {
			System.out.println("Nhập đối tượng của thí sinh: ");
			System.out.println("1. Đối tượng 1");
			System.out.println("2. Đối tượng 2");
			System.out.println("3. Đối tượng 3");
			System.out.println("0. Không có đối tượng");
		}
		
		switch(scan.nextLine()) {
		case "A":
		case "a":
			return DIEM_KHU_VUC_A;
		case "B":
		case "b":
			return DIEM_KHU_VUC_B;
		case "C":
		case "c":
			return DIEM_KHU_VUC_C;
		case "1":
			return DIEM_DOI_TUONG_1;
		case "2":
			return DIEM_DOI_TUONG_2;
		case "3":
			return DIEM_DOI_TUONG_3;
		default:
			return 0;
		}
	}

	public static void kiemTraDiemChuan(float diemChuan, float diemTong) {
		if (diemTong >= diemChuan) {
			System.out.println("Bạn đã đậu với số điểm: " + diemTong);
		} else {
			System.out.println("Bạn đã rớt do điểm của bạn là: " + diemTong + " thấp hơn điểm chuẩn " + diemChuan);
		}
	}

}
