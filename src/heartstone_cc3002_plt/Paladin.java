package heartstone_cc3002_plt;
/**
 * Represents a Paladin card
 * @author plt1994
 *
 */
public class Paladin extends AbstractCard{
	/**
	 * Constructor for Paladin
	 * @param aname card's name
	 * @param lp card's life points
	 * @param adamaged card's damage received 
	 * @param ad card's attack damage
	 */
	public Paladin(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}
	public Paladin(double lp, double ad){
		super("Paladin",lp,0,ad);
	}
	public Paladin(double lp,double adamaged, double ad){
		super("Paladin",lp,adamaged,ad);
	}
	
	@Override
	public void attack(ICard card) {
		if(card.isAlive() && this.isAlive()){
			card.attackPaladin(this);
		}
		
	}
	@Override
	public void attackKnight(Knight knight) {
		super.damaged=this.getDR()+0.5*knight.getAD();
		
	}
	@Override
	public void attackMage(Mage mage) {
		super.damaged=this.getDR()+2*mage.getAD();
		
	}
}
