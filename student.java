package com.example.assignment;

public class student {
    int stdID;
    String stdName;
    char stdClass;

    public static void main(String[] args) {
                    
                    student s1 = new student();
                    s1.stdName="abc";
                    s1.stdID=123;
                    s1.stdClass='A';
                   
                    student s2 = new student();
                    s2.stdName="efg";
                    s2.stdID=456;
                    s2.stdClass='B';
                   
                    System.out.println(s1.stdName+" "+s1.stdID+" "+s1.stdClass);
                    System.out.println(s2.stdName+" "+s2.stdID+" "+s2.stdClass);
    }

}
