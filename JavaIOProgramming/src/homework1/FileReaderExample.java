package ch18.homework1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("\"D:/IotCourse/NetbinsWorkspace/JavaProgramming/src/ch18/examples/FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf))!=-1){
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		fr.close();
		
	}
}
