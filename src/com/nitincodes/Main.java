package com.nitincodes;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {
	// Hackerrank java list solution:
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     List<Integer> integerList = new ArrayList<>(n);
     for(int i=0;i<n;i++){
         integerList.add(sc.nextInt());
     }
     // Queries

int q = sc.nextInt();
     for(int i=0;i<q;i++){
         String command = sc.next();
         if(command.equals("Insert")){
             int x = sc.nextInt();
             int y = sc.nextInt();
             integerList.add(x, y);
         }
         if(command.equals("Delete")){
             int x = sc.nextInt();
             integerList.remove(x);


         }
     }
     for(Integer i: integerList){
         System.out.print(i+" ");
     }
    }
}
