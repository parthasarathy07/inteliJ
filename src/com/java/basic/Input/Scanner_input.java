package com.java.basic.Input;

public class Scanner_input {
    int a;
    static int b=2;
    public static void main(String[] args) {
//        Scanner ob=new Scanner(System.in);
//        String s=ob.nextLine().trim();
//        char c=ob.nextLine().trim().charAt(4);
//        System.out.println(s+" "+c);
       Scanner_input ob=new Scanner_input();
        ob.a=3;
        Scanner_input.b=4;
        Scanner_input ob1=new Scanner_input();
        System.out.println(ob1.a+" "+Scanner_input.b);


    }
}
