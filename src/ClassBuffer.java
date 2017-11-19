import java.util.Scanner;
public class ClassBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	    
        StringBuffer sb = new StringBuffer("");
        System.out.println("Initial Capacity is "+sb.capacity());
       
        System.out.print("Please enter any input:");
        Scanner s = new Scanner(System.in);
        sb.append(s.nextLine());
             
        System.out.println("capapcity after user input:"+sb.capacity());   
       
        sb.append(" Java Class");
       
        System.out.println(sb);
       
        System.out.println("New Capacity:"+sb.capacity());
        s.close();
	}
	

}