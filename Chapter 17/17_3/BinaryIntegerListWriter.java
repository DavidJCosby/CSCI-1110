import java.io.*;
import java.util.ArrayList;


class BinaryIntegerListWriter extends DataOutputStream {
	private String delimiter = " ";
	
	public BinaryIntegerListWriter(File file) throws FileNotFoundException {
		super(new FileOutputStream(file));
	}
	
	public void writeIntegerList(ArrayList<Integer> list) throws IOException {
		for(int i : list) {
			writeInt(i);
			writeChars(delimiter);
		}
	}
	
	public void setDelimiter(String d) {
		delimiter = d;
	}
	
	public String getDelimiter(String d) {
		return delimiter;
	}
}