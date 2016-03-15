package leetCode;

public class Add {
	public int add(int num1,int num2) {
		do{
            int n1 = num1^num2;
            int n2 = (num1&num2)<<1;
            
            num1 = n1;
            num2 = n2;
        }while(num2!=0);
        
            return num1;
    }
	
	public static void main(String[] args) {
		Add a = new Add();
		System.out.println(a.add(-1 , 2));
	}
}
