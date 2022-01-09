package JAVA13;

public class Class05 {

	public static void main(String[] args) {
		try          //try區塊
		{
			int num = 12;
			int den[]= {12,0,3,0,0,4}; //設定陣列範圍
			for (int i=0;i<10;i++)
				System.out.println("ans="+num/den[i]);
		}
		catch(ArithmeticException e) 
		{
		System.out.println("除數為 0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("陣列註標超出了範圍");
		}

	}

}
