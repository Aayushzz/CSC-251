import java.util.Scanner;
public class Project_Aayush_Niroula{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int policyNumber;
        String providerName; 
        String firstName;
        String lastName;
        int age;
        String smokeStatus;
        double height;
        double weight;
        System.out.print("Please enter the Policy Number: ");
        policyNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the Provider Name: ");
        providerName = scanner.nextLine();
        System.out.print("Please enter the Policyholder's First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Please enter the Policyholder's Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("Please enter the Policyholder's Age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
        smokeStatus = scanner.nextLine();
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        height = scanner.nextDouble();
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        weight = scanner.nextDouble();
        scanner.close();
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokeStatus, height, weight);
        System.out.println("Policy Number: " + policy.getpolicyNumber());
        System.out.println("Provider Name: " + policy.getproviderName());
        System.out.println("Policyholder's First Name: " + policy.getfirstName());
        System.out.println("Policyholder's Last Name: " + policy.getlastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getsmokeStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getweight() + " pounds");
        System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
        System.out.printf("Policyholder's Price: $%.2f\n", policy.getPrice());
        
    }
}