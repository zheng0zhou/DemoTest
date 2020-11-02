import java.io.*; 
public class SimpleClasse {
	public int somme(int a, int b){
		return a+b;
	}
	public static void main(String[] args){
		SimpleClasse sc = new SimpleClasse();
		int a=3;
		int b=5;
		System.out.println("La somme de "+a+" et "+b+" est : "+sc.somme(a,b));	
		System.out.println("Un petit changement !!!! ");
		System.out.println("Pipeline ！");
	}
}