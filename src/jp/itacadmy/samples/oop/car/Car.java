package jp.itacadmy.samples.oop.car;

public class Car {

	private int gas;
	
	public void addGas(int gas) {
		this.gas += gas;
	}
	
	public void drive() {
		int km = gas * getFuelCost();
		for (int i = 0; i < km; i++) {
			System.out.print(getWheelRuts());
		}
		System.out.println();
		gas = 0;
	}
	
	public int getFuelCost() {
		return 20; //”R”ï‚PƒŠƒbƒgƒ‹‚ ‚½‚è‰½km‘–‚ê‚é‚©
	}
	
	protected char getWheelRuts() {
		return ':'; //ƒ^ƒCƒ„‚ÌÕ
	}
}
