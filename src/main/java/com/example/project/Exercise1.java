package com.example.project;
import java.util.Scanner;

public class Exercise1 {

  public static void main(final String[] args) {

    Exercise1 obj = new Exercise1();
    Scanner sc = new Scanner(System.in);
    while (true) {
      int n = sc.nextInt();
      System.out.println(obj.esCuadradoPerfecto(n));			
    }
  }

  public boolean esCuadradoPerfecto(int numero) {
    if(numero<=0){
      return false;
    }else{
      return verificarCuadrado(numero,0);//se verificar con otro metodo donde se hara recursion desde 0;
    }
  }
  public boolean verificarCuadrado(int n,int i){
    //caso base si el numero i al cuadrado es igual a n, se encontro su raiz
    if(n==i*i){
      return true;
    } 
    // i se ha incrementado hasta n por lo tanto no tiene raices
    if(i==n){
      return false;
    } 
    else return verificarCuadrado(n,i+1);
  }
}
