package heartstone_cc3002_plt;

public class Knight extends AbstractCard{
	public Knight(double lp, double ad){
		super("Knight",lp,0,ad);
	}
	public Knight(double lp,double adamaged, double ad){
		super("Knight",lp,adamaged,ad);
	}
	public Knight(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}


	@Override
	public void attack(ICard card) {
		card.attackKnight(this);
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
