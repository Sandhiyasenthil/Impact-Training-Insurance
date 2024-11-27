//single inheritance

package com.demoproject;

class employee{
	String empName;
	int empId;
	public void empDetails(String ename,int id)
	{
		this.empName=ename;
		this.empId=id;
//		System.out.println(empId);
		
	}
}
class Manager extends employee{
	String manPosition;
	public void managerDetails(String mPos)

	{
		this.manPosition=mPos;
		System.out.println("////SINGLE INHERITANCE/////");
		System.out.println("Name: " + empName + ", ID: " + empId + ", Position: " + manPosition);
	
}
}



//multilevel Inheritance

class employees{
	String employeeName;
	int employeeId;
	public void empDetailss(String empname,int eid)
	{
		this.employeeName=empname;
		this.employeeId=eid;
		
		
	}	
}
class seniorDevlopers extends employees{
      String  SeniorName;
      public void SeDevDetails(String seDevName) {
    	  this.SeniorName=seDevName;
      }
      

		
}
class juniorDevlopers extends seniorDevlopers{
    String  juniorPosition;
    public void SetJuniorDevDetails(String juDevName) {
    this.juniorPosition=juDevName;
  	System.out.println("////MULTILEVEL INHERITANCE/////");
  	System.out.println("My Name: " + employeeName + ", My ID: " + employeeId + 
            ", My Senior Developer's Name: " + SeniorName + 
            ", My Position: " + juniorPosition);
    }
	
}

// Hierarchical Inheritance

class employee2{
	String employee2Name;
	int employee2Id;
	public void employeeDetails(String emplName,int emplId) {
		this.employee2Name=emplName;
		this.employee2Id=emplId;
		
	}
}
class HR extends employee2{
	String HRdesg;
	public void HRDetails(String hrposition) {
		this.HRdesg=hrposition;
		System.out.println("////Hierarchical INHERITANCE/////");
		System.out.println("My Name: " + employee2Name + ", My ID: " + employee2Id + 
	            ", My position: " + HRdesg);
	            
	
	
}
}
class Tester extends employee2{
	String testdesg;
	public void testerDetails(String testposition) {
		this.testdesg=testposition;
		System.out.println("My Name: " + employee2Name + ", My ID: " + employee2Id + 
	            ", My position: " + testdesg);
	           
}
	
}



//HYBRID INHERITANCE
class Employee5{
	int empl_id;
	String empl_name;
	void EmployeeDetails(int empl_id, String empl_name) {
		this.empl_id = empl_id;
		this.empl_name = empl_name;
	}
}
class Manager1 extends Employee5{
	String manager = "Sandhya";
}
 
class Developer2 extends Manager1{
	String dept = "Developer";
}
class JavaDeveloper extends Developer2{
	String position1;
	void JavaDeveloperDetails(String position){
		this.position1 = position;
		System.out.println("////Hybrid INHERITANCE/////");
		System.out.println(empl_id + " - " + empl_name + " - " + manager +  " - " + dept + " - " + position1);
	}
}
class ReactDeveloper extends Developer2{
	String position2;
	void ReactDeveloperDetails(String position){
		this.position2 = position;
		System.out.println(empl_id + " - " + empl_name + " - " + manager +  " - " + dept + " - " + position2);
	}
}

	

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Manager manager=new Manager();
       manager.empDetails("sankar",25);
       manager.managerDetails("Senior manager");
       juniorDevlopers  junior=new juniorDevlopers ();
       junior.empDetailss("sandhiya",87);
       junior.SeDevDetails("SANKAR");
       junior.SetJuniorDevDetails("hbdvjrv");
       Tester tester=new Tester();
       tester.employeeDetails("dharani",90);
       tester.testerDetails("Tester");
       HR hr=new HR();
       hr.employeeDetails("SANTHOSH",90);
       hr. HRDetails("HR");
       JavaDeveloper j = new JavaDeveloper();
		j.EmployeeDetails(3 , "siva");
		j.JavaDeveloperDetails("Java Developer");
		
		ReactDeveloper r = new ReactDeveloper();
		r.EmployeeDetails(66 , "tharani");
		r.ReactDeveloperDetails("React Developer");
       
       
       }
}
                                                                                        