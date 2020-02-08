package com.epam.maven.demo;

import java.util.*;
import java.io.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println( "children's gift" );
        System.out.println("enter no of chocolates");
        int choco=sc.nextInt();
        System.out.println("enter no of sweets");
        int sweets=sc.nextInt();
        System.out.println("enter weights");
        int chocoweight[]=new int[choco];
        for(int i=0;i<choco;i++)
        {
        	choco[i]=sc.nextInt();
        	
        }	
        int sweetsweight[]=new int[sweets];
        System.out.println("enter candy range");
        int c=0;
        int candrange=sc.nextInt();
        for(int i=0;i<choco;i++)
        {
        	c=c+a[i];
        }
        System.out.println(c);
    }
}
