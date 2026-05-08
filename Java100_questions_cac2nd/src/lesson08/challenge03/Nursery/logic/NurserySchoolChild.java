/**
 * 第8章 保育園のお仕事
 *
 * 問題1  ファイルの分割
 *
 * 保育士クラス（Nurse）と
 * 園児クラス（NurserySchoolChild）と
 * 保育園クラス（NurserySchool）を別のファイルに
 * 記述し直してください。
 *
 */

package lesson08.challenge03.Nursery.logic;

class NurserySchoolChild {

	private String name;

	public NurserySchoolChild(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void Play() {
		System.out.println("遊ぶよ～。");
	}

}
