package heartstone_cc3002_plt;

public class Hunter extends AbstractCard{
	public Hunter(double lp, double ad){
		super("Hunter",lp,0,ad);
	}
	public Hunter(double lp,double adamaged, double ad){
		super("Hunter",lp,adamaged,ad);
	}
	public Hunter(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
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
