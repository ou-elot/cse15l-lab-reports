# Lab Report 5  
## Part 1: Debugging Scenario  
The files and directories referenced are from https://github.com/lim-rachel/stringsearch, the repository used for skill demo 1 accessible on prarielearn. The NumberSearch server referenced is from week 2 lab: https://ucsd-cse15l-f23.github.io/week/week2/  

**1. Original Post From Student with a screenshot showing a symptom and a description of a guess at the bug/some sense of what the failure-inducing input is**   
Below is a hypothetical EdStem post from a student:

>Unable to run StringServer. 
>
>Hi,
> I am currently trying to write a bash script that will run StringServer.
> Below is the following bash script I have written so far and a screenshot showing the output when I run the bash script:
>```
>javac Server.java
>javac StringServer.java
>java StringServer 4000
>```
> ![Image](server.sh.png)
> I'm a little lost as to why the server isn't starting, as I'm using the same command format in lab. My current guess is that I am missing something in the java command to run the server since I don't see any compile errors in the output, so I think the files compiled correctly.  

The Symptom: Instead of being notified that the server is running on our local machine, we get an IndexOutOfBounds runtime error.  
Failure Inducing Input: `java StringServer 4000`, as shown above. 

**2. A response from a TA asking a leading question or suggesting a command to try** 
> Hi there!
> 
> You did indeed compile everything correctly. The error message shown is a runtime error, so there is something wrong with your java command. Use vim or VSCode to open StringServer.java, move to line 72, the line where the error occurs according to the output. 
>
> What is new on that line that the NumberSearch server we used in lab didn't have? Where in the file could we find what that new part is supposed to look like?

**3.Another screenshot/terminal output showing what information the student got from trying that, and a clear description of what the bug is.** 
![Image](line72.png)  
The student ran the command `vim StringServer.java` to open the file and then `:72` to move to line 72. He saw that the start command included a new StringHandler[args(1)] argument, something that was not in the NumberServer shown in lab. Using the TA's hint that the format for the StringHandler[args(1)] argument was in the same file, the student found that the constructor for StringHandler needed a path to a file.   
Below is the new bash script, an example of the student running it, and the corresponding output: 
```
javac Server.java
javac StringServer.java
java StringServer 4000 $1
```
![Image](birds.png)   
![Image](serverdge.png)   
*Note: the screenshot of the server is not the whole server and is cut off since the list of birds is too long.  
The bug: The bug was that the original bash script did not include enough parameters to run the start method. 

