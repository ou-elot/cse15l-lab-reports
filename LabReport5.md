# Lab Report 5  
## Part 1: Debugging Scenario  
The files and directories referenced are from https://github.com/lim-rachel/stringsearch, the repository used for skill demo 1 accessible on prarielearn.   

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
> What is new on that line that the NumberSearch server we used in lab didn't have? Afterwards, try to find what that argument is supposed to look like using the contents of the StringServer.java file.

