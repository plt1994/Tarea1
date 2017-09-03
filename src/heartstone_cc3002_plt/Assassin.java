package heartstone_cc3002_plt;

public class Assassin extends AbstractCard{
	/**
	 * 
	 * @param aname 
	 * @param lp
	 * @param adamaged
	 * @param ad
	 */
	public Assassin(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}

	@Override
	public void attack(ICard card) {
		card.attackAssassin(this);
		
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
	/**
	 * Warlock hurts double to Assassin
	 */
	@Override
	public void attackWarlock(Warlock warlock) {
		super.damaged=this.getDR()+2*warlock.getAD();
		
	}


}
