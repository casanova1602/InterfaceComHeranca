package model.entities;

import model.services.Printer;
import model.services.Scanner;

public class ComboDevices extends Device implements Scanner, Printer{

	public ComboDevices(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Port 1 ## PRINTING:  " + doc);
	}

	@Override
	public String scan() {
		return "Port 2 ## SCANNING ..... done";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Port 1 Printer PROCESSING:  " + doc);
		System.out.println("Port 2 Scanner Processing  " + doc);
	}

}
