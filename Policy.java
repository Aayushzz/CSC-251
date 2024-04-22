public class Policy {
    /**
     * Fields for the policy
     */
    private double policyNumber;
    private String providerName; 
    private String firstName;
    private String lastName;
    private double age;
    private String smokeStatus;
    private double height;
    private double weight;
    /**
     * No arg-constructor
     */
    public Policy(){
        policyNumber = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokeStatus = "non-smoker";
        height = 0.00;
        weight = 0.00;
    }
    /**
     * Constructor that initializes all value with arguments
     * @param policyNumber
     * @param firstName
     * @param lastName
     * @param age
     * @param smokeStatus
     * @param height
     * @param weight
     */
    public Policy(double policyNumber, String providerName, String firstName, String lastName, double age, String smokeStatus, double height, double weight){
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokeStatus = smokeStatus;
        this.height = height;
        this.weight = weight;
    }
    /**
     * Mutator and Accessor for policy number
     * @param policyNumber
     */
    public void setpolicyNumber(double policyNumber){
        this.policyNumber = policyNumber;
    }
    public double getpolicyNumber(){
        return policyNumber;
    }
    /**
     * Mutator and Accessor for provider name
     * @param providerName
     */
    public void setproviderName(String providerName){
        this.providerName = providerName;
    }
    public String getproviderName(){
        return providerName;
    }
    /**
     * Mutator and Accessor for first name
     * @param firstName
     */
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getfirstName(){
        return firstName;
    }
    /**
     * Mutator and Accessor for last Name
     * @param lastName
     */
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String getlastName(){
        return lastName;
    }
    /**
     * Mutator and Accessor for age
     * @param age
     */
    public void setAge(double age){
        this.age = age;
    }
    public double getAge(){
        return age;
    }
    /**
     * Mutator and Accessor for smoke status
     * @param smokeStatus
     */
    public void setsmokeStatus(String smokeStatus){
        this.smokeStatus = smokeStatus;
    }
    public String getsmokeStatus(){
        return smokeStatus;
    }
    /**
     * Mutator and Accessor for height
     * @param height
     */
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    /**
     * Mutator and Accessor for weight
     * @param weight
     */
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getweight(){
        return weight;
    }
    public double getBMI(){
        return (weight*703)/(height*height);
    }
    public double getPrice(){
        final double baseFee = 600.00;
        double additionalFess = 0;
        double bmi = getBMI();
        if(age > 50){
            additionalFess += 75;
        }
        if(smokeStatus.equals("smoker")){
            additionalFess += 100;
        }
        if(bmi > 35){
            additionalFess += (bmi - 35) * 20;
        }
        return baseFee + additionalFess;
    }
}
