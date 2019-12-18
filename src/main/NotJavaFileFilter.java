package main;

import java.io.File;
import java.io.FilenameFilter;

public class NotJavaFileFilter implements FilenameFilter{
	
	@Override
	public boolean accept(File dir, String name) {
		
		return !name.endsWith(".java");
	}
}
