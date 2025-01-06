package com.java.basic.Input;
import java.io.*;

public class Input_Stream_Reader_input {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int i =Integer.parseInt(br.readLine());
        System.out.println(i);
        System.out.println(br);
        System.out.println(isr);
    }
}
