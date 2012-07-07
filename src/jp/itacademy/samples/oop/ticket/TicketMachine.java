package jp.itacademy.samples.oop.ticket;
/**
 * 券売機を表すクラスです。お金を投入してチケットを購入することができます。
 * 購入したチケットは<code>Ticket</code>クラスのオブジェクトとして
 * 取得できます。
 * 
 * @author okada
 * @version 1.0
 *
 */
public class TicketMachine {

	private static int nextSerial = 1;

	private static int getNextSerial() {
		return nextSerial++;
	}

	private String ticketName;
	private int price;
	private int amount;

	public TicketMachine(String ticketName, int price) {
		this.ticketName = ticketName;
		this.price = price;
	}
	
	/**
	 * お金を投入します。投入したお金は券売機の中に蓄積されます。
	 * 
	 * @param money　投入する金額
	 */

	public void putMoney(int money) {
		this.amount += money;
	}

	public int getAmount() {
		return amount;
	}

	public int getChange() {
		int change = amount;
		amount = 0;
		return change;
	}

	public Ticket getTicket() {
		if (amount < price) {
			return null;
		}
		amount -= price;
		return new Ticket(getNextSerial(), ticketName);

	}
}
