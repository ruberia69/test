package chap10ex;

// 魔法使いクラス

public class Wizard {

	// フィールド
	 private int hp;
	 private int mp;
	 private String name;
	 Wand wand;

	// 魔法の杖で体力回復メソッド
	public void heal(Hero h) {
		int basePoint = 10; // 基本回復ポイント
		int recovPoint = (int) (basePoint * this.getWand().getPower()); // 杖による増幅
		//h.setHp(h.getHp() + recovPoint); // 勇者のHPを回復させる
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した!");
	}
	//アクセッサメソット

	public int getHp() {
		return this.hp;
	}



	public void setHp(int hp) {

		if (hp < 0) {
			this.hp = 0;
		} else {this.hp = hp;

		}
	}

	public void setMp(int mp) {
		this.mp = mp;
		if (mp<0  ) {
			throw new IllegalArgumentException("設定されようとしているMPが異常です");
			}

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if ( name == null ||name.length()<3  ) {
			throw new IllegalArgumentException("魔法使いに設定されようとしている名前が異常です");
			}

		this.name = name;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		if (wand == null     ) {
			throw new IllegalArgumentException("設定されようとしている杖がnullです");
			}


		this.wand = wand;
	}

	public int getMp() {
		return mp;
	}

}