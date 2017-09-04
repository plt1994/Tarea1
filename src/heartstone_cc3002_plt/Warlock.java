package heartstone_cc3002_plt;
/**
 * Represents a Warlock card
 * @author plt1994
 *
 */
public class Warlock extends AbstractCard{
	/**
	 * Constructor for Shaman
	 * @param aname card's name
	 * @param lp card's life points
	 * @param adamaged card's damage received 
	 * @param ad card's attack damage
	 */
	public Warlock(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}
	public Warlock(double lp, double ad){
		super("Warlock",lp,0,ad);
	}
	public Warlock(double lp,double adamaged, double ad){
		super("Warlock",lp,adamaged,ad);
	}
	

	@Override
	public void attack(ICard card) {
		if(card.isAlive() && this.isAlive()){
			card.attackWarlock(this);
		}
		
		
	}
	@Override
	public void attackHealer(Healer healer) {
		this.damaged=this.getDR()+healer.getAD();
		
	}
	@Override
	public void attackShaman(Shaman shaman) {
		this.attackDamage=this.attackDamage-shaman.getAD()*2/3;
		this.damaged=this.getDR()+shaman.getAD()*2/3;
	}

}
