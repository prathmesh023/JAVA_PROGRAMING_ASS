//Demo code using class and object

import java.lang.*;
class Demo{           //characteristics + Behaviours
      //data members
      int iNo;
      int iNo2;
      int iNo3;

      //members functions
      public void fun()
      {
        System.out.println("Inside Demo class and inside fun");
      }
      public void fun2()
      {
        System.out.println("Inside Demo class and inside fun2");
      }
    }

    class Demo_class_obj{
        public static void main(String args[])
        {
            //create object
            Demo dobj=new Demo();
            dobj.iNo=10;
            dobj.iNo2=20;
            dobj.iNo3=30;

            //call function using object
            dobj.fun();
            dobj.fun2();
            System.out.println("Inside Myclass");
        }
}