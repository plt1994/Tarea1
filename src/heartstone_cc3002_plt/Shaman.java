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
	public void attackAssassin(Assassin assassin) {
		super.damaged=this.getDR()+assassin.getAD();
		
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
		super.damaged=this.getDR()+2*hunter.getAD();
		
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
		// TODO Auto-generated method stub
		
	}
}
