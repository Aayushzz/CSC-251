import java.util.*; 
import java.io.*;
public class Project_Aayush_Niroula{
    public static void main(String[] args) {
        
        //read from a file 
        try {
            File file = new File("information.txt");
            Scanner inputFile = new Scanner(file);
            double policyNumber = 0.0;
            String providerName = "";
            String firstName = ""; 
            String lastName = "";
            double age = 0.0;
            String smokeStatus = "";
            double height = 0.0;
            double weight = 0.0;
            ArrayList<Policy> policies = new ArrayList<Policy>();

            while(inputFile.hasNext()){
                policyNumber = inputFile.nextDouble();
                providerName = inputFile.nextLine();
                firstName = inputFile.nextLine();
                lastName = inputFile.nextLine();
                age = inputFile.nextDouble();
                smokeStatus = inputFile.nextLine();
                height = inputFile.nextDouble();
                weight = inputFile.nextDouble();
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokeStatus, height, weight);
                if (inputFile.hasNext()){
                    inputFile.nextLine();
                }
                policies.add(policy);
            }

            inputFile.close(); // Close the scanner when done
            for(int i = 0; i < policies.size(); i++){
                System.out.println("Policy Number: " + policies.get(i).getpolicyNumber());
                System.out.println("Provider Name: " + policies.get(i).getproviderName());
                System.out.println("Policyholder's First Name: " + policies.get(i).getfirstName());
                System.out.println("Policyholder's Last Name: " + policies.get(i).getlastName());
                System.out.println("Policyholder's Age: " + policies.get(i).getAge());
                System.out.println("Policyholder's Smoking Status: " + policies.get(i).getsmokeStatus());
                System.out.println("Policyholder's Height: " + policies.get(i).getHeight() + " inches");
                System.out.println("Policyholder's Weight: " + policies.get(i).getweight() + " pounds");
                System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).getBMI());
                System.out.printf("Policyholder's Price: $%.2f\n", policies.get(i).getPrice());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }    
    }
}