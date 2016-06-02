package com.jmitwa.tuto.data.gen.java.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileUtils {

	public static File createFile(String canonicalFilename) {
		File file = new File(canonicalFilename);
		return file;
	}
	
	public static BufferedWriter createBufferedWriter(String canonicalFilename)
	{
		File file = new File(canonicalFilename);
		BufferedWriter out=null;
		try {
			out = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
	}
	
	static BufferedWriter createBufferedWriter(File file)
	{
		BufferedWriter out=null;
		try {
			out = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
	}

	public static void writeLine(BufferedWriter out, String text) throws IOException {
	
		out.write(text);
		out.newLine();
		
	}
	
	public static void close(BufferedWriter out)
	{
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
