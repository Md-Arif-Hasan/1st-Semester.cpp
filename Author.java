/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account_System;

/**
 *
 * @author User
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author(String name_passed, String email, char gender)
    {
        this.name = name_passed;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(String Email)
    {
        this.email = Email;
    }
    public char getGender()
    {
        return this.gender;
    }

    /**
     *
     * @return
     */
    public String toString()
    {
        return "Author [Name = " + this.name  + ", Email = " + email  + 
               ", Gender = " + gender + "]";
    }
    
}
