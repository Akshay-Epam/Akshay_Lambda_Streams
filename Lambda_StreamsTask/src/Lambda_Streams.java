import java.util.*;
import java.util.stream.Collectors;
public class Lambda_Streams {
	 public static boolean isPalindrome(String value) {
	        
	        if (value == null || value.isEmpty())
	            return false;

	        return new StringBuilder(value).reverse().toString().equals(value);
	     }
	

	     public static void main(String []args){
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.print("Enter Choice:\n1)Average of 4 numbers\n2)To return all strings starting with \"a\" with 3 letters\n3)Return all palindromes in a given list\n");
	    	 int choice=sc.nextInt();
	    	 switch(choice)
	    	 {
	    	 case 1:
	    		 System.out.println("Average Of 4 numbers 1,2,3,4 is");
	    		 List<Integer> List = Arrays.asList(1,2,3,4);
	 	        Double average = List.stream().mapToDouble(val -> val).average().orElse(0.0);
	 	        System.out.println(average);
	 	        break;
	    	 case 2:
	    		 System.out.println("Enter the number of words to be entered");
	    		 int n=sc.nextInt();
	    		 List<String> input = new ArrayList<String>(n);
	    		 for(int i=0;i<n+1;i++)
	    		 {
	    			 String str=sc.nextLine();
	    			 input.add(str); 
	    		 }
	    	        List<String> i = input.stream().filter(l -> l.startsWith("a"))
	    	        .filter(l -> l.length() == 3)
	    	        .collect(Collectors.toList());
	    	        
	    	        for (String a : i)  
	    	        { 
	    	            System.out.println(a); 
	    	        } 
	    	        break;
	    	 case 3:
	    		 System.out.println("Enter the number of words to be entered");
	    		 int m=sc.nextInt();
	    		 List<String> newstring = new ArrayList<String>(m);
	    		 for(int j=0;j<m+1;j++)
	    		 {
	    			 String str=sc.nextLine();
	    			 newstring.add(str); 
	    		 }
	    		 System.out.println("All Palindromes are:");
	    		 List<String> p = newstring.stream().filter(l -> isPalindrome(l))
	    			        .collect(Collectors.toList());
	    			        
	    			        for (String a : p)  
	    			        { 
	    			            System.out.println(a); 
	    			        }
	    			        break;
	    			     
	    	 default:
	    		 System.out.println("choice out of range");
	    		 break;
	    		 
	    	 }
	    	 }
	       
	     }
	

