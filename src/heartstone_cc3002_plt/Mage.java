package heartstone_cc3002_plt;
/**
 * Represents a Mage card
 * @author plt1994
 *
 */
public class Mage extends AbstractCard{
	/**
	 * Constructor for Mage
	 * @param aname card's name
	 * @param lp card's life points
	 * @param adamaged card's damage received 
	 * @param ad card's attack damage
	 */
	public Mage(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}
	public Mage(double lp, double ad){
		super("Mage",lp,0,ad);
	}
	public Mage(double lp,double adamaged, double ad){
		super("Mage",lp,adamaged,ad);
	}
	
	@Override
	public void attack(ICard card) {
		card.attackMage(this);
	}
	@Override
	public void attackAssassin(Assassin assassin) {
		super.damaged=this.getDR()+2*assassin.getAD();
		
	}
	@Override
	public void attackWarlock(Warlock warlock) {
		super.damaged=this.getDR()+0.5*warlock.getAD();
		
	}
}
