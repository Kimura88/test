package question;

class Game{
	String name;
	String type;
	int sale;
	Game(String n, String t, int s){
		name = n;
		type = t;
		sale = s;
	}
	void show() {
		System.out.println("ゲーム名 : " + name + "ジャンル : " + type + "販売本数 : " + sale + "万");
	}
}


public class QustionGame {
	public static void main(String[] args) {
//		ArrayList<Game> games = new ArrayList<>();
//
//		games.add(new Game("スプラトゥーン2", "アクションシューティング", 712));
//		games.add(new Game("モンスターハンターワールド", "アクションロールプレイングゲーム",936 ));
//		games.add(new Game("ドラゴンクエストXI", "ロールプレイングゲーム", 317));
//

		Game[] games = {new Game("スプラトゥーン2", "アクションシューティング",712),
						new Game("モンスターハンターワールド","アクションシューティング",936),
						new Game("ドラゴンクエストXI","ロールプレイングゲーム",317)};

		//拡張for
		for(Game g : games) {
			g.show();
		}
		//通常for
//		for(int i = 0; i < games.length; i++) {
//			games.show();
//		}
	}
}
