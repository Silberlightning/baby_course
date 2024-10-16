package org.example.task1;

public class Book implements Displayable {
    private String name;
    private String author;
    private int year;
    
    public void setBook (String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    
    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public void print(){
        System.out.print(this.name);
    }
}
