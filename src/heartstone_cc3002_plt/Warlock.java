package heartstone_cc3002_plt;

public class Warlock extends AbstractCard{
	public Warlock(double lp, double ad){
		super("Warlock",lp,0,ad);
	}
	public Warlock(double lp,double adamaged, double ad){
		super("Warlock",lp,adamaged,ad);
	}
	public Warlock(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}

	@Override
	public void attack(ICard card) {
		card.attackWarlock(this);
		
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
