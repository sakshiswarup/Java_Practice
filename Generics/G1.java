package Generics;

//public class G1 {
//public Object name;//it not type safe(dynamic type)
//public Object id;
//public G1(Object name, Object id) {
//	this.name = name;
//	this.id = id;
//}
//public Object getName() {
//	return name;
//}
//public Object getId() {
//	return id;
//}
//
//}

//So Generics in java are a powerful features that allow you to define class in interfaces and methods with a
//placeholder for types, providing greater flexibility and type safety.

public class G1<T,U>{
	public T name;
	public U id;
	public G1(T name, U id) {
		this.name = name;
		this.id = id;
	}
	public T getName() {
		return name;
	}
	public U getId() {
		return id;
	}
	
}