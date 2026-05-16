/* 
Create Base classes patient (pat-name, age, sex) and IPD (ward no, bed no, charge per day). 
Derive a class IPD-patient from these two base classes with no-of-days-admitted attribute. 6 
Write necessary member functions to. 
i) Input n records 
ii) Display all records 
iii) Search a patient by patient name.
*/
 
import java.util.Scanner;
class Patient{
    String pat_name = "";
    int age = 0;
    String sex = "";
    void inputRecord(){
        // code to input record
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter patient name: ");
        pat_name = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println ("Enter sex: ");
        sex = sc.next();
    }
    void displayRecord(){
        // code to display record
        System.out.println("Patient Name: " + pat_name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }
}
class IPD extends Patient{
    int ward_no = 0;
    int bed_no = 0;
    double charge_per_day = 0.0;
    void inputIPD(){
        // code to input IPD details
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ward number: ");
        ward_no = sc.nextInt();
        System.out.println("Enter bed number: ");
        bed_no = sc.nextInt();
        System.out.println("Enter charge per day: ");
        charge_per_day = sc.nextDouble();
    }
    void displayIPD(){
        // code to display IPD details
        System.out.println("Ward Number: " + ward_no);
        System.out.println("Bed Number: " + bed_no);
        System.out.println("Charge Per Day: " + charge_per_day);
    }
}

class IPD_Patient extends IPD { 
    int no_of_days_admitted;

    boolean searchPatient(String name){
        // code to search patient by name
        if(pat_name.equals(name)){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of records: ");
        n = sc.nextInt();
        IPD_Patient[] patients = new IPD_Patient[n];
        for(int i=0; i<n; i++){
            patients[i] = new IPD_Patient();
            patients[i].inputRecord();
            patients[i].inputIPD();
        }
        System.out.println("All records: ");
        for(int i=0; i<n; i++){
            patients[i].displayRecord();
            patients[i].displayIPD();
        }
        System.out.println("Enter patient name to search: ");
        String name = sc.next();
        boolean found = false;
        for(int i=0; i<n; i++){
            if(patients[i].searchPatient(name)==true){
                System.out.println("Patient found: ");
                patients[i].displayRecord();
                patients[i].displayIPD();
                found = true;
                break;
            }
            
        }
        if(found==false){
            System.out.println("Patient not found.");
        }
    }
}
