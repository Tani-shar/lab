class findarea{
	public static void main(String args[]){
		int length, breadth, perimeter, area;
		length=Integer.parseInt(args[0]);
		breadth=Integer.parseInt(args[1]);
		perimeter=2*(length+breadth);
		area=length*breadth;
		System.out.println(perimeter);
		System.out.println(area);
	}
}