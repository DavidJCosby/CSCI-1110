import java.io.*;
import java.util.ArrayList;


class BinaryIntegerReader {
	DataInputStream input;

	public BinaryIntegerReader(File file) throws FileNotFoundException {
		input = new DataInputStream(new FileInputStream(file));
	}
	
	public int readNextInt() throws IOException {
		return input.readInt();
	}
	
	public ArrayList<Integer> readIntList() throws IOException {
		ArrayList<Integer> returnArray = new ArrayList<Integer>();
		
		while(input.available() > 0) {
			returnArray.add(input.readInt());
			input.skip(2);
		}
		
		return returnArray;
	}
	
	public void close() throws IOException {
		input.close();
	}
	
}