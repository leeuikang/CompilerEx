package main;

import java.io.File;
import java.util.ArrayList;

public class FileManager {
	private File input_dir;
	private ArrayList<File> javaFileList;
	private FileCopier fileCopier;
	
	
	public FileManager() {
		input_dir = new File("input");
		javaFileList = new ArrayList<>();
		fileCopier = new FileCopier();
	}
	
	
	public ArrayList<File> getJavaFileList() {
		searchDir(input_dir);
		
		return javaFileList;
	}
	
	
	//재귀로 디렉토리 뒤진다
	private void searchDir(File dir) {
		getJavaFiles(dir);
		copyOthers(dir);
		
		File[] subDirs = dir.listFiles(new DirFileFilter());
		for(File subDir : subDirs) {
			searchDir(subDir);
		}
	}
	
	
	//.java가 아닌건 그냥 복사
	private void copyOthers(File dir) {
		File[] files = dir.listFiles(new NotJavaFileFilter());
		for(File file : files) {
			if(file.isDirectory()) {
				fileCopier.mkDir(file);
				continue;
			}
			fileCopier.wholeCopy(file);
		}
	}
	
	
	//dir에 있는 .java파일 뽑아냄
	private void getJavaFiles(File dir) {
		File[] javaFiles;
		javaFiles = dir.listFiles(new JavaFileFilter());
		
		for(File javaFile : javaFiles)
			javaFileList.add(javaFile);
	}
	
	
	//테스트용
	/*public static void main(String[] args) {
		FileManager ff = new FileManager();
		ff.searchDir(ff.input_dir);
		System.out.println(ff.javaFileList.get(0).getName());
	}*/
}
