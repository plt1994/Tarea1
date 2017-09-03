package heartstone_cc3002_plt;

public class Mage extends AbstractCard{
	public Mage(double lp, double ad){
		super("Mage",lp,0,ad);
	}
	public Mage(double lp,double adamaged, double ad){
		super("Mage",lp,adamaged,ad);
	}
	public Mage(String aname, double lp, double adamaged, double ad) {
		super(aname, lp, adamaged, ad);
	}


	@Override
	public void attack(ICard card) {
		card.attackMage(this);
	}
	@Override
	public void attackAssassin(Assassin assassin) {
		super.damaged=this.getDR()+2*assassin.getAD();
		
	}
	@Override
	public void attackDruid(Druid druid) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attackHealer(Healer healer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attackHunter(Hunter hunter) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attackKnight(Knight knight) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attackMage(Mage mage) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attackPaladin(Paladin paladin) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attackShaman(Shaman shaman) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attackWarlock(Warlock warlock) {
		super.damaged=this.getDR()+0.5*warlock.getAD();
		
	}
}
