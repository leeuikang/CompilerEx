package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import data.VarSentence;

public class FileCopier {
	ArrayList<VarSentence> varSentenceList;
	int varSentenceListIndex = 0;
	
	public void copyAllVarToJava(ArrayList<File> fileList, ArrayList<VarSentence> varSentenceList) {
		this.varSentenceList = varSentenceList;
		
		for(File file : fileList) {
			copyVarToJava(file);
		}
	}
	
	
	public void copyVarToJava(File file) {
		FileReader fileReader = null;
		FileWriter fileWrite = null;

		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;

		String copyFilePath = file.getPath().replaceAll("input", "output");
	
		try {
			
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			fileWrite = new FileWriter(copyFilePath, false);
			bufferedWriter = new BufferedWriter(fileWrite);
			
			String s = null;//String 의 데이터를 s에다가 저장을 할것입니다
			
			
			while( (s=bufferedReader.readLine()) != null ) {	
				if(s.trim().startsWith("var")) {
					
					System.out.println(varSentenceList.get(varSentenceListIndex).getType());
					
					int tmp = s.indexOf("var");
					s = s.substring(0, tmp) + varSentenceList.get(varSentenceListIndex).getType() + s.substring(tmp + 3);
					System.out.println(s);
					varSentenceListIndex++;
				}
				bufferedWriter.write(s);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
		}catch(Exception e) {
			System.out.println(e);

		}finally {
			try {
				fileReader.close();
				fileWrite.close();
				bufferedReader.close();
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
	
	
	//파일 통짜로 복사
	public void wholeCopy(File file) {
		FileReader fileReader = null;
		FileWriter fileWrite = null;

		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;

		String copyFilePath = file.getPath().replaceAll("input", "output");
	
		try {
			
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			fileWrite = new FileWriter(copyFilePath, false);
			bufferedWriter = new BufferedWriter(fileWrite);
			
			String s = null;//String 의 데이터를 s에다가 저장을 할것입니다
			
			
			while( (s=bufferedReader.readLine()) != null ) {			
				bufferedWriter.write(s);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
		}catch(Exception e) {
			System.out.println(e);

		}finally {
			try {
				fileReader.close();
				fileWrite.close();
				bufferedReader.close();
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
	
	
	
	public void mkDir(File dir) {
		String copyDirPath = dir.getPath().replaceAll("input", "output");
		File copyDir = new File(copyDirPath);
		
		copyDir.mkdir();
	}
}
