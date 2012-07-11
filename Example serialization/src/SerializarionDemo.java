import java.io.*;
class SerializarionDemo {
	public static void main(String args[]){
		try{
			MyClass object1=new MyClass("Hello",-7,2.7e10);
			System.out.println("Object1: "+object1);
			FileOutputStream fos=new FileOutputStream("serial");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		}catch(Exception e){
			System.out.println("Exception in serialization");
			System.exit(0);
		}
		
		try{
			MyClass object2;
			FileInputStream fis=new FileInputStream("serial");
			ObjectInputStream ois=new ObjectInputStream(fis);
			object2=(MyClass)ois.readObject();
			ois.close();
			System.out.println("object2: "+object2);
		}catch(Exception e){
			System.out.println("Exception in serialization");
			System.exit(0);
		}
		
	}

}
