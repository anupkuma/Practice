package com.shahi.dec;

public class FoxAndIntegers {
	public static void main(String[] args) {
		float AminusB = 30;
		float BminusC = 30;
		float AplusB = 30;
		float BplusC = -30;

		float A = (AminusB + AplusB) / 2;

		float B = (AplusB - A);

		float C = BplusC - B;

		if (A == (int) A && AminusB == (A - B) && AplusB == (A + B)
				&& B == (int) B && BminusC == (B - C) && C == (int) C
				&& BplusC == (B + C)) {
			System.out.println("A = " + A + " B = " + B + " C = " + C);
		}
		

	}
}
