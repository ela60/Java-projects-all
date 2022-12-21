import java.io.*;
import java.util.*;

public class S1Q4LineDelimiters {

    public static void main(String[] args) throws FileNotFoundException {

	Scanner console = new Scanner(System.in);
	boolean input = false;
	String fileName = "";
	while (input == false) {
	    System.out.print("Please enter the name of file: ");
	    fileName = console.nextLine();
	    if (!fileName.isEmpty()) {
		input = true;
	    }

	}

	File inputFile = new File(fileName);
	Scanner in = new Scanner(inputFile);

	int lineNumber = 1;
	while (in.hasNextLine()) {
	    String line = in.nextLine();
	    System.out.printf("/* %d */", lineNumber);
	    System.out.println(" " + line + "\n");
	    lineNumber++;
	}

	in.close();
    }

} 