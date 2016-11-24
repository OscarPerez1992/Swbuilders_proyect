package es.uclm.esi.isoft2.SwBuilders.DGT;

public class Inquiry {
	private Object _id;
	private Object _dateOfIssue;
	private Object _location;
	private Object _owner;
	private Object _speed;
	private Object _maxSpeed;
	private Object _sanction;

	public Object getId()  {
		return this._id;
	}

	public void setId(Object aId) {
		this._id = aId;
	
	}

	public Object getDateOfIssue() {
		return this._dateOfIssue;
	}

	public void setDateOfIssue(Object aDateOfIssue) {
		this._dateOfIssue = aDateOfIssue;
	}

	public Object getLocation() {
		return this._location;
	}

	public void setLocation(Object aLocation) {
		this._location = aLocation;
	}

	public Object getOwner() {
		return this._owner;
	}

	public void setOwner(Object aOwner) {
		this._owner = aOwner;
	}

	public Object getSpeed() {
		return this._speed;
	}

	public void setSpeed(Object aSpeed) {
		this._speed = aSpeed;
	}

	public Object getMaxSpeed() {
		return this._maxSpeed;
	}

	public void setMaxSpeed(Object aMaxSpeed) {
		this._maxSpeed = aMaxSpeed;
	}

	public Object getSanction() {
		return this._sanction;
	}

	public void setSanction(Object aSanction) {
		this._sanction = aSanction;
	}
}