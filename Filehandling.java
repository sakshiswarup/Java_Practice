package java_1;
// exists() -  it is a non static method persent inside file class.
//checks whether the file is present in given path. if yes this will return true or else false
import java.io.File;



//public class Filehandling {
//
//public static void main(String[] args) {
//	File f = new File("G://hello//A.txt");
//	 boolean val = f.exists();
//	 System.out.println(val);
//}
//}

//delete()- it is a non static method persent inside file class.
//it will delete a file in the given path. If the file is not deleted it will return false
//if file is deleted then it will return true

public class Filehandling {

public static void main(String[] args) {
	File f = new File("G://hello//A.txt");
	   boolean val=f.delete();
	 System.out.println(val);
}
}


