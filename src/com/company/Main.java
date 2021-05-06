package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang vao day");
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu " + i + " vao day");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min la " + min);
    }
}
