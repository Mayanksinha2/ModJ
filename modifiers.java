package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class modifiers {
    public static void main(String[] args) {
        MyEmployee manku = new MyEmployee();
//        manku.id = 45;
//        manku.name = "CodewithManku";
        manku.setName("CodeWithManku");
        System.out.println(manku.getName());
        manku.setId(45);
        System.out.println(manku.getId());
    }
}
