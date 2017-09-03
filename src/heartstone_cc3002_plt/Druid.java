package heartstone_cc3002_plt;
/**
 * Represents a Druid card
 * @author plt1994
 *
 */
public class Druid extends AbstractCard{
	/**
	 * Constructor for Druid
	 * @param aname card's name
	 * @param lp card's life points
	 * @param adamaged card's damage received 
	 * @param ad card's attack damage
	 */
	public Druid(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}
	public Druid(double lp, double ad){
		super("Druid",lp,0,ad);
	}
	public Druid(double lp,double adamaged, double ad){
		super("Druid",lp,adamaged,ad);
	}
	


	@Override
	public void attack(ICard card) {
		card.attackDruid(this);
	}

	@Override
	public void attackPaladin(Paladin paladin) {
		this.attackDamage=this.attackDamage+paladin.getAD()*2/3;
		this.damaged=this.getDR()-paladin.getAD()*2/3;
		
	}

	@Override
	public void attackShaman(Shaman shaman) {
		this.attackDamage=this.attackDamage-shaman.getAD()*2/3;
		this.damaged=this.getDR()+shaman.getAD()*2/3;
	}
	
}
