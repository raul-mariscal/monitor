package com.thincode.monitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
/*
        int i, j, clave, aux;




        i = j = clave = aux = 0;

        int[] array =  {80,2,1,9,50,19,23,14,11};
       {2,3,10,9,50,19,23,14,11}

        {2,3,9,10,50,19,23,14,11}

        {2,3,9,10,19,50,23,14,11}

        {2,3,9,10,19,23,50,14,11}

        {2,3,9,10,19,23,14,50,11}

        {2,3,9,10,19,23,14,50,11}

aux = 14
array[i] = 50
array[j] = 50
array[i] = 14

aux = 14
array[i] = 23
array[j] = 50

array[j] = 23
array[i] = 14



        

        while(j < array.length - 1) {
            j++;
            i = j - 1;
            clave = j;
            while(i >= 0) {
                if(array[clave] < array[i]) {
                    aux = array[clave];
                    array[clave] = array[i];
                    array[i] = aux;
                    clave--;
                }
                i--;
            }
        }

        for (int k : array) {
            System.out.println(k);
            
        }*/








/*
        Browser browser = new Browser();
        for (String line : browser.searchMessage("[0-9]{8}\\s[0-9]{3}I.*")) {
            System.out.println(line);
        }

        int [] array = {4,5, 80, 12, 44, 10};
        ArrayList<Integer>[] list = new ArrayList[10];

        for(int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<Integer>();
        }

        //{4,5, 80, 12, 44, 10};
        int aux = 0;
        boolean b = false;
        for(int r = 10; b == false; r = r * 10) {
            for(int i = 0; i < array.length; i++) {
                aux = (array[i] % r);
                list[aux].add(array[i]);

                //list[array[i] % 10].add(array[i]);
                System.out.println(aux);

            }            
        }


int num = 2015, r = 0;
		do {
			r = num % 10;
			System.out.println(r);
			num = num / 10;
        }while(num > 0);
 */       

        int [][][] board = new int[181440][3][3];
        Scanner keyboard = new Scanner(System.in);
System.out.println("enter an integer");
int myint = keyboard.nextInt();

        


    }





}


// Ejercicio de convertir de decimal a binario
// checar usos de ^


// Un metodo que reciba un numero decimal y lo convierta a binario 

// la 9 