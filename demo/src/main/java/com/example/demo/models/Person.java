package com.example.demo.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;


import java.math.*;


@Entity
public class Person {
	
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    
    @Column(name = "nome")
    private String name;
    
    @Column(name = "age")
    private int age;
    
  
   @Column(name = "email")
   private String email;
    
    public Person() {
    	
   }
    
    public Person(String name, int age, String email) {
    	super();
    	this.name = name;
    	this.age = age;
    	this.email = email;}
    
    public int getId() {
		return id;}
    
    public String getName() {
	return name;}
    
    public void setName(String name) {
    	this.name=name;}
    
    public int getAge() {
		return age;}
    
    public void setAge(int age) {
    this.age=age;}
    
    public String toString() {
		return name;}

   public  Object getEmail() {
	   return email;}
    
   public void setTeste(String email) {
    	this.email = email;}
    }
   
