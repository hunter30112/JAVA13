package JAVA13;

public class Class03 {

	public static void main(String[] args) {
		try                 //try區塊 檢查程式捕捉例外
		{
			int num = 12,den=0;
			int ans = num/den;
			System.out.println("ans="+ans);
		}
		catch(ArithmeticException e)  //catch區塊 如果符合捕捉例外 執行程式
		{
		System.out.println("除數為0");
		}
		finally
		{
		System.out.println("end of main() method!!");
		}

	}

}
