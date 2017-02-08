package chap10;

public class Hero {

	// フィールド
	private int hp;
	private String name;
	private Sword sword;
	private static int money;

	// コンストラクタ
	Hero() {
		this("ダミー");
	}

	// コンストラクタ
	Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	// あばよメソッド
	void bye() {
		System.out.println("勇者は別れを告げた");
	}

	// おらあおっちぬぜメソッド
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}

	// 眠って体力回復メソッド
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	// いざ攻撃じゃーメソッド
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("お化けキノコ" + m.suffix + "に" + sword.getDamage() + "ポイントのダメージを与えた");
		m.hp -= sword.getDamage();

		if (m.hp <= 0) {
			System.out.println("お化けキノコ" + m.suffix + "を倒した！");
		} else {
			System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
			this.hp -= 2;
			if (this.hp <= 0) {
				this.die();
			}
		}
	}

	// お座りメソッド
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒すわった！");
		System.out.println("HPが" + sec + "ポイント回復した.");
	}

	// 滑るメソッド
	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
		if (this.hp <= 0) {
			die();
		}
	}

	// 逃げるメソッド
	void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

	// 所持金設定メソッド
	static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);

	}

	// アクセッサメソッド
	public String getName() {
		return this.name;

	}

	public void setName(String name) {
		this.name = name;
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");

		} else if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		} else if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getMoney() {
		return this.money;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public Sword getSword() {
		return sword;
	}
}
