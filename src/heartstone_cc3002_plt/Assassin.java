package heartstone_cc3002_plt;
/**
 * Represents an Assassin card
 * @author plt1994
 *
 */
public class Assassin extends AbstractCard{
	/**
	 * Constructor for Assassin
	 * @param aname card's name
	 * @param lp card's life points
	 * @param adamaged card's damage received 
	 * @param ad card's attack damage
	 */
	public Assassin(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}
	public Assassin(double lp, double ad){
		super("Assassin",lp,0,ad);
	}
	public Assassin(double lp,double adamaged, double ad){
		super("Assassin",lp,adamaged,ad);
	}
	

	@Override
	public void attack(ICard card) {
		card.attackAssassin(this);	
	}

	@Override
	public void attackDruid(Druid druid) {
		this.attackDamage=this.attackDamage+0.5*druid.getAD();		
	}
	
	@Override
	public void attackWarlock(Warlock warlock) {
		super.damaged=this.getDR()+2*warlock.getAD();
		
	}


}
