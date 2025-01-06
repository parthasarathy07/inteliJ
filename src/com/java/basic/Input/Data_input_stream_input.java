package com.java.basic.Input;
import java.io.*;
public class Data_input_stream_input {
    public static void main(String []args)throws IOException {
        DataInputStream dsi=new DataInputStream(System.in);
        int i= Integer.parseInt(dsi.readLine());
        System.out.println(i);
        System.out.println(dsi);
        
    }
}
