public class Book {

    private String title;
    private float price;
    private String ISBN;
    private int numberOfPages;

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle()
    {
        return title;
    }

    public float getPrice()
    {
        return price;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public String toString()
    {
        return "Title: " + getTitle() +
                "\nPrice: " + getPrice() +
                "\nISBN: " + getISBN() +
                "\nNumber of pages: " + getNumberOfPages();
    }

    public Book()
    {
        this.title = "No Title";
        this.price = 0.00f;
        this.ISBN = "No ISBN";
        this.numberOfPages = 0;
    }

    public Book(String title, float price, String ISBN, int numberOfPages)
    {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setNumberOfPages(numberOfPages);
    }
}
