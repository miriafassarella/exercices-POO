package com.interfaces;

import com.interfaces.cashier.Buy;
import com.interfaces.cashier.Checkout;
import com.interfaces.imprimer.Printer;
import com.interfaces.imprimer.printers.PrinterEpson;
import com.interfaces.imprimer.printers.PrinterHP;
import com.interfaces.payment.operators.RedeCard;
import com.interfaces.payment.Card;
import com.interfaces.payment.Operator;
import com.interfaces.payment.operators.Cielo;

public class Main {
	
	public static void main(String[] args) {
		
		Operator operator = new RedeCard();
		Printer printer = new PrinterHP();
		
		
		Card card = new Card();
		card.setHolderName("Miria Fassarella");
		card.setCardNumber("456");
		
		Buy buy = new Buy();
		buy.setClientName("Miria Fassarella Braga");
		buy.setProduct("Soap");
		buy.setTotalValue(150);
		
		Checkout checkout = new Checkout(operator, printer);
		checkout.buyClose(buy, card);
		
	}

}
