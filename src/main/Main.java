package main;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import data.ClassMethod;
import data.LocalVar;
import data.MemberVar;
import data.VarSentence;
import grammar.JavaParser;

public class Main {
	private static Main instance = new Main();
	
	private ArrayList<ClassMethod> classMethodList;
	private ArrayList<VarSentence> varSentenceList;
	private ArrayList<LocalVar> localVarList;
	private ArrayList<MemberVar> memberVarList;
	private FileManager fileManager;
	private ArrayList<File> javaFileList;
	private TypeFinder typeFinder;
	private FileCopier fileCopier;
	
	private Main() {
		classMethodList = new ArrayList<>();
		localVarList = new ArrayList<>();
		memberVarList = new ArrayList<>();
		varSentenceList = new ArrayList<>();
		fileManager = new FileManager();
		typeFinder = new TypeFinder();
		fileCopier = new FileCopier();
	}
	
	
	public static Main getInstance() {
		return instance;
	}
	
	
	public void addToClassMethodList(ClassMethod classMethod) {
		classMethodList.add(classMethod);
	}
	
	
	public void addToVarSentenceList(VarSentence varSentence) {
		varSentenceList.add(varSentence);
	}
	
	
	public void addToLocalVarList(LocalVar localVar) {
		localVarList.add(localVar);
	}
	
	
	public void addToMemberVarList(MemberVar memberVar) {
		memberVarList.add(memberVar);
	}
	
	
	
	public void start() {
		javaFileList = fileManager.getJavaFileList();
		
		for(File file : javaFileList) {
			JavaParser.main(file);
		}
		
		typeFinder.setList(classMethodList, varSentenceList, localVarList, memberVarList);
		typeFinder.getType();
		
		fileCopier.copyAllVarToJava(javaFileList, varSentenceList);
	}
	
	
	//public void addToVarList
	
	
	public static void main(String[] args) {
		Main main = Main.getInstance();
		main.start();
		
		/*
		
		
		
		for(LocalVar l : main.localVarList) {
			System.out.println(l);
		}
		
		
		for(MemberVar m : main.memberVarList) {
			System.out.println(m);
		}*/
		/*for(ClassMethod s : main.classMethodList) {
			System.out.println(s);
		}*/
		
		/*for(VarSentence v : main.varSentenceList) {
			System.out.println(v);
		}*/
	}
}
