package Corejava;

public class GarbageCollection {

	public void finalize(){System.out.println("garbage collected object");}
	public static void main(String args[]){
		//Creating First Object of GarbageCollection Class
		GarbageCollection s1=new GarbageCollection();
		//Creating Second Object of GarbageCollection Class
		GarbageCollection s2=new GarbageCollection();
		//Initializing Objects;
		s1=null;
		s2=null;
		//Called System.gc function
		System.gc();
		}
		
}

