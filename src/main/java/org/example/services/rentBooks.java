package org.example.services;

public class rentBooks {

    public static void rentBook (String client, String title, String author, Integer period) throws NoBookFound {
        ArrayList<Books> result= new ArrayList<Carte>();

        if (!result.next())
            throw new NoBookFound(title);

        Books book = new Books();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPeriod(period);

        return book;
}
