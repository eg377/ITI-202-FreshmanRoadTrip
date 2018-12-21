
public class BackpackItem {
	
	private String itemName;
	private int energyEffect;
	private double gpaEffect;
	private String effectDescription;
	
	public BackpackItem() {
		this.itemName = "???"; // default name
		this.energyEffect = 0;
		this.gpaEffect = 0.0;
		this.effectDescription = "default description";
				
	} // Base class. Every backpackItem will have an itemName, energyEffect, gpaEffect, and effectDescription.
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public int getEnergyEffect() {
		return energyEffect;
	}
	
	public void setEnergyEffect(int energyEffect) {
		this.energyEffect = energyEffect;
	}
	
	public double getGpaEffect() {
		return gpaEffect;
	}
	
	public void setGpaEffect(double gpaEffect) {
		this.gpaEffect = gpaEffect;
	}
	
	public String getEffectDescription() {
		return effectDescription;
	}
	
	public void setEffectDescription(String effectDescription) {
		this.effectDescription = effectDescription;
	}
}
