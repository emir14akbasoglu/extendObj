package extendObj;

public class Product {
   private String  caption;
   private double price;
   private double discoundRate;
public String getCaption() {
	return caption;
}
public double getPrice() {
	return price*(100-this.discoundRate)/100;
}
public double getDiscoundRate() {
	return discoundRate;
}
public void setCaption(String caption) {
	this.caption = caption;
}
public void setPrice(double price) {
	this.price = price;
}
public void setDiscoundRate(double discoundRate) {
	this.discoundRate = discoundRate;
}
public Product() {
	super();
}
public Product(String caption, double price, double discoundRate) {
	super();
	this.caption = caption;
	this.price = price;
	this.discoundRate = discoundRate;
}
}
