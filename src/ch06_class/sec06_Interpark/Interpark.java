package ch06_class.sec06_Interpark;

public class Interpark {
	public int rank;
	public String title;
	public String author;
	public String translator;
	public String company;
	public String price;
	
	

	public Interpark(int rank, String title, String author, String translator, String company, String price) {

		this.rank = rank;
		this.title = title;
		this.author = author;
		this.translator = translator;
		this.company = company;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Interpark Best Seller rank " + rank + ": " + title + "(" + author + "/" + translator
				+ "/" + company + ") ▶ " + price + "￦";
	}
		

}
