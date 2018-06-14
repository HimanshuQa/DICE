import java.util.Random;
public class Die {

	int faces;
	public Die(int faces){
		this.faces = faces;
		
	}
	
	public String roll(){
		Random r = new Random();
		String[] HT = {"Head" , "Tail"};
		
		if(this.faces == 2){
			int  output = r.nextInt(this.faces);
			return HT[output];
		}
		else{
			int  output = r.nextInt(this.faces) + 1;
			return(String.valueOf(output));
		}
	}
	
	public static void main(String[] args) {
		Die d = new Die(6);
		System.out.println(d.roll());
	}
}
