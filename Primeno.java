import java.util.Scanner;
class Primeno {
	public int CheckPrime(int a){
		int counter=0;
		for(int num=a; num>1;num--){
			if(a%num==0){
				counter++;
			}
		}	
		return counter;
	}
	
	public static void main(String args[]){		
		int pri=0;
		Scanner sc = new Scanner(System.in);
		Primeno p=new Primeno();
		System.out.println("Check Enter Number is Prime Number.");
		System.out.print("Enter number :");
		pri=sc.nextInt();
		int counter=p.CheckPrime(pri);
		if(counter==1){
			System.out.print(pri+" is a Prime number");				
		}
		else{
			System.out.print(pri+" is not a Prime number");	
		}
		
	}
}