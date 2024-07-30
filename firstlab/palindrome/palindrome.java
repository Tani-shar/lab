class palindrome{
	public static void main(String args[]){
		int original=Integer.parseInt(args[0]);
		int a=original;
		int reverse=0, temp = 0 ;
		while(original!=0){
			temp=original%10;
			reverse=reverse*10+temp;
			original=original/10;
		}
		if(reverse==a){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}