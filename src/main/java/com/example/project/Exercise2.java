package com.example.project;

import java.util.Scanner;

public class Exercise2 {

  public static void main(final String[] args) {

    Exercise2 obj = new Exercise2();
    Scanner sc = new Scanner(System.in);
    while (true) {

      int n = sc.nextInt(), suma;
      int a[] = new int[n];

      for (int i = 0; i < a.length; i++) {
	n = sc.nextInt();
	a[i] = n;
      }

      suma = sc.nextInt();
      System.out.println("la primera suma es"+suma);

      System.out.println(obj.esSubconjuntoSumaExt(a,suma));
    }
  }

  public boolean esSubconjuntoSumaExt(int a[], int suma) {
    return verificarAgregoParam(a, a.length,suma);
  }
  public boolean verificarAgregoParam(int a[],int n, int suma) {
    //Casos base
    if(suma==0){
      return true;
    }
    if(n==0){
      return false;
    }
    int elegido=0;
    //todo multiplido de 7 se elige, siempre q no sea  seguido de 1
    if((n==a.length && a[n-1]%7==0)||(a[n-1]%7==0)&&(a[n]!= 1))elegido=a[n-1];
    int noelegido=0;
    if((n!=a.length && a[n-1]%7==0) && a[n]==1) noelegido=a[n-1];

    return  verificarAgregoParam(a,n-1,suma-a[n-1]+noelegido)||verificarAgregoParam(a,n-1,suma-elegido)  ;
  }
}

