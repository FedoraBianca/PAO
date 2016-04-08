/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unu;
import java.io.*;
import java.util.*;

public class Unu {

    public static void main(String[] args) throws Exception {
        int n,d;
        Scanner sc = new Scanner(System.in);
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("out.dat"));
        System.out.println("n= "); n = sc.nextInt();
        dos.writeInt(n);
        System.out.println("Introduceti "+n+" numere reale: ");
        for (int i=0; i<n; i++) dos.writeInt(sc.nextInt());
        dos.close();
        
        DataInputStream dis= new DataInputStream( new FileInputStream("out.dat"));
        n =dis.readInt();
        for( int i=0; i<n; i++) System.out.print(dis.readInt()+"\t");
        System.out.println();
        dis.close();
        
    }
    
}
