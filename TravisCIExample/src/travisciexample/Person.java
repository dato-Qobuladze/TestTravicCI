/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travisciexample;

/**
 *
 * @author dato
 */
public class Person {
    
    private String name;
    private int age;
    
    public Person(){
        
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}
