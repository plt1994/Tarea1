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
