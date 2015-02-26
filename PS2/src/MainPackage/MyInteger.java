package MainPackage;

public class MyInteger {
	
	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	public int getMyInt(){
		return this.value;
	}
	public boolean isEven(){
		return (this.value%2==0);
	}
	public boolean isOdd(){
		return (this.value%2==1);
	}
	public boolean isPrime(){
		for(int i=2; i<this.value;i++){
			if (this.value%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(int num){
		return (num%2==0);
	}
	public static boolean isOdd(int num){
		return (num%2==1);
	}
	public static boolean isPrime(int num){
		for(int i=2; i<num;i++){
			if (num%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger val){
		return (val.isEven());
	}
	public static boolean isOdd(MyInteger val){
		return (val.isOdd());
	}
	public static boolean isPrime(MyInteger val){
		return (val.isPrime());
	}
	public boolean equals(int num){
		return (num==this.value);
	}
	public boolean equals(MyInteger val){
		return (val.value==this.value);
	}
	public static int parseInt(char[] numChar){
		int numInt = 0;
		for (int i=0; i<numChar.length; i++){
			int num = 0;
			switch(numChar[i]){
				case '1':
					num = 1;
					break;
				case '2':
					num = 2;
					break;
				case '3':
					num = 3;
					break;
				case '4':
					num = 4;
					break;
				case '5':
					num = 5;
					break;
				case '6':
					num = 6;
					break;
				case '7':
					num = 7;
					break;
				case '8':
					num = 8;
					break;
				case '9':
					num = 9;
					break;
				case '0':
					num = 0;
					break;
			}
			numInt+= num*Math.pow(10, (numChar.length-i-1));
		}
		return numInt;
	}
	public static int parseInt(String numStr){
		char[] numChar = numStr.toCharArray();
		return parseInt(numChar);
	}
}
