package heartstone_cc3002_plt;

public class Assassin extends AbstractCard{
	public Assassin(double lp, double ad){
		super("Assassin",lp,0,ad);
	}
	public Assassin(double lp,double adamaged, double ad){
		super("Assassin",lp,adamaged,ad);
	}
	public Assassin(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}

	@Override
	public void attack(ICard card) {
		card.attackAssassin(this);	
	}

	@Override
	public void attackDruid(Druid druid) {
		this.attackDamage=this.attackDamage+0.5*druid.getAD();		
	}
	/**
	 * Warlock hurts double to Assassin
	 */
	@Override
	public void attackWarlock(Warlock warlock) {
		super.damaged=this.getDR()+2*warlock.getAD();
		
	}


}
