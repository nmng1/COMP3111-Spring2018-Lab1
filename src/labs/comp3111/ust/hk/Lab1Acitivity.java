package labs.comp3111.ust.hk;

public class Lab1Acitivity {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for(int i:arr)
			sum +=i;
		
		System.out.println(String.format("Sum of the numbers is %d",sum));
		
//		int max=getMax(arr);int min=getMin(arr);
//		System.out.println("Min = "+min+"; Max = "+max);
		
	}
	
//	public static int getMax(int[] inputArray) {
//		int maxValue=inputArray[0];
//		for(int i=1;i<inputArray.length;i++)
//			if(inputArray[i]>maxValue)
//				maxValue=inputArray[i];
//		return maxValue;
//	}
//	
//	 public static int getMin(int[] inputArray){ 
//		    int minValue = inputArray[0]; 
//		    for(int i=1;i<inputArray.length;i++) 
//		      if(inputArray[i] < minValue) 
//		        minValue = inputArray[i]; 
//		       
//		    
//		    return minValue; 
//		  } 
}
