package Dominio;

public class Driver extends SanctionHolder {
	private int points;

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int aPoints) {
		this.points = aPoints;
	}

	public Driver() {
		throw new UnsupportedOperationException();
	}
}