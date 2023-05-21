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

        return book;
    }

}