package com.interfaces.payment.operators;

import com.interfaces.payment.Authorization;
import com.interfaces.payment.Card;
import com.interfaces.payment.Operator;

public class RedeCard implements Operator {

	@Override
	public boolean authorize(Authorization authorization, Card card) {
		
		return card.getCardNumber().startsWith("456") && authorization.getTotalValue() < 200;
	}

}
