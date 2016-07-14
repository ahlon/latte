/**
 * Ouer.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.redq.latte.controller;

/**
 * 
 * @author tonghu
 * @version $Id: Person.java, v 0.1 2015年11月17日 下午8:01:36 tonghu Exp $
 */
public class Person {
    private String name;
    
    private int age;

    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>age</tt>.
     * 
     * @return property value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>age</tt>.
     * 
     * @param age value to be assigned to property age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
