
public class EnergyItem extends BackpackItem {
	
	private int energyEffect;
	
	public EnergyItem(String itemName, int energyEffect, String effectDescription) {
		super.setItemName(itemName);
		this.setEnergyEffect(energyEffect);
		super.setEffectDescription(effectDescription);
	}
	
	public int getEnergyEffect() {
		return energyEffect;
	}

	public void setEnergyEffect(int energyEffect) {
		this.energyEffect = energyEffect;
	}
	
	public String toString() {
		return getItemName();
	}
}