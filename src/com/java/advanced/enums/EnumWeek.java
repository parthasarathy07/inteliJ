package com.java.advanced.enums;

import java.util.Arrays;

enum Week{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    private Week(){
        System.out.println("the constructor is called and value is " +this.name());
    }
}
public class EnumWeek {
    public static void main(String[] args) {
       Week day=Week.Monday;
        System.out.println(day.ordinal());
        System.out.println(day);
        System.out.println(Arrays.toString(Week.values()));
        for (Week item : Week.values()){
            System.out.println(item);
        }
        System.out.println(Week.valueOf("Monday"));
    }
}
