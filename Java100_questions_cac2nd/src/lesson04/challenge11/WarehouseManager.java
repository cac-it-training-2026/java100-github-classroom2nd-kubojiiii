/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] MQArrayC = new int[5];
		int[] MQArrayD = new int[5];
		int[] MQArrayE = new int[5];

		int[][] MQArrayall = new int[3][5];
		MQArrayall[0] = MQArrayC;
		MQArrayall[1] = MQArrayD;
		MQArrayall[2] = MQArrayE;

		//ここに配列に値を代入する処理を記述する。(要素はランダム)

		for (int i = 0; i < MQArrayall.length; i++) {
			for (int j = 0; j < MQArrayall[0].length; j++) {
				int num = (int) (Math.random() * 10) % 4;
				if (num == 0) {
					MQArrayall[i][j] = 0;
				} else {
					MQArrayall[i][j] = (int) (Math.random() * 10) % 10 + 1;

				}
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");
		for (int i = 0; i < MQArrayC.length; i++) {
			System.out.print(MQArrayC[i]);
			if (i != (MQArrayC.length - 1)) {
				System.out.print(",");
			}
		}

		//ここに配列Cの要素をすべて出力する処理を記述する。

		System.out.print("\n\nD...");
		for (int i = 0; i < MQArrayD.length; i++) {
			System.out.print(MQArrayD[i]);
			if (i != (MQArrayD.length - 1)) {
				System.out.print(",");
			}
		}

		//ここに配列Dの要素をすべて出力する処理を記述する。

		//ここに配列Eの要素をすべて出力する処理を記述する。
		System.out.print("\n\nE...");
		for (int i = 0; i < MQArrayE.length; i++) {
			System.out.print(MQArrayE[i]);
			if (i != (MQArrayE.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");
		for (int i = 0; i < MQArrayC.length - 1; i++) {
			for (int j = i + 1; j < MQArrayC.length; j++) {
				if (MQArrayC[i] < MQArrayC[j]) {
					int temp = MQArrayC[i];
					MQArrayC[i] = MQArrayC[j];
					MQArrayC[j] = temp;
				}
			}
		}
		for (int i = 0; i < MQArrayC.length; i++) {
			System.out.print(MQArrayC[i]);
			if (i != (MQArrayC.length - 1)) {
				System.out.print(",");
			}
		}

		//ここに配列Cの要素をすべて出力する処理を記述する。

		System.out.print("\n\nD...");
		for (int i = 0; i < MQArrayD.length - 1; i++) {
			for (int j = i + 1; j < MQArrayD.length; j++) {
				if (MQArrayD[i] < MQArrayD[j]) {
					int temp = MQArrayD[i];
					MQArrayD[i] = MQArrayD[j];
					MQArrayD[j] = temp;
				}
			}
		}
		for (int i = 0; i < MQArrayD.length; i++) {
			System.out.print(MQArrayD[i]);
			if (i != (MQArrayD.length - 1)) {
				System.out.print(",");
			}
		}

		//ここに配列Dの要素をすべて出力する処理を記述する。

		System.out.print("\n\nE...");
		for (int i = 0; i < MQArrayE.length - 1; i++) {
			for (int j = i + 1; j < MQArrayE.length; j++) {
				if (MQArrayE[i] < MQArrayE[j]) {
					int temp = MQArrayE[i];
					MQArrayE[i] = MQArrayE[j];
					MQArrayE[j] = temp;
				}
			}
		}
		for (int i = 0; i < MQArrayE.length; i++) {
			System.out.print(MQArrayE[i]);
			if (i != (MQArrayE.length - 1)) {
				System.out.print(",");
			}
		}

		//ここに配列Eの要素をすべて出力する処理を記述する。

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
