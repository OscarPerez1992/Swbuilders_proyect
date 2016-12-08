public class Sanction {
	private Object _id;
	private Object _amount;
	private Object _points;
	private Object _dateOfReception;
	private Object _dateOfPayment;
	private Object _sanctionHolder;
	public Inquiry _...;

	public void getId() {
		return this._id;
	}

	public void setId(Object aId) {
		this._id = aId;
	}

	public void getAmount() {
		return this._amount;
	}

	public void setAmount(Object aAmount) {
		this._amount = aAmount;
	}

	public void getPoints() {
		return this._points;
	}

	public void setPoints(Object aPoints) {
		this._points = aPoints;
	}

	public void getDateOfReception() {
		return this._dateOfReception;
	}

	public void setDateOfReception(Object aDateOfReception) {
		this._dateOfReception = aDateOfReception;
	}

	public void getDateOfPayment() {
		return this._dateOfPayment;
	}

	public void setDateOfPayment(Object aDateOfPayment) {
		this._dateOfPayment = aDateOfPayment;
	}

	public void getSanctionHolder() {
		return this._sanctionHolder;
	}

	public void setSanctionHolder(Object aSanctionHolder) {
		this._sanctionHolder = aSanctionHolder;
	}
}