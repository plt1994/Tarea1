package heartstone_cc3002_plt;

public class Shaman extends AbstractCard{
	public Shaman(double lp, double ad){
		super("Paladin",lp,0,ad);
	}
	public Shaman(double lp,double adamaged, double ad){
		super("Paladin",lp,adamaged,ad);
	}
	public Shaman(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
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
