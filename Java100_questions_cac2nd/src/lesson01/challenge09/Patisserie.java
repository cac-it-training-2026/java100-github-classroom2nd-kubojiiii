/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより回転です！！");

		System.out.println("本日のおすすめ");
		System.out.println("シトロン　　　\\250");
		System.out.println("ショコラ　　　\\280");
		System.out.println("ピスターシュ　\\320");

		int num1 = 30;
		int num2 = 30;
		int num3 = 30;

		System.out.println("本日のおすすめ商品です\n");
		System.out.println("シトロン　　　\\250　・・・　残り" + num1 + "個");
		System.out.println("ショコラ　　　\\280　・・・　残り" + num2 + "個");
		System.out.println("ピスターシュ　\\320　・・・　残り" + num3 + "個");

		System.out.println("それぞれ何個ずつ買いますか？");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("シトロン　　　>");
		String str1 = reader.readLine();
		System.out.print("ショコラ　　　>");
		String str2 = reader.readLine();
		System.out.print("ピスターシュ　>");
		String str3 = reader.readLine();

		double sito = Double.parseDouble(str1);
		double syoko = Double.parseDouble(str2);
		double pisu = Double.parseDouble(str3);

		System.out.println("シトロン　　" + sito + "個");
		System.out.println("ショコラ　　" + syoko + "個");
		System.out.println("ピスターシャ " + pisu + "個");

		double sum0 = sito + syoko + pisu;
		int sum1 = (int) (sito * 250 + syoko * 280 + pisu * 320);

		System.out.println("合計個数" + sum0 + "個");
		System.out.println("合計金額" + sum1 + "円");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		num1 = (int) (num1 - sito);
		num2 = (int) (num2 - syoko);
		num3 = (int) (num3 - pisu);

		System.out.println("本日のおすすめ商品です\n");
		System.out.println("シトロン　　　\\250　・・・　残り" + num1 + "個");
		System.out.println("ショコラ　　　\\280　・・・　残り" + num2 + "個");
		System.out.println("ピスターシュ　\\320　・・・　残り" + num3 + "個");

		System.out.println("\n閉店のお時間となりました\nまたのお越しをお待ちしております。");
		System.out.println("\n売上の割合\n売上合計　　　" + sum1 + "円");

		System.out.println("\n内訳");
		System.out.println("シトロン　　　　\\" + (int) (sito * 250) + "・・・" + (int) ((sito * 250 / sum1) * 100) + "%");
		System.out.println("ショコラ　　　　\\" + (int) (syoko * 280) + "・・・" + (int) ((syoko * 280 / sum1) * 100) + "%");
		System.out.println("ピスターシャ　　\\" + (int) (pisu * 320) + "・・・" + (int) ((pisu * 320 / sum1) * 100) + "%");

	}

}
