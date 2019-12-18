package lib;

import java.io.FileFilter;
import java.io.FilenameFilter;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;

class File{
	boolean	canExecute() {return false;}
	boolean	canRead() {return false;}
	boolean	canWrite() {return false;}
	int	compareTo(File pathname){return 0;}
	boolean	createNewFile(){return false;}
	static File	createTempFile(String prefix, String suffix){return null;}
	static File	createTempFile(String prefix, String suffix, File directory){return directory;}
	boolean	delete(){return false;}
	void deleteOnExit(){}
	public boolean	equals(Object obj){ return false;}
	boolean	exists(){ return false;}
	File getAbsoluteFile(){return null;}
	String getAbsolutePath(){return null;}
	File getCanonicalFile(){return null;}
	String getCanonicalPath(){return null;}
	long getFreeSpace(){return 0;}
	String getName(){return null;}
	String getParent(){return null;}
	File getParentFile(){return null;}
	String getPath(){return null;}
	long getTotalSpace(){return 0;}
	long getUsableSpace(){return 0;}
	public int	hashCode(){return 0;}
	boolean	isAbsolute(){return false;}
	boolean	isDirectory(){return false;}
	boolean	isFile(){return false;}
	boolean	isHidden(){return false;}
	long lastModified(){return 0;}
	long length(){return 0;}
	String[] list(){return null;}
	String[] list(FilenameFilter filter){return null;}
	File[]	listFiles(){return null;}
	File[]	listFiles(FileFilter filter){return null;}
	File[]	listFiles(FilenameFilter filter){return null;}
	static File[]	listRoots(){return null;}
	boolean	mkdir(){return false;}
	boolean	mkdirs(){return false;}
	boolean	renameTo(File dest){return false;}
	boolean	setExecutable(boolean executable){return executable;}
	boolean	setExecutable(boolean executable, boolean ownerOnly){return ownerOnly;}
	boolean	setLastModified(long time){return false;}
	boolean	setReadable(boolean readable){return readable;}
	boolean	setReadable(boolean readable, boolean ownerOnly){return ownerOnly;}
	boolean	setReadOnly(){return false;}
	boolean	setWritable(boolean writable){return writable;}
	boolean	setWritable(boolean writable, boolean ownerOnly){return ownerOnly;}
	Path toPath(){return null;}
	public String toString(){return null;}
	URI	toURI(){return null;}
	URL	toURL(){return null;}
}
