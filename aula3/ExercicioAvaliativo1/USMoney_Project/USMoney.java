package aula3.ExercicioAvaliativo1.USMoney_Project;

public class USMoney {
	private int dollar;
	private int cents;
	 
	public USMoney() {
		dollar = 0;
		cents = 0;
	}
	
	public USMoney(int dollar) {
		if(dollar < 0) {
			this.dollar = 0;
			this.cents = 0;
		}else {
			this.dollar = dollar;
			this.cents = 0;
		}
	}
	
	public USMoney(int dollar, int cents) {
		if(dollar <= 0 || cents <= 0) {
			this.dollar = 0;
			this.cents = 0;
		}else {
			this.dollar = dollar;
			this.cents = cents;
		}
		simplifica();
	}
	
	private void simplifica() {
		int esquerda;
		esquerda = cents / 100;
		cents = cents % 100;
		dollar += esquerda;
	}
	
	public String toString() {
		String txt;
		txt = "U$ " + dollar + ".";
		if(cents < 10)
			txt += "0";
		txt += cents;
		return txt;
	}
	
	public USMoney plus(USMoney money) {
		USMoney novo = new USMoney(getDollar() + money.getDollar(), getCents() + money.getCents());
		return novo;
	}

	public int getDollar() {
		return dollar;
	}

	public void setDollar(int dollar) {
		this.dollar = dollar;
	}

	public int getCents() {
		return cents;
	}

	public void setCents(int cents) {
		this.cents = cents;
		simplifica();
	}
}
