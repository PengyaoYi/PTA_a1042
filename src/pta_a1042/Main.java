package pta_a1042;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		int[] order = new int[55];
		int[] before_shuffle = new int[55];
		for(int i=1;i<=54;i++){
			before_shuffle[i]= i;
			
		}
		int[] after_shuffle = new int[55];
		for(int i=1;i<=54;i++){
			order[i] = input.nextInt();
		}
		for(int k=1;k<=times;k++){
			for(int i=1;i<=54;i++){
				after_shuffle[order[i]]=before_shuffle[i];
			}
		System.arraycopy(after_shuffle, 0, before_shuffle, 0, 55);
		}
		for(int i=1;i<=54;i++){
			if(after_shuffle[i]<14) System.out.print("S"+after_shuffle[i]);
			else if(after_shuffle[i]<27) System.out.print("H"+(after_shuffle[i]-13));
			else if(after_shuffle[i]<40) System.out.print("C"+(after_shuffle[i]-26));
			else if(after_shuffle[i]<53) System.out.print("D"+(after_shuffle[i]-39));
			else System.out.print("J"+(after_shuffle[i]-52));
			
			if(i<54) System.out.print(" ");
		}


	}

}

