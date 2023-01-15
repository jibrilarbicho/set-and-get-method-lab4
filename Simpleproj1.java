
package simpleproj1;
import java.util.Scanner;
public class Simpleproj1 {
private String name;
private String id;
private String dept;
 private int age;   
 private String year;   
  public Simpleproj1( String name,String id,String dept,int age,String year){
  this.name=name;    
    this. id=id;
    this.dept=dept;
    this.age=age;
    this.year=year;     
  }   
 public void setname(String name){
   this.name=name;       
 } 
 public void setid(String id){        
     this. id=id;}
 public void setdept(String dept){     
   this.dept=dept;}
    public void setage(int age){     
    this.age=age;
    }
     public void setyear(String  year){     
       this.year=year;     }
     public String getname(){
   return name;      
 } 
 public String getid(){        
    return id;}
 public String getdept(){     
   return dept;}
    public int getage(){     
    return age;
    }
     public String getyear(){     
      return year;     }
    void addinfo(String name,String id,String dept,int age, String year,Simpleproj1 s){
      s.setname(name);
       s.setid(id);
        s.setdept(dept);
        s.setage(age);
      s.setyear(year);
    } 
     
     
     
     
  void display(Simpleproj1 s){
   
   System.out.printf("%5s%8s%13s%7s%6s%n", s.getname(),s.getid(),s.getdept(),s.getage(),s.getyear());  
      
      
      
      
  }   
    
     
     
  
     
     
    public static void main(String[] args) {
        
        
        
     
     Simpleproj1 s1=new Simpleproj1("null ","null","null",0,"null");   
      Simpleproj1 s2=new Simpleproj1("null ","null","null",0,"null");     
       Simpleproj1 s3=new Simpleproj1("null ","null","null",0,"null");    
        Simpleproj1 s4=new Simpleproj1("null ","null","null",0,"null");   
       Simpleproj1 s5=new Simpleproj1("null ","null","null",0,"null"); 
       System.out.println("before information added");
        System.out.printf("%5s%10s%13s%7s%6s%n","NAME","ID","DEPARTMENT","AGE","YEAR");
       s1.display(s1);
       s2.display(s2);
      s3.display(s3);
      s4.display(s4);
      s5.display(s5);
      Scanner scan=new Scanner(System.in);
       System.out.println("ENTER YOUR CHOICE");
      System.out.println("1.To add information");
  System.out.println("2.To display information");
  System.out.println("-1 to exit");
        String name,id,dept,year;
       int age;
       String a=scan.nextLine();
        int c=Integer.parseInt(a);
 

  
  while(c!=-1){
  switch(c){
      case 1:
          
    System.out.println("enter your name");
     name=scan.nextLine();
      scan.nextLine();
     System.out.println("enter your id");
     id=scan.nextLine(); 
       System.out.println("enter your department");
     dept=scan.nextLine();    
       System.out.println("enter your age");
    int a1=scan.nextInt();
     scan.nextLine();    
      System.out.println("enter the year you entered");
      year=scan.nextLine(); 
      
   s1.addinfo(name,id,dept,a1,year,s1);
  
    break;
      case 2:
     System.out.printf("%12s%12s%13s%7s%6s%n","NAME","ID","DEPARTMENT","AGE","YEAR");      
  s1.display(s1);        
   s2.display(s2);
    s3.display(s3);        
   s4.display(s4);       
   s5.display(s5); 
          break;
      default:
      System.out.println("WRONG CHOICE");     
   } 
  
  System.out.println("1.To add information");
  System.out.println("2.To display information");
  System.out.println("-1 to exit");
  c=scan.nextInt();
  }
  
    }  
    
    
}
