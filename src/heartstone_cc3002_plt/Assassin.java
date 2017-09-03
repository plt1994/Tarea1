package heartstone_cc3002_plt;

public class Assassin extends AbstractCard implements ICard{
	
	public Assassin(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}

	@Override
	public void attack(ICard card) {
		card.attackAssassin(this);
		
	}

	@Override
	public void attackAssassin(Assassin assassin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attackDruid(Druid druid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attackHealer(Healer healer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attackHunter(Hunter hunter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attackKnight(Knight knight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attackMage(Mage mage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attackPaladin(Paladin paladin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attackShaman(Shaman shaman) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attackWarlock(Warlock warlock) {
		// TODO Auto-generated method stub
		
	}

}
