package com.java.oops.constructors;
class NewConstructor{
    int roll;
    String name;
    NewConstructor(){
        this(1,"alone");
    }
    NewConstructor(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
}

public class CallFromOtherConstructor {
    public static void main(String[] args) {
        NewConstructor ob=new NewConstructor();
        System.out.println(ob.roll+" "+ob.name);
    }
}
