package mmt.core;

public abstract class Category implements java.io.Serializable{

	protected double _discount;
	protected String _type;


	public Category ( double discount, String type) {
		_discount = discount;
		_type = type;
	}

	public String getCategory(){
		return _type;
	}



}