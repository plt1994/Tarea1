package heartstone_cc3002_plt;
/**
 * Represents an abstract card
 * @author plt1994
 *
 */
public abstract class AbstractCard implements ICard{
	private String name;
	private double lifePoints;
	protected double damaged;
	protected double attackDamage;
	
	/**
	 * Constructor for AbstractCard
	 * @param aname card's name
	 * @param lp card's life points
	 * @param adamaged card's damage received 
	 * @param ad card's attack damage
	 */
	public AbstractCard(String aname,double lp,double adamaged,double ad){
		name=aname;
		lifePoints=lp;
		damaged=adamaged;
		attackDamage=ad;
	}
	
	public AbstractCard(String aname,double lp,double ad){
		this(aname,lp,0,ad);
	}
	/**
	 *Returns the card's name
	 */
	public String getName(){
		return this.name;
	}
	/**
	 *return the card's life points
	 */
	public double getLP(){
		return this.lifePoints;
	}
	/**
	 *returns card's damage received
	 */
	public double getDR(){
		return this.damaged;
	}
	/**
	 *returns card's attack damage
	 */
	public double getAD(){
		return this.attackDamage;
	}
	/**
	 *returns true if a card is alive, if its dead it returns false
	 */
	public boolean isAlive(){
		return this.getLP()>this.getDR();
	}
	/**
	 *Allows a Card to attack another Card
	 */
	public abstract void attack(ICard card);
	/**
	 *Allows an Assassin to attack
	 */
	public void attackAssassin(Assassin assassin) {
		this.damaged=this.getDR()+assassin.getAD();
		
	}
	/**
	 * Allows a Warlock to attack
	 */
	public void attackWarlock(Warlock warlock) {
		this.damaged=this.getDR()+warlock.getAD();
		
	}
	/**
	 * Allows a Druid to attack
	 */
	public void attackDruid(Druid druid){
		this.attackDamage=this.attackDamage+druid.getAD();
		this.damaged=this.getDR()+0.5*druid.getAD();
	}
	/**
	 * Allows a Healer to attack/heal
	 */
	public void attackHealer(Healer healer){
		if(this.isAlive()){
			this.damaged=this.getDR()-0.5*healer.getAD();
		}		
	}
	/**
	 * Allows a Hunter to attack
	 */
	public void attackHunter(Hunter hunter){
		this.damaged=this.getDR()+hunter.getAD();
	}
	/**
	 * Allows a Knight to attack
	 */
	public void attackKnight(Knight knight){
		this.damaged=this.getDR()+knight.getAD();
	}
	/**
	 * Allows a Mage to attack
	 */
	public void attackMage(Mage mage){
		this.damaged=this.getDR()+mage.getAD();
	}
	/**
	 * Allows a Paladin to attack
	 */
	public void attackPaladin(Paladin paladin){
		this.attackDamage=this.attackDamage+paladin.getAD()/3;
		this.damaged=this.getDR()-paladin.getAD()/3;
	}
	/**
	 * Allows a Shaman to attack
	 */
	public void attackShaman(Shaman shaman){
		this.attackDamage=this.attackDamage-shaman.getAD()/3;
		this.damaged=this.getDR()+shaman.getAD()/3;
	}
}
