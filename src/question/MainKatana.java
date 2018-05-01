package question;

import java.util.ArrayList;

public class MainKatana {
	public static void main(String[] args) {
		ArrayList<Katana> toukenn = new ArrayList<>();
		toukenn.add(new Katana("大包平", "太刀", "オオカネヒラ"));
		toukenn.add(new Katana("鬼切丸", "太刀", "オニキリマル"));
		toukenn.add(new Katana("和泉守兼定", "打刀", "イズミノカミカネサダ"));
		for(int i = 0; i < toukenn.size(); i++) {
			toukenn.get(i).show();
		}
	}
}

class Katana{
	String name;
	String type;
	String kana;
	Katana(String n, String t,String k){
		name = n;
		type = t;
		kana = k;
	}
	void show(){
		System.out.println("名前 : " + name + "種類 : " + type + "読み仮名 : " + kana);
	}
}
