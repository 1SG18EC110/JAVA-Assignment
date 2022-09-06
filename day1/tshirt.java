package com.example.assignment;

public class tshirt {
String color;
String material;
String design;
 
public static void main(String[] args) {
                tshirt small = new tshirt();
                small.color="red";
                small.material = "fabric";
                small.design="collared";
               
                tshirt large = new tshirt();
                large.color= "green";
                large.material = "silk";
                large.design="full-sleeve";
               
                tshirt xl = new tshirt();
                xl.color="black";
                xl.material="cotton";
                xl.design="half-sleeve";
               
                System.out.println(small.color+" "+small.material+" "+ small.design);
                System.out.println(large.color+" "+large.material+" "+ large.design);
                System.out.println(xl.color+" "+xl.material+" "+ xl.design);
}
}