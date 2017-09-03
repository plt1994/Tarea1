package heartstone_cc3002_plt;
/**
 * Represents a Hunter card
 * @author plt1994
 *
 */
public class Hunter extends AbstractCard{
	/**
	 * Constructor for Hunter
	 * @param aname card's name
	 * @param lp card's life points
	 * @param adamaged card's damage received 
	 * @param ad card's attack damage
	 */
	public Hunter(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}
	public Hunter(double lp, double ad){
		super("Hunter",lp,0,ad);
	}
	public Hunter(double lp,double adamaged, double ad){
		super("Hunter",lp,adamaged,ad);
	}
	


	@Override
	public void attack(ICard card) {
		card.attackHunter(this);
	}
	@Override
	public void attackDruid(Druid druid) {
		this.damaged=this.getDR()+0.5*druid.getAD();
		
	}
	@Override
	public void attackMage(Mage mage) {
		super.damaged=this.getDR()+2*mage.getAD();	
	}
}
