package com.interfaces.imprimer.printers;

import com.interfaces.imprimer.Printable;
import com.interfaces.imprimer.Printer;

public class PrinterHP implements Printer {

	@Override
	public void printOut(Printable printable) {
		System.out.println("=======================================");
		System.out.println(printable.getPageHeader());
		System.out.println("=======================================");
		System.out.println(printable.getBodyPage());
		System.out.println("........................................");
		System.out.println("==              HP                    ==");
		System.out.println("........................................");

	}

}
