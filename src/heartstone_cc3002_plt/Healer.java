package heartstone_cc3002_plt;

public class Healer extends AbstractCard{
	public Healer(double lp, double ad){
		super("Healer",lp,0,ad);
	}
	public Healer(double lp,double adamaged, double ad){
		super("Healer",lp,adamaged,ad);
	}
	public Healer(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
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
