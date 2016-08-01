package com.example.tanmayjha.recyclerviewapp;

/**
 * Created by tanmay jha on 31-07-2016.
 */
public class ResailDatabase {
    String name, room, product,phoneno,cost;

    // Room variable contains the room no. of the seller

    private ResailDatabase(String name, String room, String product,String phoneno, String cost)
    {
        this.name=name;
        this.room=room;
        this.product=product;
        this.phoneno=phoneno;
        this.cost=cost;
    }

    public static final ResailDatabase[] resailDatabases={
            new ResailDatabase("Tanmay","K-628","Mattress","1234567890","5000"),
            new ResailDatabase("Vaibhav","L-225","Bucket","1876543210","300"),
            new ResailDatabase("Lekshika","D-115","Books","1284957364","250"),
            new ResailDatabase("Paridhi","F-192","Mattress","1847539203","1500"),
            new ResailDatabase("Nayan","L-322","Pillow","1235562345","150"),
            new ResailDatabase("Gaurav","G-432","Shoes","4234253443","700")
               };

    public String getRoom() {
        return room;
    }

    public String getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public String getPhoneno() {
        return phoneno;
    }

}
