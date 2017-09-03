package heartstone_cc3002_plt;
/**
 * Represents a Shaman card
 * @author plt1994
 *
 */
public class Shaman extends AbstractCard{
	/**
	 * Constructor for Shaman
	 * @param aname card's name
	 * @param lp card's life points
	 * @param adamaged card's damage received 
	 * @param ad card's attack damage
	 */
	public Shaman(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}
	public Shaman(double lp, double ad){
		super("Shaman",lp,0,ad);
	}
	public Shaman(double lp,double adamaged, double ad){
		super("Shaman",lp,adamaged,ad);
	}
	
	@Override
	public void attack(ICard card) {
		card.attackShaman(this);
		
	}
	@Override
	public void attackHunter(Hunter hunter) {
		super.damaged=this.getDR()+2*hunter.getAD();
		
	}
}
