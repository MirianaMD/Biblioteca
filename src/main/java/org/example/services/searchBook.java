package org.example.services;

public class searchBook {

    public static Books searchBook (String title, String author, String tableName) throws NoBookFound {
        ArrayList<Books> result= new ArrayList<Carte>();

        if (!result.next())
            throw new NoBookFound(title);

        Books book = new Books();
        book.setTitle(result.getString("title"));
        book.setAuthor(result.getString("author"));
        book.setPrice(result.getInt("price"));

        if(result.getInt("availability") == 1)
            book.setAvailability("Available");
        else
            book.setAvailability("NOT available");

        book.setStock(result.getInt("stock"));
        book.setForRent(result.getInt("for_rent"));
        book.setForBuy(result.getInt("for_buy"));

        return book;
    }

}