package org.example;

public class Practikum {
    public static void main(String[] args) throws Exception {
        String name = "Тимоти Шаламеsfsfsfssfs";
        Account account = new Account(name);
        boolean resulat = account.checkNameToEmboss();
        System.out.println(resulat);
    }
}