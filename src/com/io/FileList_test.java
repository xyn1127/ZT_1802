package com.io;

import java.io.File;

public class FileList_test {

	public static void main(String[] args) {
		File ml=new File("E:\\大二\\java\\WorkSpace\\ZT_1802\\src\\com\\jihe");
		fileDir(ml);

	}


	private static void fileDir(File ml) {
	File[] wjsz=ml.listFiles();
	for(File file : wjsz) {
		if(file.isDirectory()) {
			fileDir(file);
			//String[] zml=ml.list((dir,name)->name.endsWith(".java"));
			//Arrays.stream(zml).forEach(f->System.out.println(f));
		}else if(file.isFile()) {
			if(file.getName().endsWith(".java"))
				System.out.println(file);
		}
	}
	

}

}

