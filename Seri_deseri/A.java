package Seri_deseri;

import java.io.Serializable;

//Serialization=
//Here we convert object into binaries(0's & 1's) and then we store that into a file system permanently.

//public class A implements Serializable  {
//public String username="root";
//public String password ="test";
//
//}
//go to B.java

//transient keyword
//During Serialization if you want to skip any data to be return into object than mark the variable with transient keyword. 
public class A implements Serializable{
	public String username ="root";
	transient public String password ="test";
}