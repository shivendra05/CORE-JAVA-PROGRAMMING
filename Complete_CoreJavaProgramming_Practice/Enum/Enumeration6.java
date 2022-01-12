package com.practice.Enum;

enum Enumeration_Fish {
	STAR, GOLD,GUPPY;

	public static void main(String[] args) {
		Enumeration_Fish [] fishes = Enumeration_Fish.values();
		for (Enumeration_Fish fish:fishes) {
			System.out.println(fish+" "+fish.ordinal());
		}
	}
}