class Author
{
	private String name;
	private String email;
	private char gender;
	Author()
	{
	}
	Author(String name, String email, char gender)
	{
		setName(name);
		setEmail(email);
		setGender(gender);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
}
class Book
{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	Book(String name,double price,int qtyInStock,String author_name,String email,char gender)
	{
		author =new Author(author_name,email,gender);
		setName(name);
		setPrice(price);
		setQuantity(qtyInStock);
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setQuantity(int qtyInStock)
	{
		this.qtyInStock=qtyInStock;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return qtyInStock;
	}
	public String display()
	{
		return "Book Name :"+getName()+"\nPrice :"+getPrice()+"\nQuantity In Stock :"+getQuantity()+"\nAuthor :"+author.getName()+"\nEmail :"+author.getEmail()+"\nGender :"+author.getGender();
	}
}
class Assignment1
{
	public static void main(String args[])
	{
		Book book=new Book("Java",5.9,50,"Bhabani","bsmeher000@gmail.com",'M');
		System.out.print(book.display());

	}
}