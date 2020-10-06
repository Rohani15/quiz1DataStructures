
import javax.swing.JOptionPane;

public class SharmaQ1 
{
    public static void main(String[] args) 
    {
        int n; //changed it to intItems 
        double total = 0;
        String s; boolean peasEntered = false;
        double[] price;
        String[] name;
        
        //1- input and parse  the number of items, n
        String items = JOptionPane.showInputDialog("Enter the amount of items");
        System.out.println("How many Items? " + items); 
        int intItems = Integer.parseInt(items); //converting items into an int
        
        //2-  declare 2 one dimensional parallel arrays: price and name
        String totalItems[] = new String[intItems]; // initialize the array  
        double prices[] = new double[intItems];  // storing the input values into these arrays 
       
        //3- for(int i= 0; i<n; i++) // every item
        for(int i = 0; i < intItems; i++) //looping over the integer, intItems value 
        {
            totalItems[i] = JOptionPane.showInputDialog("Enter the Item " + (i + 1)); 
            
            int newPrice = Integer.parseInt(JOptionPane.showInputDialog("Enter The Price " + (i + 1)));
            prices[i] = newPrice; 
        }
        //4- for(int i= n-1; i>=0; i--) // every item last to first    
        //Outputting the values in reverse. 
        for(int i = (intItems-1); i >= 0; i--) //had to make it [i >= 0] or the first input and price will be omitted
        {
            System.out.println("The item and the prices are " + totalItems[i] + " " + prices[i]);   
            
        }
        double average = 0; 
        double sum = 0; 
        
        for(int i = 0; i < intItems; i++)
        {
            if(totalItems[i].equalsIgnoreCase("peas")== true) // if peas is inputted, despite being upper/lowercase find the average 
            {
                sum += prices[i]; 
                total++; 
            }
        
        }
        // else output peas not entered
        average = sum / total; 
        if(total == 0)
        {
            System.out.println("No average is found");
        }
        else
        {
            System.out.println("Average price is " + average);
        }
        

    }
    
}
