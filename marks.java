
import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import packages.*;

final public class marks<T> extends stud
{
        //user defined type for generic
        T obj,ob;
        private static int c,i,n;
        public String st,p;
        String[] mcs = {"Angel","Nayanika","Sonali","Yashaswini","Neeraja","Keyur","Namratha","Niya","Vaishnavi","Shraavya"};
        String[] mca = {"Ratandeep","Ahasana","Harsh","Karma","Jerlyn","Sweta","Aman","Harshitha","Titus","Eshita"};
        String[][] sect = {mcs,mca};
        int[] marks = new int[10];
        Scanner get = new Scanner(System.in);
        marks(T obj){
           this.obj = obj;
           do
           {
           System.out.println("\n---------------------------");
           System.out.println(" 1    Add marks"); 
           System.out.println(" 2    DISPLAY marks");
           System.out.println(" 3    Add new students");
           System.out.println(" 4    Exit");
           System.out.println("Enter your choice:"); 
           c = get.nextInt();
           switch (c) {
             case 1:
               add();
               break;
             case 2:
               //System.out.println(this.obj);
               display(this.obj);
               break;
             case 3:
               newstd();
               break;
             case 4:
               break;    
             default:
               System.out.println("Enter the correct choice:");
               break;
            }
            }while(c != 4);
         }
 
       //constructor overloading
         marks(T obj, String st){
           this.st = st;
           this.obj = obj;
           do
           {
           System.out.println("\n-------------------------");
           System.out.println(" 1    Add marks"); 
           System.out.println(" 2    DISPLAY marks");
           System.out.println(" 3    Add new students");
           System.out.println(" 4    Exit");
           System.out.println("Enter your choice:");  
           c = get.nextInt();
           switch (c) {
             case 1:
               try {
               add(this.st);
               }catch(Exception m){System.out.println("Exception occured:"+m);}
               break;
             case 2:
               //System.out.println(this.obj);
               display(this.obj);
               break;
             case 3:
               newstd();
               break;
             case 4:
               break;    
             default:
               System.out.println("Enter the correct choice:");
               break;
            }
            }while(c != 4);
         }
         
      void add(){
          try
          {
          System.out.println("\n------------------------");
          System.out.println(" 1  -  MCS"); 
          System.out.println(" 2  -  MCA");
          System.out.println("Enter your choice:");
          i = get.nextInt();
          i = i-1;
          System.out.println("Enter number of new marks:");
          n = get.nextInt(); 
          System.out.println("Enter students' numbers:");
          for (int j = 0; j < n;j++){
               int num = get.nextInt();
               marks[j] = num;
          }
          }catch(Exception e){
              e.printStackTrace();
	   }
      }

      // method overloading
      void add(String p)throws myexception{
          this.p = p;
          System.out.println(this.p);
          if(this.p.equals("mcs")==true){
          i=0;
          }
          if(this.p.equals("mca")==true){
          i=1;
          }
          else{
          throw new myexception("Enter the correct choice");
          }
          System.out.println("Enter number of new marks:");
          n = get.nextInt();
          System.out.println("Enter students' numbers:");
          for (int j = 0; j < n;j++){
               int num = get.nextInt();
               marks[j] = num;
          }
      }

      public String newstd(){
          System.out.println("\n------------------------");
          System.out.println(" 1  -  MCS"); 
          System.out.println(" 2  -  MCA");
          System.out.println("Enter your choice:");
          i = get.nextInt();
          i = i-1;
          int j = sect[i].length +1;
          if(i==0){
          mcs[i] = super.newstd();
          }
          else{
          mca[i-1] = super.newstd();
          }
          System.out.println("The new list of marks are:");
          for (int k = 0;k <sect[i].length; k++){
               System.out.println(sect[i][k] + " ");
           }
       return null; 
      }

      void display(T ob){
          this.ob = ob;
          System.out.println("Subject:"+this.ob);
          List<String> list = new ArrayList<String>();   //collection class
          try
          {
          System.out.println("The absentees are:");
          for (int j = 0;j <n; j++){
               //System.out.println(sect[i][absent[j]] + " ");
               list.add(sect[i][marks[j]]);
           }
           Collections.sort(list);                // collection interface
           Iterator itr=list.iterator();  
           while(itr.hasNext()){  
           System.out.println(itr.next());  
           } 
           }catch(Exception e){
              e.printStackTrace();
	   }
      }
}