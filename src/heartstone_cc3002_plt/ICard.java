package heartstone_cc3002_plt;

public interface ICard {
	void play(ICard card);
	void attackAssasin(Assassin assassin);
	void attackDruid(Druid druid);
	void attackHealer(Healer healer);
	void attackHunter(Hunter hunter);
	void attackKnight(Knight knight);
	void attackMage(Mage mage);
	void attackPaladin(Paladin paladin);
	void attackShaman(Shaman shaman);
	void attackWarlock(Warlock warlock);
}
