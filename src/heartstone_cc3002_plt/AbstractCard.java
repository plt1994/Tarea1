package heartstone_cc3002_plt;

public abstract class AbstractCard implements ICard{
	private String name;
	private double lifePoints;
	protected double damaged;
	private double attackDamage;
	
	public AbstractCard(String aname,double lp,double ad){
		this(aname,lp,0,ad);
	}
	public AbstractCard(String aname,double lp,double adamaged,double ad){
		name=aname;
		lifePoints=lp;
		damaged=adamaged;
		attackDamage=ad;
	}
	public String getName(){
		return this.name;
	}
	public double getLP(){
		return this.lifePoints;
	}
	public double getDR(){
		return this.damaged;
	}
	public double getAD(){
		return this.attackDamage;
	}
	public boolean isAlive(){
		return this.getLP()>this.getDR();
	}
	
	public void attackAssassin(Assassin assassin) {
		this.damaged=this.getDR()+assassin.getAD();
		
	}
	public void attackWarlock(Warlock warlock) {
		this.damaged=this.getDR()+warlock.getAD();
		
	}
	
	public void attackDruid(Druid druid){
		this.attackDamage=this.attackDamage+druid.getAD();
		this.damaged=this.getDR()+0.5*druid.getAD();
	}
	public void attackHealer(Healer healer){
		this.damaged=this.getDR()-0.5*healer.getAD();
	}
	public void attackHunter(Hunter hunter){
		this.damaged=this.getDR()+hunter.getAD();
	}
	public void attackKnight(Knight knight){
		this.damaged=this.getDR()+knight.getAD();
	}
	public void attackMage(Mage mage){
		this.damaged=this.getDR()+mage.getAD();
	}
	public void attackPaladin(Paladin paladin){
		this.attackDamage=this.attackDamage+paladin.getAD()/3;
		this.damaged=this.getDR()-paladin.getAD()/3;
	}
	public void attackShaman(Shaman shaman){
		this.attackDamage=this.attackDamage-shaman.getAD()/3;
		this.damaged=this.getDR()+shaman.getAD()/3;
	}
}
