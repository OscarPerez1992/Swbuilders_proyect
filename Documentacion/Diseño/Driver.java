public class Driver extends SanctionHolder {
	private Object _points;

	public void getPoints() {
		return this._points;
	}

	public void setPoints(Object aPoints) {
		this._points = aPoints;
	}

	public Driver() {
		throw new UnsupportedOperationException();
	}
}