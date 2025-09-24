import java.util.Scanner;

public class MainClass {
	// Hằng số tên môn
	final static String TEN_MON_1 = "môn thứ nhất";
	final static String TEN_MON_2 = "môn thứ hai";
	final static String TEN_MON_3 = "môn thứ ba";

	// Hằng số khu vực
	final static float KHU_VUC_A = 2.0f;
	final static float KHU_VUC_B = 1.0f;
	final static float KHU_VUC_C = 0.5f;
	final static float KHU_VUC_X = 0.0f;

	// Hằng số đối tượng
	final static float DOI_TUONG_1 = 2.5f;
	final static float DOI_TUONG_2 = 1.5f;
	final static float DOI_TUONG_3 = 1.0f;
	final static float DOI_TUONG_0 = 0.0f;

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float tongDiem = 0;

		// Nhập và cộng điểm 3 môn
		tongDiem += nhapMon(scan, TEN_MON_1);
		if (kiemTraDiem0(tongDiem))
			return;

		tongDiem += nhapMon(scan, TEN_MON_2);
		if (kiemTraDiem0(tongDiem))
			return;

		tongDiem += nhapMon(scan, TEN_MON_3);
		if (kiemTraDiem0(tongDiem))
			return;

		// Nhập và cộng điểm khu vực
		tongDiem += nhapKhuVuc(scan);

		// Nhập và cộng điểm đối tượng
		tongDiem += nhapDoiTuong(scan);

		// Nhập điểm chuẩn
		float diemChuan = nhapDiemChuan(scan);
		
		//Kiểm tra điểm chuẩn
		kiemTraDiemChuan(tongDiem, diemChuan);
	}

	public static float nhapMon(Scanner scan, String tenMon) {
		System.out.print("Nhập điểm " + tenMon + ": ");
		return Float.parseFloat(scan.nextLine());
	}

	public static boolean kiemTraDiem0(float diem) {
		if (diem == 0) {
			System.out.println("Bạn đã rớt do có môn bằng 0");
			return true;
		}
		return false;
	}

	public static float nhapKhuVuc(Scanner sc) {
		System.out.println("Nhập khu vực của thí sinh:");
		System.out.println("A. Khu Vực A");
		System.out.println("B. Khu Vực B");
		System.out.println("C. Khu Vực C");
		System.out.println("X. Không có khu vực");

		char khuVuc = sc.nextLine().toUpperCase().charAt(0);
		switch (khuVuc) {
		case 'A':
			return KHU_VUC_A;
		case 'B':
			return KHU_VUC_B;
		case 'C':
			return KHU_VUC_B;
		default:
			return KHU_VUC_X;
		}
	}

	public static float nhapDoiTuong(Scanner scan) {
		System.out.println("Nhập đối tượng của thí sinh:");
		System.out.println("1. Đối Tượng 1");
		System.out.println("2. Khu Vực B");
		System.out.println("3. Khu Vực C");
		System.out.println("0. Không có đối tượng");

		int doiTuong = Integer.parseInt(scan.nextLine());
		switch (doiTuong) {
		case 1:
			return DOI_TUONG_1;
		case 2:
			return DOI_TUONG_2;
		case 3:
			return DOI_TUONG_3;
		default:
			return DOI_TUONG_0;
		}
	}

	public static float nhapDiemChuan(Scanner sc) {
		System.out.print("Nhập điểm chuẩn: ");
		return Float.parseFloat(sc.nextLine());
	}

	public static void kiemTraDiemChuan(float tongDiem, float diemChuan) {
		if (tongDiem >= diemChuan) {
			System.out.println("Bạn đã đậu với số điểm: " + tongDiem);
		} else {
			System.out.println("Bạn đã rớt với số điểm: " + tongDiem);
		}
	}

}
