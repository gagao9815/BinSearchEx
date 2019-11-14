/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingexercise;

/**
 *
 * @author jingli
 */
public class Book {
    private String name;
    private int num;
    public Book(){
        name = "";
        num = 0;
    }
    public Book(String name, int num){
        this();
        this.name = name;
        this.num = num;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String toString(){
        return /*"The name of the book is " + name
                + " and the reference number is " + */ num + "";
    }
}
