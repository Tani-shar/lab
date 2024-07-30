class numbers{
	public static void main(String args[]){
		int number1,number2,number3,number4,number5,number6,number7,number8,number9,number10;
		number1=Integer.parseInt(args[0]);
		number2=Integer.parseInt(args[1]);
		number3=Integer.parseInt(args[2]);
		number4=Integer.parseInt(args[3]);
		number5=Integer.parseInt(args[4]);
		number6=Integer.parseInt(args[5]);
		number7=Integer.parseInt(args[6]);
		number8=Integer.parseInt(args[7]);
		number9=Integer.parseInt(args[8]);
		number10=Integer.parseInt(args[9]);
		for(int i = 0; i<9;i++){
			i=i.parseInt(i);
			if(args[i]==0){
				System.out.println("number "+args[1]+1+"is zero");
			}
			else if(args[i]>0){
				System.out.println("number "+args[1]+1+"is positive");

			}
			else{
				System.out.println("number "+args[1]+1+"is negative");
			}
		}
	}
}