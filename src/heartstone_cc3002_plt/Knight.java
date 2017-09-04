package heartstone_cc3002_plt;
/**
 * Represents a Knight card
 * @author plt1994
 *
 */
public class Knight extends AbstractCard{
	/**
	 * Constructor for Knight
	 * @param aname card's name
	 * @param lp card's life points
	 * @param adamaged card's damage received 
	 * @param ad card's attack damage
	 */
	public Knight(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}
	public Knight(double lp, double ad){
		super("Knight",lp,0,ad);
	}
	public Knight(double lp,double adamaged, double ad){
		super("Knight",lp,adamaged,ad);
	}
	


	@Override
	public void attack(ICard card) {
		if(card.isAlive() && this.isAlive()){
			card.attackKnight(this);
		}
	}
	@Override
	public void attackAssassin(Assassin assassin) {
		super.damaged=this.getDR()+0.5*assassin.getAD();
		
	}
	@Override
	public void attackHunter(Hunter hunter) {
		super.damaged=this.getDR()+2*hunter.getAD();
		
	}
}
