package main;

import java.io.File;

public class FileManager {
	File input_dir = new File("input");
	File[] javaFiles;
	
	public void getJavaFiles() {
		javaFiles = input_dir.listFiles(new JavaFileFilter());
		
		for(File f : javaFiles) {
			System.out.println(f.getName());
		}
	}
	
	
	//?��?��?��?��
	public static void main(String[] args) {
		FileManager ff = new FileManager();
		ff.getJavaFiles();
	}
}
