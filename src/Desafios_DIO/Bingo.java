package Desafios_DIO;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
	private static Random rnd = new Random();
	private static List<Integer> mListItems = new ArrayList<Integer>();
	private static List<Integer> mListItemsB = new ArrayList<Integer>();
	private static List<Integer> mListItemsI = new ArrayList<Integer>();
	private static List<Integer> mListItemsN = new ArrayList<Integer>();
	private static List<Integer> mListItemsG = new ArrayList<Integer>();
	private static List<Integer> mListItemsO = new ArrayList<Integer>();
	
	private static int mTotalItems = 75;
	private static int mTotalItemsColumn = 5;
	
	private static NumberFormat nf = new DecimalFormat("00");
	
	public static void initializeItems( ) { 
		for ( int i = 0 ; i < mTotalItems; i++) {
			mListItems.add(0);	
		}		
		for ( int j = 0 ; j < mTotalItemsColumn ; j++) {
			mListItemsB.add(0);
			mListItemsI.add(0);
			mListItemsN.add(0);
			mListItemsG.add(0);
			mListItemsO.add(0);
		}	
	}
	
	public static void createColumn( ) { 
		int randomNumber = rnd.nextInt(15); // Vai de 0 até 14
		int min = 1;
		int max = 15;
		for ( int row = 0 ; row < 5 ; row++ ) {
			for ( int col = 0 ; col < 5 ; col++ ) {
				while ( !checkNumber(randomNumber)){
					randomNumber = rnd.nextInt( max - min + 1 ) + min;
				}
				mListItems.set( randomNumber, 1);
				switch (col) {
					case 0:
						mListItemsB.set( row , randomNumber + 1 );
					break;
					case 1:
						mListItemsI.set( row , randomNumber + 1 );
						break;
					case 2:
						mListItemsN.set( row , randomNumber + 1 );
						break;
					case 3:
						mListItemsG.set( row , randomNumber + 1 );
						break;
					case 4:
						mListItemsO.set( row , randomNumber + 1 );
						break;
				}
			}
			min = max + 1;    // 16  31  46  61
			max = min + 14;   // 30  45  60  75
			
		}
	}

	public static boolean checkNumber( int number ) { 
		boolean result = true;
		if ( mListItems.get(number).equals(1)) {
			result = false;
		}	
		return result; 
		}
	
	public static void showCard( ) { 
		int number = 0;
		for( int row = 0 ; row < 5 ; row++ ) {
			for( int col = 0 ; col < 5 ; col++ ) {
				switch( row ) {
				case 0: number = mListItemsB.get(col).intValue();
					break;
				case 1: number = mListItemsI.get(col).intValue();
				break;
				case 2: number = mListItemsN.get(col).intValue();
				break;
				case 3: number = mListItemsG.get(col).intValue();
				break;
				case 4: number = mListItemsO.get(col).intValue();
				break;
				}
				if( row == 2 && col == 2) {
					System.out.print("** | ");
				}
				else {
					formatNumberShow(number);
				}
			}
			System.out.println("");
		}
	}

	public static void formatNumberShow( int number ) { 
		if( number < 10 ) {
			System.out.print( nf.format(number) + " | ");
		}
		else {
			System.out.print( number + " | ");
		}
	}
	
	public static void main(String[] args) { 
		initializeItems();
		createColumn();
		Scanner tcd = new Scanner(System.in);
		System.out.println("Press any key");
		String resp = tcd.next();
		System.out.println(" B |  I |  N |  G |  O |");
		showCard();
		
		tcd.close();		
	}	
}

