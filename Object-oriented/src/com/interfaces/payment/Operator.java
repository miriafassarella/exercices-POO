package com.interfaces.payment;

public interface Operator {
	
	public boolean authorize(Authorization authorization, Card card);

}
