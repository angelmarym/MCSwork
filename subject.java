import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import packages.*;


class subject
{
         public static void main(String[] args) throws IOException {
            String  sub;
            Scanner get = new Scanner(System.in);
            strings welc = new strings();
            welc.stringbuffer();
            System .out.println("Enter the subject name");
            sub = get.nextLine();
            //command-line argument
            if(args.length>0){
                thr t = new thr(); 
                t.start();
	        attend <String> Obj = new attend<String>(sub,args[0]);
            }
            else{
                Thread r = new Thread(new runs()); 
                r.start();
		attend <String> Obj = new attend<String>(sub);
            }  
           welc.stri();
         }
}