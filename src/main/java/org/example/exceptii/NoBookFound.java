package org.example.exceptii;
public class NoBookFound extends Exception{
    private String search;

    public NoBookFound(String search){
        super("Nu a fost gasita cartea cu titlul respectiv!");
        this.search = search;
    }
}
