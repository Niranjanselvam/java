import java.util.*;
class stack{
    char[] arr;
    int size;
    int top=-1;
    stack(int size){
        this.size=size;
        arr=new char[size];
    }
    public void push(char ch){
        arr[++top]=ch;
    }
    boolean isEmpty(){
        return top==-1;
    }
}
public class Main{
    static boolean isValid( String str){
        stack s=new stack(str.length());
        int digitcount=0;
        int dotcount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch=='+'||ch=='-')&&i==0){
                s.push(ch);
               
            }else if(ch>='0' && ch<='9'){
                s.push(ch);
                digitcount++;
            }else if(ch=='.'){
                dotcount++;
                if(dotcount>1)
                    return false;
                s.push(ch);        
            }    
           
            else{
                return false;  //
            }
           
        }
        return digitcount>0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(isValid(str)){
            System.out.println("Valid Number");
        }else{
            System.out.println("Not a valid number");
        }
    }
}