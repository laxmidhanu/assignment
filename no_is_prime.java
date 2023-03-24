class no_is_prime {

  public static void main(String[] args) {
	  
	  int no = 17;
	  int h=0;
	  int c=0;
	  
	  h=no/2;
	  
	  if(no==0 || no==1){
		  System.out.println(no+" is not prime number");
	  }
	  else {
		  for(int i=2;i<=h;i++){
			  
			  if(no%i==0){
				  System.out.println(no+" is Not Prime Number");
				  c=1;
				  break;
			  }
		  }
		  
		  if(c==0){
			  System.out.println(no+" is Prime Number");
		  }
	  }
  }
}