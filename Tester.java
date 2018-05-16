import java.util.Scanner;

public class Tester
{
    
    public static void main(String[] args)
    {
       
        /** 1. Declare a variable
         * Same in Java as it is in Alice - we need to give it a name and a data type.
         * Names of variables should begin with a lower case letter and avoid strange characters and spaces
         * Data types we will use in Java include: int (integer numbers - no decimals), doubles (decimal numbers), boolean (true or false) or any class type (System, String, Tester, etc)
         */
   
      
        
        
        //Now let's initialize those variables - give them a value. We don't have to repeat what data type they are - we only have to do that once per class/method
      
        
        
        
        
        /** 2. Create an obect.
        * In Alice, before we started coding, we went to the gallery and found a class (like Yeti) and dragged an object (yeti1) into the scene - this made an object
        * In Java, we make an object by using the word "new" and the name of the class we want the object from. 
        * When we make the object, it will give back to us the memory address where it is stored.  We will need a variable to store the memory address
        */ 
       
       
       
       /** 3. Call a method
        * Now that we have an object, let's do something with it!
        * In Alice, once we dragged the object into the scene, we switched to the code editor and could then select our object and drag procedures (methods) into the myFirst Method tab
        * In Java, we created our object above by "new"ing it.  We are already in our main method, which is the first method to run.  We just need the object and the method we want to call
        * Look in the Yeti class to see what methods we can call.  Let's name our Yeti!
        */
 
       
       
       //let's see if it worked. Let's ask the Yeti class to give us back the name for our object, and we will print it out.
   
       
       
       /** 4. Gather user input
        * Now, let's let the user enter in a name to name our Yeti
        * First, we have to "import" or tell Java that we want to use its Scanner class and to load it into memory.  Go to the very top of this class and make the first line: 
        * import java.util.Scanner;
        */
       
       //Next, we need to make an object of the scanner class so we can use its methods to read user input off of the console window. Just always use this line of code. Kinda of
       //like always just using public static void main(String[] args).  You just do it and don't ask any questions at this point.
      
       
       //Next, let's prompt the user for the information we want
       
       
       //Next, we will create a variable to hold the user input (String name) and then read in the data (in.nextLine() for strings, in.nextInt() for integers, in.nextDouble() for decimals
       
       
       //Now, we will change the name of our yeti to what the user wanted by calling a method of our Yeti class
      
       
       //let's see if it worked. Let's ask the Yeti class to give us back the name for our object, and we will print it out.
       
       
       //Next, let's ask it for an age and set that;
       
       
         
       
       /** 5. an if statement
        * Let's do an if statement in Java.  If our yeti is 13, we will say he is a new teen, if he is older than 13, we will print out that the yeti is a teenager, 
        * else the yeti is a child.
        * When comapring numbers in Java, use ==
        */
       
      
       
       
       
      
      
      /** 6. a for loop
       * In Alice, it was the count control statement
       * In Java, it is the for loop.
       * The for loop has three parts: the value to start with (int i = 1;) the condition to check it true to keep looping (i < 10) and the update to the counter (i = i + 1 )
       */
        
      //Let's make a message from our yeti print to the screen 3 times
    
      
      
    }
}