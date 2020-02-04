import java.io.*;
import java.util.ArrayList;


class BinaryIntegerListReader extends DataInputStream {
	private String delimiter = " ";


	public BinaryIntegerListReader(File file) throws FileNotFoundException {
		super(new FileInputStream(file));
	}
	
	public ArrayList<Integer> readIntegerList() throws IOException {
		ArrayList<Integer> returnArray = new ArrayList<Integer>();
		
		while(available() > 0) {
			returnArray.add(readInt());
			skip(delimiter.length() * 2);
		}
		
		return returnArray;
	}
	
	public void setDelimiter(String d) {
			delimiter = d;
		}
		
	public String getDelimiter(String d) {
		return delimiter;
	}
	
}