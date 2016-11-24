package es.uclm.esi.isoft2.SwBuilders.DGT;

public class Vehicle {
	private Object _license;
	private Object _owner;

	public Vehicle() {
		throw new UnsupportedOperationException();
	
	}

	public Object getLicense() {
		return this._license;
	}

	public void setLicense(Object aLicense) {
		this._license = aLicense;
	}

	public Object getOwner() {
		return this._owner;
	}

	public void setOwner(Object aOwner) {
		this._owner = aOwner;
	}
}