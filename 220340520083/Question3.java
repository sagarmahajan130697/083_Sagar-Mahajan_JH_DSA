public class Stack
{
 static int top1 = -1;
   static int stack1Size;
   static int stack2Size;
   static int top2;
   static int max = stack1Size + stack2Size;
   static int arr[];

    static boolean isEmpty1(){
        return(top1<0);
    }

    static boolean isFull1(){
        return (top1 >= stack1Size-1);
    }

    static void push1(int value)
    {
        if(isFull1())
        {
            System.out.println("stack is full");
        }
        else
        {
            arr[++top1] = value;
            System.out.println("push1 : "+value);
            return;
        }
    }
    static void pop1()
    {
        int value;
        if(isEmpty1())
        {
            System.out.println("stack is empty");
        }
        else
        {
            value = arr[top1--];
            System.out.println("pop1 : "+value);
        }
    }

    static void display1(){
        System.out.print("Stack 1 is : ");
        for(int i=0; i<=top1; i++)
            System.out.print(arr[i]+" ");
    }
    
 
    
    static boolean isEmpty2(){
        return(top2<stack1Size);
    }

    static boolean isFull2(){
        return (top2 >= max-1);
    }

    static void push2(int value)
    {
        if(isFull2())
        {
            System.out.println("stack 2 is full");
        }
        else
        {
            arr[++top2] = value;
            System.out.println("push2 : "+value);
            return;
        }
    }
    static void pop2()
    {
        int value;
        if(isEmpty2())
        {
            System.out.println("stack 2 is empty");
        }
        else
        {
            value = arr[top2--];
            System.out.println("pop Stack 2 is  : "+value);
        }
    }

    static void display2(){
    	System.out.print("Stack 2 is : ");
        for(int i=stack1Size+1; i<=top2; i++)
            System.out.print(arr[i]+" ");
    }