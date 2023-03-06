package bar;

public class Bill {
	private char gender;
	private int beer;
	private int barbecue;
	private int softDrink;

	public double cover() {
		if (feeding() > 30) {
			return 0.00;
		} else {
			return 4.00;
		}
	}

	public double total() {
		return feeding() + ticket() + cover();
	}

	public double ticket() {
		if (gender == 'M') {
			return 10.00;
		} else {
			return 8.00;
		}
	}

	public double feeding() {
		return beer * 5.00 + softDrink * 3.00 + barbecue * 7.00;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = Character.toUpperCase(gender);
	}

	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}

	public int getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(int softDrink) {
		this.softDrink = softDrink;
	}

	@Override
	public String toString() {
		return "Bill [gender=" + gender + ", beer=" + beer + ", barbecue=" + barbecue + ", softDrink=" + softDrink
				+ "]";
	}
}
