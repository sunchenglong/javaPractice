package practice.concurrence;

public class multiprocess extends Thread{
	private String name;
	public multiprocess(){
		
	}
	public multiprocess(String name){
		this.name = name;
	}
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println(name+"run    "+ i);
		}
	}
	public static void main(String args[]){
		multiprocess m1 = new multiprocess("A");
		multiprocess m2 = new multiprocess("B");
		m1.run();
		m2.run();
	}
}
