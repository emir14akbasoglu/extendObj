package prodocts;

import extendObj.Product;

public class PhoneProduct extends Product {
	private int batteryPower;
	private String cameraRezolution;
	private double selfieCameraRezoltion;
	private int memorySize;
	private double screenSize;
	private int ramCapacity;

	public PhoneProduct() {
		super();
	}

	public PhoneProduct(int batteryPower, String cameraRezolution, double selfieCameraRezoltion, int memorySize,
			double screenSize, int ramCapacity) {
		super();
		this.batteryPower = batteryPower;
		this.cameraRezolution = cameraRezolution;
		this.selfieCameraRezoltion = selfieCameraRezoltion;
		this.memorySize = memorySize;
		this.screenSize = screenSize;
		this.ramCapacity = ramCapacity;
	}

	public void setBatteryPower(int batteryPower) {
		this.batteryPower = batteryPower;
	}

	public String getCameraRezolution() {
		return cameraRezolution;
	}

	public void setCameraRezolution(String cameraRezolution) {
		this.cameraRezolution = cameraRezolution;
	}

	public double getSelfieCameraRezoltion() {
		return selfieCameraRezoltion;
	}

	public void setSelfieCameraRezoltion(double selfieCameraRezoltion) {
		this.selfieCameraRezoltion = selfieCameraRezoltion;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getRamCapacity() {
		return ramCapacity;
	}

	public void setRamCapacity(int ramCapacity) {
		this.ramCapacity = ramCapacity;
	}

	public int getBatteryPower() {
		return batteryPower;

	}

public String writeMemeryCapacity() {
   if(this.getMemorySize()>1000000) {
		return this.getMemorySize() / 1000000 + "TeraByte";
	   }
   else if (this.getMemorySize()>1000)  {
	   return (this.getMemorySize()/1000)+"GigaByte";
	   
   }
   else
	     return this.getMemorySize()+"MegaByte";
   }
   public void showPhone()  {
	   System.out.println("Telefon Modeli :"+this.getCaption());
	   System.out.println("      Fiyat    :"+this.getPrice());
   }
}


