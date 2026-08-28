
public class GradeBook {
    
    private double marks;
    private String CGPA;
    private String coursename;
    
    public GradeBook(String coursename,double marks){
        
        this.coursename=coursename;
        this.marks=marks;
        this.CGPA=null;
        
    }
    
    public void setcourse(String cn)
    {
        coursename=coursename;
    }
        
    public String getcourse()
    {
        return coursename;
        
    }
    
    public void setmaks(double marks){
        
        if(marks>=0&&marks<=100)
        {
            this.marks=marks;
        }
            
        else
        {
            System.out.println("invalid marks,marks should be between 0 and 100");
        }
    }
    
        public double getmarks(){
        
            return marks;
        }
    
        public void calculateCGPA(){
            
            if(marks>90)
            {
                CGPA="A";
            }
                
            else if(marks>=80)
            {
                CGPA="B";
            }
                
            else if(marks>=70)
                {
                    CGPA="C";
                }
                
            else if(marks>=60)
            {
                CGPA="D";
            }
                
            else if(marks>=50)
                {
                    CGPA="E";
                }
                
            else if(marks<=50)
            {
                CGPA="FAIL";
            }
        }
    
        public String displayinformation(){
            
            calculateCGPA();
            
            return
                    "course:"+coursename+
                    "\nmarks:"+marks+
                    "\nCGPA:"+CGPA;
        }
        
            public static void main(String[]args){
                
                GradeBook g1=new GradeBook("oop",40);
                GradeBook g2=new GradeBook("AI",88);
                GradeBook g3=new GradeBook("SE",77);
                
                System.out.println(g1.displayinformation());
                
                System.out.println("\n");
                
                System.out.println(g2.displayinformation());
                
                 System.out.println("\n");
                
                System.out.println(g3.displayinformation());
                
            }
    
        }
    
    

    
    

