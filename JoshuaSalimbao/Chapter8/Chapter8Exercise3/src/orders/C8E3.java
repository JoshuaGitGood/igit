// package LunchOrder.src.orders;

import java.util.Scanner;

public class C8E3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		Food burger = new Food(1.85, 9, 33, 1);
		Food salad = new Food(2.00, 1, 11, 5);
		Food fries = new Food(1.30, 11, 36, 4);
		Food soda = new Food(0.95, 0, 38, 0);
		
		int qty = 0;
		String repeat = "y";
		
		
		do {
		
		System.out.print("\nEnter number of hamburgers : ");
		qty = sc.nextInt();
		System.out.println(String.format("Each hamburger has %5s.0g of fat, %5s.0g of carbs, and %5s.0g of fiber", burger.getFat(), burger.getCarbs(), burger.getFiber()));
		burger.setPrice(qty * burger.getPrice());
		
		
		System.out.print("\nEnter number of salads : ");
		qty = sc.nextInt();
		System.out.println(String.format("Each salad has %5s.0g of fat, %5s.0g of carbs, and %5s.0g of fiber", salad.getFat(), salad.getCarbs(), salad.getFiber()));
		salad.setPrice(qty * salad.getPrice());
		
		
		System.out.print("\nEnter number of fries : ");
		qty = sc.nextInt();
		System.out.println(String.format("Each fries has %5s.0g of fat, %5s.0g of carbs, and %5s.0g of fiber", fries.getFat(), fries.getCarbs(), fries.getFiber()));
		fries.setPrice(qty * fries.getPrice());
		
		
		System.out.print("\nEnter number of sodas : ");
		qty = sc.nextInt();
		System.out.println(String.format("Each soda has %5s.0g of fat, %5s.0g of carbs, and %5s.0g of fiber", soda.getFat(), soda.getCarbs(), soda.getFiber()));
		soda.setPrice(qty * soda.getPrice());
		
		System.out.println("\nTotal : " + "$" +(salad.getPrice() + fries.getPrice() + soda.getPrice() + burger.getPrice()));
		
		System.out.print("\n\nAgain? [y/n] : ");
		repeat = sc.next();
		}while(repeat.equals("y"));
        sc.close();
    }
}
