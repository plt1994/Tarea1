package heartstone_cc3002_plt;

public class Druid extends AbstractCard{

	public Druid(double lp, double ad){
		super("Druid",lp,0,ad);
	}
	public Druid(double lp,double adamaged, double ad){
		super("Druid",lp,adamaged,ad);
	}
	public Druid(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
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
