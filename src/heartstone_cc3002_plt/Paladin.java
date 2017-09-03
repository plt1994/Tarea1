package heartstone_cc3002_plt;

public class Paladin extends AbstractCard{
	public Paladin(double lp, double ad){
		super("Paladin",lp,0,ad);
	}
	public Paladin(double lp,double adamaged, double ad){
		super("Paladin",lp,adamaged,ad);
	}
	public Paladin(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}
	@Override
	public void attack(ICard card) {
		card.attackPaladin(this);
		
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
