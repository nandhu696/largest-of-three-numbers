package com.example;
public class App {
    public int largest(int a, int b, int c) { return Math.max(a, Math.max(b, c)); }
    public static void main(String[] args) { System.out.println("Largest = " + new App().largest(12, 25, 9)); }
}