import java.util.Scanner;
public class DogRegistration
{
	float Fee,DogAge,DiscountPer,Discount,TotalFee,TotalDiscount,AverageFee;
	String DogName,DeSexed;
	int N=3;
	Scanner inString=new Scanner(System.in);
	Scanner inNumber=new Scanner(System.in);
	public void processDogs(){
        space();
		for(int i=1;i<=N;i++)
	   {
		  System.out.print("Enter the name of dog "+i+" ==> ");
		  DogName=inString.next();
		  System.out.print("Enter the age of "+DogName+" dog in years ==> ");
		  DogAge=inNumber.nextFloat();
          calculateFee();
		  space();
       	}
	  	  finalOutput();
	   dashes();
	   space();
	}
	public void calculateFee(){
		Fee=15;
		if(DogAge<10)
		{
		  System.out.print("Is "+DogName+" dog de-sexed(Y/N) ==>");
			DeSexed=inString.next();
			if(DeSexed.equals("y"))
			{
				Fee=25;
				}
				else
				{Fee=45;
					}
			
			}
			calculateDiscount();
			TotalFee=TotalFee+(Fee-Discount);
			System.out.println("The registration fee for "+DogName+" dog is $"+(Fee-Discount));
			dashes();
		
			
		}
	public void calculateDiscount()
	{
		
		System.out.print("Enter any additional discount as a percentage == > ");
	    DiscountPer=inNumber.nextFloat();
		space();
		dashes();
		if(DiscountPer!=0){
		Discount=DiscountPer*Fee/100;
		System.out.println("A discount of "+DiscountPer+" % on a fee of $"+Fee+" is $"+Discount);
		TotalDiscount=TotalDiscount+Discount;
		}
		
		
	}
	private void finalOutput()
	{
		space();
		System.out.println("Final Statistics");
		space();    
	    dashes();
		System.out.println("Total dogs\t\t\t"+N);
		System.out.println("Total fees\t\t\t$"+TotalFee);
		System.out.println("Total discount\t\t\t$"+TotalDiscount);
		AverageFee=TotalFee/N;
		System.out.println("Average Fee\t\t\t$"+AverageFee);
		
	}
	public void space(){
		System.out.println();
		
	}
	public void dashes(){
		for(int j=0;j<30;j++)
		{
			System.out.print("--");
		}
		System.out.print("\t\t\t\t\t\t\t\t");
	}
		

public static void main(String []args){
	System.out.println("\tWelcome to Petsville council dog registartion program");
	DogRegistration dogReg=new DogRegistration();
	dogReg.processDogs();
	System.out.println("Thank you, program written by Shailen Chhetri");
	}

	}
