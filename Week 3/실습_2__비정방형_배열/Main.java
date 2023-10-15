import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		int i[][];
		i = new int[5][];
		
		i[0] = new int[5];
		i[1] = new int[3];
		i[2] = new int[4];
		i[3] = new int[1];
		i[4] = new int[2];
		
		// 배열 입력
		for(int x=0; x<i.length; x++)
			for(int y=0; y<i[x].length; y++){
				i[x][y]=(x+1)*10+y;
			}

		// 배열을 출력합니다.
		for(int x=0; x<i.length; x++) {
			for(int y=0; y<i[x].length; y++)
				System.out.print(i[x][y] + " ");
			System.out.println("");
		}
	}
}