package com.nguyenthao.JavaCore;

public class VanDon {

	public static void main(String[] args) {
		System.out.println(insertCheckNo("12345678"));
		System.out.println(revertBill("876543214"));
	}

	public static String removeNonDigit(String input) {
		// replace all character without digit to ','
		input = input.replaceAll("[^0-9]", ",");
		// Cut all character','
		String[] arrayString = input.split(",");
		// Convert array string to string
		String result = String.join("", arrayString);

		return result;
	}

	public static String insertCheckNo(String input) {
		int[] arrayNumber = new int[9];
		int Tong_le = 0;
		int Tong_chan = 0;
		int Tong = 0;
		int Du = 0;
		int Check = 0;

		// convert string input to array string
		String[] arrayString = input.split("");

		// convert array string to array int
		for (int i = 0; i < arrayString.length; i++) {
			arrayNumber[i] = Integer.parseInt(arrayString[i]);
		}

		// Tinh tong le
		for (int i = 1; i < arrayNumber.length - 1; i = i + 2) {
			Tong_le = Tong_le + arrayNumber[i] * 3;
		}

		// Tinh tong chan
		for (int i = 0; i < arrayNumber.length - 1; i = i + 2) {
			Tong_chan = Tong_chan + arrayNumber[i];
		}

		Tong = (Tong_le + Tong_chan);
		Du = Tong % 10;
		if (Du == 0) {
			Check = 0;
		} else {
			Check = 10 - Du;
		}
		arrayNumber[8] = Check;

		// convert array int to string
		StringBuilder builder = new StringBuilder();
		for (int i : arrayNumber) {
			builder.append(i);
		}
		String result = builder.toString();

		return result;
	}

	public static String revertBill(String input) {
		int[] arrayNumber = new int[9];
		String[] arrayString = input.split("");
		
		// convert array string to array int
		for (int i = 0; i < arrayString.length; i++) {
			arrayNumber[i] = Integer.parseInt(arrayString[i]);
		}

		int[] arrayNumberDaoChieu = new int[8];

		// dao chieu
		for (int i = 0; i < arrayNumber.length - 1; i++) {
			arrayNumberDaoChieu[i] = arrayNumber[7 - i];
		}

		// convert array int to string
		StringBuilder builder = new StringBuilder();
		for (int i : arrayNumberDaoChieu) {
			builder.append(i);
		}
		String mangDaoChieuString = builder.toString();

		String result = insertCheckNo(mangDaoChieuString);
		return result;
	}
}
