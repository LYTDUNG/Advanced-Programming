package lab2;

public class Ex8 {
	public static String getLunarYear(int year) {
		// Can Chi của năm dương lịch
		int heavenlyStemIndex = (year + 6) % 10;
		int earthlyBranchIndex = (year + 8) % 12;

		String heavenlyStem;
		String earthlyBranch;

		switch (heavenlyStemIndex) {
		case 0:
			heavenlyStem = "Giáp";
			break;
		case 1:
			heavenlyStem = "Ất";
			break;
		case 2:
			heavenlyStem = "Bính";
			break;
		case 3:
			heavenlyStem = "Đinh";
			break;
		case 4:
			heavenlyStem = "Mậu";
			break;
		case 5:
			heavenlyStem = "Kỷ";
			break;
		case 6:
			heavenlyStem = "Canh";
			break;
		case 7:
			heavenlyStem = "Tân";
			break;
		case 8:
			heavenlyStem = "Nhâm";
			break;
		case 9:
			heavenlyStem = "Quý";
			break;
		default:
			heavenlyStem = ""; // Xử lý trường hợp không xác định
		}

		switch (earthlyBranchIndex) {
		case 0:
			earthlyBranch = "Tý";
			break;
		case 1:
			earthlyBranch = "Sửu";
			break;
		case 2:
			earthlyBranch = "Dần";
			break;
		case 3:
			earthlyBranch = "Mão";
			break;
		case 4:
			earthlyBranch = "Thìn";
			break;
		case 5:
			earthlyBranch = "Tỵ";
			break;
		case 6:
			earthlyBranch = "Ngọ";
			break;
		case 7:
			earthlyBranch = "Mùi";
			break;
		case 8:
			earthlyBranch = "Thân";
			break;
		case 9:
			earthlyBranch = "Dậu";
			break;
		case 10:
			earthlyBranch = "Tuất";
			break;
		case 11:
			earthlyBranch = "Hợi";
			break;
		default:
			earthlyBranch = ""; // Xử lý trường hợp không xác định
		}

		return heavenlyStem + " " + earthlyBranch;
	}
}
