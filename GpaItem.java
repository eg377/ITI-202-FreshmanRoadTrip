
public class GpaItem extends BackpackItem {
	
	private double gpaEffect;

	public GpaItem(String itemName, double gpaEffect, String effectDescription) {
		super.setItemName(itemName);
		this.setGpaEffect(gpaEffect);
		super.setEffectDescription(effectDescription);
	}
	
	public double getGpaEffect() {
		return gpaEffect;
	}

	public void setGpaEffect(double gpaEffect) {
		this.gpaEffect = gpaEffect;
	}
	
	public String toString() {
		return getItemName();
	}
}
