// count the total number of characters in a string 
public class Main
{
  public static void main(String[] args) 
  {    
        String str = "my name is ela.ela loves cat";    
        int count = 0;    
        System.out.println("The string is: "+str);    
        char temp;  
        for(int i = 0; i < str.length(); i++) 
        {    
            temp = str.charAt(i);
            if(temp == 'i')    
                count++;    
        }                
        
        System.out.println("Total number of characters: " + count);    
    }      
}