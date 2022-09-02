package logic;

public class UnitCard {
	private String name;
	private int bloodCost;
	private int power;
	private int health;
	private String flavorText;
	
	public UnitCard(String name, int bloodCost, int power, int health, String flavorText){
		
	}
	
	public void setname(String name) {
		if(name.isBlank()) {
			this.name=name;
		}
		else {
			this.name="Creature";
		}
	}
	public void setPower(int power) {
		if(power<0) {
			this.power=0;
		}
		else {
			this.power=power;
		}
	}
	public int getPower() {
		return this.power;
	}
	public String getName() {
		return this.name;
	}
	public void setBloodCost(int bloodCost) {
		if(bloodCost >=0) {
			this.bloodCost=bloodCost;
		}
		else {
			this.bloodCost=0;
		}
	}
	public int getBloodCost() {
		return this.bloodCost;
	}
	public void setHealth(int health) {
		if(health <1) {
			this.health=1;
		}
		else {
			this.health=health;
		}
	}
	public void setFlavorText(String flavorText) {
		this.flavorText=flavorText;
	}
	public String getFlavorText() {
		return this.flavorText;
	}
	public int getHealth() {
		return this.health;
	}
	public boolean equals(UnitCard other) {
		return this.name==other.name;
	}
	public String toString() {
		return this.getName() + " (POW: " + this.getPower() + ", HP: " + this.getHealth() + ")";
	}
}
