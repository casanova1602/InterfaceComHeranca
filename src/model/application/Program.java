package model.application;

import model.entities.ComboDevices;
import model.entities.ConcretePrinter;
import model.entities.ConcreteScanner;
import model.entities.Device;

public class Program {
	public static void main(String[] args) {
		
		ConcreteScanner s = new ConcreteScanner("22222");
		System.out.println("S/N: " + s.getSerialNumber());
		s.processDoc("Medical docs");
		System.out.println(s.scan());
		
		System.out.println();
		ConcretePrinter p = new ConcretePrinter("3456");
		System.out.println("S/N: " + p.getSerialNumber());
		p.processDoc("My email");
		p.print("My Id");
		
		System.out.println();
		ComboDevices cb = new ComboDevices("9867559");
		System.out.println("S/N: " + cb.getSerialNumber());
		cb.print("Mortal Kombat");
		System.out.println(cb.scan());
		cb.processDoc("My portuguese docs");
		
	}
}
