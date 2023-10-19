package cat;

import java.util.Arrays;
import java.util.Iterator;

public class Room02 {
	public static void main(String[] args) {

		int len = (int) ((Math.random() * 8) + 3); // 3~11
		int wid = (int) ((Math.random() * 8) + 3);

		char[][] arr01 = new char[len][wid];

		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				if (i == 0 || i == arr01.length - 1 || j == 0 || j == arr01[i].length - 1) {
					arr01[i][j] = '■';
				} else {
					arr01[i][j] = '□';
				}
			}
		}

		while (true) {
			int random1 = (int) (Math.random() * arr01.length);
			int random2 = (int) (Math.random() * arr01[0].length); // 배열 안 길이는 임의의 값 상관x

			if ((random1 == 0 || random1 == arr01.length - 1) && (random2 != 0 && random2 != arr01[0].length - 1)) {
				arr01[random1][random2] = '□';
				break;

			} else if ((random2 == 0 || random2 == arr01[0].length - 1)
					&& (random1 != 0 && random1 != arr01.length - 1)) {

				arr01[random1][random2] = '□';
				break;

			} else {
				random1 = (int) (Math.random() * arr01.length);
				random2 = (int) (Math.random() * arr01[0].length);

			}

		}

		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				System.out.print(arr01[i][j]);
			}
			System.out.println("");
		}
	}
}