//Question 2.2

//To generate a Diamond Pattern Design in Java Using Conditional Statements

package answer_2_2;


public class Diamond_Pattern_Generation_Using_Nested_Loops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numberOfColumn=1;//To print the number of elements in the row
		int numberOfspaces=3;//To get the spaces 
		
		
		for(int i=1;i<=5;i++){
			int k=0;
			
			/*To get the number of spaces printed  */
			for(int j=1;j<=numberOfspaces;j++){
				System.out.print(" ");  
			}
			
			/*For printing the first half of the diamond*/
			if(i<4){
			for(int j=1;j<=numberOfColumn;j++){
				if(j<=i){
					k=k+1;	
				}
				else{
					k=k-1;
				}
				
				if(k==1){
					System.out.print("a");
				}
				else if(k==2){
					System.out.print("b");
				}
				else{
					System.out.print("c");	
				}
				}	
			}
			/*For printing the second half of the diamond*/
			else{
				for(int j=1;j<=numberOfColumn;j++){
					if(j<i/2 +1){
						k=k+1;	
					}
					else{
						k=k-1;
					}
				
					if(k==1){
						System.out.print("a");
					}
					else if(k==2){
						System.out.print("b");
					}
					else{
						System.out.print("c");	
					}
					
					}
			}
		System.out.println();
		
		if(i<3){
			numberOfColumn=numberOfColumn+2;
			numberOfspaces=numberOfspaces-1;	
		}
		else{
			numberOfColumn=numberOfColumn-2;
			numberOfspaces=numberOfspaces+1;	
		}
	
			
		}
	}
}


