class three {
	public static void main(String[] args){
		for (int i=2 ; i<=100 ; i++){
			if ( i%5==0){
				System.out.println("Buzz");
			}
			if ( i%3==0) {
				System.out.println("Fizz");
			}
			if (i%3 ==0 & i%5==0 ){
				System.out.println("Pop");
			}

			else {
				System.out.println(i);
			}
		}
	}
}

		
		