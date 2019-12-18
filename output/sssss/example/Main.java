package lib;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test {
	public static void main(String args[]) {
		Scanner want = new Scanner(System.in);
		String want_string = want.nextLine();
		ArrayList<String> Arr = new ArrayList<String>();
		try {
			File file = new File("lib.txt");
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				StringTokenizer st = new StringTokenizer(scan.nextLine());
				while(st.hasMoreTokens()) {
					Arr.add(st.nextToken());
					}
			}
			List<String> List = Arr.subList(0,5);
			EditDistance difference = new EditDistance();
			for(int i = 0 ; i<List.size(); i++) {
				System.out.println(List.get(i)+" "+want_string+" "+difference.Comparison(List.get(i),want_string));
				}
			
		EditDistance difference2 = new EditDistance();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
