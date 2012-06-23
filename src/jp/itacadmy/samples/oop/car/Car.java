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
		return 20; //�R��P���b�g�������艽km����邩
	}
	
	protected char getWheelRuts() {
		return ':'; //�^�C���̐�
	}
}
