package com.interfaces.payment.operators;

import com.interfaces.payment.Authorization;
import com.interfaces.payment.Card;
import com.interfaces.payment.Operator;

public class Cielo implements Operator {

	@Override
	public boolean authorize(Authorization authorization, Card card) {
		
		return card.getCardNumber().startsWith("123") && authorization.getTotalValue() < 100;
	}

}
