package com.mycompany.projeto;
import java.util.Scanner;
import java.lang.Math;

public class Projeto {
    
    
    public static void operacoes(int x, int y)
    {
        /*
        System.out.println("soma: " + x+y);
        System.out.println("subtracao:" + (x - y));
        System.out.println("multiplicacao: " + x * y);
        System.out.println("divisao: " + x / y);
          */      
    }
  
    public static void checarTriangulo()
    {
         Scanner inp = new Scanner(System.in);
      //Pegar o primeiro cateto
  
      System.out.println("Coloque o primeiro Cateto: ");    
       double resposta = inp.nextFloat();
  
       // pegar o segundo cateto
       System.out.println("Coloque o Segundo Cateto: ");
       double resposta2 = inp.nextFloat();
        
       //Pegar hipotenusa
       
        System.out.println("Coloque a  hipotenusa: ");
        double hipotenusa = inp.nextFloat();
        
    
        double hipotenusa2= Math.sqrt(Math.pow(resposta,2)+ Math.pow(resposta2,2));
        if(hipotenusa2 == hipotenusa)
        {
            System.out.println("é um triangulo retangulo");
        }
        else{
            
               System.out.println("NÃO é um triangulo retangulo");

        }
    }
    
  
    public static void main(String[] args) {
        
        /*
            Scanner inp = new Scanner(System.in);
            System.out.println("Primeiro valor: ");
            int x = inp.nextInt();
            System.out.println("Segundo valor");
            int y = inp.nextInt();
            operacoes(x,y);
          */  
        checarTriangulo();
       
    }   
    }

