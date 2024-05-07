package com.kh.test.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Á¤±ÔÇ¥Çö½Ä {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇÑ±ÛÀ» ÀÔ·ÂÇÏ¼¼¿ä : ");
		String ÀÔ·Â = sc.nextLine();
		
		
		// ¿¹¸¦ µé¾î ¹İº¹ÇÏ´Â ÆĞÅÏÀÌ °¡-ÆR ÇÑ±ÛÀÌ¶ó¸é
		if(Pattern.matches("^[°¡-ÆR]*$", ÀÔ·Â)) {
			System.out.println("ÀÔ·ÂÇÑ ¹®ÀÚ¿­Àº ÇÑ±ÛÀÔ´Ï´Ù.");
		} else {
			System.out.println("ÇÑ±Û¸¸ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		}
		
		// ÀüÈ­¹øÈ£ 0-9 ÀÔ·ÂÇÏ´Â ½ºÄ³³Ê ÁøÇàÇØº¸±â
		System.out.print("ÀüÈ­¹øÈ£¸¦ -ÇÏÀÌÇÂ ¾øÀÌ ÀÔ·ÂÇÏ¼¼¿ä : ");
		String ÀüÈ­¹øÈ£ = sc.nextLine();
		
		if(Pattern.matches("^[0-9]*$", ÀüÈ­¹øÈ£)) {
			System.out.println("ÀÔ·ÂÇÑ ¹®ÀÚ¿­Àº ÀüÈ­¹øÈ£ Çü½ÄÀÔ´Ï´Ù.");
			//Integer.parseInt(ÀüÈ­¹øÈ£); -> ¼ıÀÚ·Î º¯°æ
		} else {
			System.out.println("ÀüÈ­¹øÈ£ Çü½ÄÀÌ ¾Æ´Õ´Ï´Ù.");
		}
		
		
		
	}
}
