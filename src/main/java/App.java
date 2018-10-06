import java.util.Scanner;

public class App {

    static class Member{
        
        String name;
        String age;
        String email;
        
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAge() {
            return age;
        }
        public void setAge(String age) {
            this.age = age;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

    }
    
    
    static Member [] members = new Member[100];
    
    static Scanner scan = new Scanner(System.in);
    
    static int index = 0;
    
    
    public static void main(String[] args) {
        
        prompt();
        
        print();
        
    }
    
    
    static void print() {
        
        for(int i = 0; i<index; i++) {
            
            System.out.printf("%s, %s, %s\n", members[i].getName(), 
                                             members[i].getAge() , 
                                            members[i].getEmail());
         
        }
        
    }
    
    
    static void prompt() {
        
        while(true)
        {
          Member m = new Member();
          
          System.out.print("이름:");
          m.setName(scan.nextLine());
          
          System.out.print("나이:");
          m.setAge(scan.nextLine());
          
          System.out.print("이메일:");
          m.setEmail(scan.nextLine());
          
        members[index++] = m;
          
         System.out.print("계속 입력하시겠습니까?(Y/N)");
         String yn = scan.nextLine();
         
         
         if(yn.toLowerCase().equals("n")) {
             break;
         }
                           
        }
        
    }
    
}
