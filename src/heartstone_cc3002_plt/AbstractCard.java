package heartstone_cc3002_plt;

public abstract class AbstractCard implements ICard{
	private String name;
	private double lifePoints;
	private double damaged;
	private double attackDamage;
	/**
	 * 
	 * @param aname Card's name
	 * @param lp Card's life points
	 * @param adamaged Card's damage received
	 * @param ad Card's attack damage
	 */
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
}
