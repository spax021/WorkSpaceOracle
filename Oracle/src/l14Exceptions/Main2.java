package l14Exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Main2 {
	
	private List<Integer> list;
	private static final int SIZE = 10;

	
	public void writeList() throws IOException, IndexOutOfBoundsException {
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt")); 
		for(int i = 0; i < SIZE; i++){
			out.println("Value at: " + i + " = " + list.get(i));
		}
		out.close();
	}
	
	/*
	 * we use Try/Catch because code is more simpler, generaly it is similar to If/Else statment
	 * 
	 * TRY defines code where error can occur
	 * CATCH (exception handler) is doing the work if error occured
	 * you can have several CACTH codes 
	 * FINALLY code that is guaranteed to execute (close files, recover resources, clean up)
	 * */
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
