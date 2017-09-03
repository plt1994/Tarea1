package heartstone_cc3002_plt;
/**
 * Represents a Healer card
 * @author plt1994
 *
 */
public class Healer extends AbstractCard{
	/**
	 * Constructor for Healer
	 * @param aname card's name
	 * @param lp card's life points
	 * @param adamaged card's damage received 
	 * @param ad card's attack damage
	 */
	public Healer(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}
	public Healer(double lp, double ad){
		super("Healer",lp,0,ad);
	}
	public Healer(double lp,double adamaged, double ad){
		super("Healer",lp,adamaged,ad);
	}
	
	@Override
	public void attack(ICard card) {
		card.attackHealer(this);
		
	}
	@Override
	public void attackAssassin(Assassin assassin) {
		super.damaged=this.getDR()+2*assassin.getAD();
		
	}
	@Override
	public void attackPaladin(Paladin paladin) {
		this.attackDamage=this.attackDamage+paladin.getAD()*2/3;
		this.damaged=this.getDR()-paladin.getAD()*2/3;
		
	}
	
}
