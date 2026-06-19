public class Student{
    private String name;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
        public static void main(String[]args){
            Student obj=new Student();
            obj.setName("yogeshwari");
            System.out.println("Student Name:"+obj.getName());
        }
    
}
