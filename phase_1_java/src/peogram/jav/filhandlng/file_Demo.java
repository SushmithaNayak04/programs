package peogram.jav.filhandlng;

import java.io.File;

public class file_Demo {

	public static void main(String[] args) {
		try{
			File file=new File("login.txt");
			if(file.createNewFile()){
				System.out.println("File is created");
			}else{
				if(file.exists){
					System.out.println("file already exist");
					System.out.println("File path"+ file.getAbsolutePath());
				}
				else{
					System.out.println("file doesn't exist");
				}
			}
			
		}
		// TODO Auto-generated method stub 
		//NOT COMPLETED

	}

}
