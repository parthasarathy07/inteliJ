package com.java.advanced.enums;
enum Color {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

    private final String hex;

    Color(String hex) {
        this.hex = hex;
        System.out.println("Constructor is called for " + this);
    }

    public String getHex() {
        return hex;
    }
}



public class EnumColorCode {
        public static void main(String[] args) {
            System.out.println(Color.RED.getHex()); // Output: #FF0000
            Color color =Color.RED;
            System.out.println(color);
            System.out.println(color.getHex());
            System.out.println(Color.RED);
            System.out.println(Color.BLUE.ordinal());
        }
}
