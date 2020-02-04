import java.io.*;

class BinaryIntegerWriter {
	private DataOutputStream output;
	
	public BinaryIntegerWriter(File file) throws FileNotFoundException {
		output = new DataOutputStream(new FileOutputStream(file));
	}
	
	public void writeInt(int i) throws IOException {
		output.writeInt(i);
		output.writeChar(' ');
	}
	
	public void writeIntList(int[] a) throws IOException {
		for(int i : a) {
			writeInt(i);
		}
	}
	
	public void close() throws IOException {
		output.close();
	}
}