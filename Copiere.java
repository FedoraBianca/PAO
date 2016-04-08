/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiere;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author MNI
 */
public class Copiere {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fisier cerut: ");
        String fisier = sc.next();
        InputStream is = null ;
        try{
            is = new FileInputStream(fisier);
        }
        catch(FileNotFoundException e) {
            System.out.println("Fisier inexistent");
            System.exit(0);
        }
        System.out.print("Numele copiei: ");
        fisier = sc.next();
        OutputStream os = new FileOutputStream(fisier);
        int c ;
        while((c=is.read()) != -1) os.write(c);
        System.out.println("\nFisier copiat!");
        is.close();
        os.close();
    }
    
}