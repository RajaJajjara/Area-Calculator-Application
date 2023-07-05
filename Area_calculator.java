import java.util.Scanner;
class  Area_calculator
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("welcome to area calculator");
		System.out.println();
		System.out.println("enter 1 to find area of circle");
		System.out.println("enter 2 to find area of triangle");
		System.out.println("enter 3 to find area of squqre");
		System.out.println("enter 4 to find area of rectangle");
		System.out.println("enter 5 to find area of rhombus");
		System.out.println();
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		if (choice==1)
		{
			System.out.println("you have selected circle to find its area");
			System.out.println("enter radius of circle");
			double radius=scan.nextDouble();
			double area1=3.14*radius*radius;
			System.out.println("area of circle having radius"+radius+"is:"+area1);
		}
		else if (choice==2)
		{
			System.out.println("you have selected triangle to find its area");
			System.out.println("enter base of triangle");
			double base=scan.nextDouble();
			System.out.println("enter height of triangle");
			double height=scan.nextDouble();
			double area2=1/2.0*base*height;
			System.out.println("area of triangle having "+base+"and"+height+"is:"+area2);
		}
		else if (choice==3)
		{
			System.out.println("you have selected square to find its area");
			System.out.println("enter side of square");
			double side=scan.nextDouble();
			double area3=side*side;
			System.out.println("area of square having "+side+" is"+area3);
		}
		else if (choice==4)
		{
			System.out.println("you have selected rectangle to find its area");
			System.out.println("enter length of rectangle");
			double length=scan.nextDouble();
			System.out.println("enter base of rectangle");
			double base=scan.nextDouble();
			double area4=length*base;
			System.out.println("area of rectangle having"+length+"and"+base+"is:"+area4);
		}
		else if (choice==5)
		{
			System.out.println("you have selected rhombus to find its area");
			System.out.println("enter dimention1 of rhombus");
			double D1=scan.nextDouble();
			System.out.println("enter dimention2 of rhombus");
			double D2=scan.nextDouble();
			double area5=1/2.0*(D1+D2);
			System.out.println("area of rhombus having "+D1+"and "+D2+"is:"+area5);
		}
		else
		{
			System.out.println("you have selected invalid choice");
		}


	}
	 
}
