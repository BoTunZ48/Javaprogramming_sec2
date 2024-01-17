import java.time.Year;
public class Book {
	private String title;
	private float price;
	private int publishyer;


public void setTitle(String title) {
	this.title = title;
}
public String getTitle() {
	return this.title;
}
public void setPrice(float price) {
	this.price = price;
}
public float getPrice() {
	return this.price;
}
public void setPublishyer(int year) {
	this.publishyer = year;
}
public int getpublisheyer() {
	return this.publishyer;
}
public int getTotalyear() {
	return Year.now().getValue()-this.publishyer ;
}
public String toString() {
	return String.format("Title:"+publishyer+" published for "+getTotalyear()+" year ("+price+"baht)");
} 
}