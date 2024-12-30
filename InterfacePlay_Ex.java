package javaprograms;

interface Playable{
	void play();
}

class FootBall implements Playable {

	@Override
	public void play() {
		System.out.println("You have selected Football");
	}
	
}
class VolleyBall implements Playable{

	@Override
	public void play() {
System.out.println("You have selected volleyball");		
	}
	
}

class Basketball implements Playable {

	@Override
	public void play() {
System.out.println("You are playing basketball");		
	}
	
}

public class InterfacePlay_Ex {

	public static void main(String[] args) {
		FootBall f1=new FootBall();
		VolleyBall v1=new VolleyBall();
		Basketball b1=new Basketball();
		
		f1.play();
		
		v1.play();
		
		b1.play();
		
	}

}
