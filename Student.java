package org.example.task1;

public class Student implements Printable {
    private String name;
    private int number;
    private double note;

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setNote(double note){
        this.note = note;
    }

    public String getName(String name){
        return this.name;
    }

    public int getNumber(int number){
        return this.number;
    }

    public double getNote(double note) {
        return this.note;
    }

    @Override
    public void print() {
        System.out.print(this.name);
    }
}
