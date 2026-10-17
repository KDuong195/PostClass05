package designbook.solutions4;

import designbook.chapter4.Deck;

class GameModel {

	private static final GameModel INSTANCE = new GameModel();

	private final Deck aDeck = new Deck();

	public static GameModel instance() {
		return INSTANCE;
	}

	private GameModel() {}

	public void newGame() {
		aDeck.shuffle();
	}
}

public class Exercise09 {

	public static void main(String[] args) {
		GameModel.instance().newGame();
		// ... Other operations on GameModel

		// --- Phần thực hành kiểm chứng ---
		GameModel a = GameModel.instance();
		GameModel b = GameModel.instance();
		System.out.println("a == b ? " + (a == b));

		// GameModel c = new GameModel(); // Lỗi biên dịch: constructor là private
	}
}
