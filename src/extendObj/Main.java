package extendObj;

import prodocts.ComputerProduct;
import prodocts.PhoneProduct;

import prodocts.PrinterProduct;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product();
		product1.setCaption("Lenovo  Ideapad");
		product1.setPrice(14250);
		product1.setDiscoundRate(14);
		System.out.println(product1.getCaption());
		System.out.println(product1.getPrice());

		ComputerProduct computer1 = new ComputerProduct();
		computer1.setCaption("Lenovo loga2");
		computer1.setPrice(18000);
		computer1.setDiscoundRate(10);
		computer1.setGraphicCardMemory(1024);
		computer1.setProcesser("Intel I7 9. Nesil");
		computer1.setTouchScreen(true);
		System.out.println(computer1.getCaption());
		System.out.println(computer1.getPrice());

		PhoneProduct phone1 = new phoneProduct();
		phone1.setCaption("Oppo Reno");
		phone1.setPrice(3478);
		phone1.setDiscoundRate(12);
		phone1.setBatteryPower(5000);
		phone1.setCameraRezolution("48mp  + 12mp");
		phone1.setMemorySize(64000);
		phone1.setRamCapacity(6000);
		phone1.setScreenSize(6.3);
		phone1.setSelfieCameraRezoltion(8000);
		phone1.showPhone();

		// wifi waight a3 colorScan PrinterType
		PrinterProduct printer1 = new PrinterProduct();
		printer1.setCaption("Epson Ecotank");
		printer1.setPrice(2240.82);
		printer1.setDiscoundRate(15);
		printer1.setWifi(true);
		printer1.setWeight(4.3);
		printer1.setA3(false);
		printer1.setColorScan(true);
		printer1.setPrinterType("�ok Fonksiyonlu");
		printer1.showPrinter();
	}

}
