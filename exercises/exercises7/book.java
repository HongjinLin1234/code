package exercises7;

public class book {
    private String name;
    private int pages;
    private String writers;
    private double price;
    private double priceonepage;
	public book(String name, int pages, String writers, double price) {
		this.name = name;
		this.pages = pages;
		this.writers = writers;
		this.price = price;
		this.priceonepage=0;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setWriters(String writers) {
		this.writers = writers;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public int getPages() {
		return pages;
	}
	public String getWriters() {
		return writers;
	}
	public double getPrice() {
		return price;
	}
	public void priceonepage(){
		priceonepage=price/(double)pages;
	}
	
    
}
