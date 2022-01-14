package com.points;

public class Main {

    public static void main(String[] args) {
        int points = 0;

        System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
        System.out.println(points -= 50);
        System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
        System.out.println(points -= 3);
        System.out.println("Hermione got full marks on Lockhart's quiz. 30 points for Gryffindor");
        System.out.println(points += 30);
        System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
        System.out.println(points += 100);
        System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
        System.out.println(points += 60);

        System.out.println(points);
    }
}
