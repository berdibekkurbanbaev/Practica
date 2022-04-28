package com.company;

public class Main {

    public static void main(String[] args) {
      Walkable<String> iAm = (name) -> System.out.println("my name is"+name);
      iAm.walk("Berdibek");

    }
}

