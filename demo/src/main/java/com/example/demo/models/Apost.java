package com.example.demo.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;



import java.math.*;
import java.security.SecureRandom;
import java.util.Random;
//new java.util.Random()
@SuppressWarnings("unused")
@Entity
public class Apost {
	
		   
		 Random random = new Random(); 
		   int numero= random.nextInt(100);
		 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "age")
    private int age;
    
    public Apost() {
 	
   }
    public Apost(String email, int age) {
    	super();
    	this.email = email;
    	this.age = age;
    	}
    
    public int getId() {
		return id;}
    
    public String getEmail() {
	return email;}
    
    public void setEmail(String email) {
    	this.email=email;}
    
    public double getAge() {
    	int numero = random.nextInt(100); 
		return nextInt(numero);}
    
	private double nextInt(double numero) {
		return  numero;
	}
	public void setAge(int age) {
    this.age=age;}
    
    public String toString() {
		return email;}
}

   
   
