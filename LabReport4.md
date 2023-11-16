# Lab Report 4  
## Step 1: Log into ieng6  
I entered the following into my terminal to log into my ieng6 account: `ssh cs15lfa23gr@ieng6.ucsd.edu`  
![Image](ssh.png)  

## Step 2: Clone the git fork  
I entered the command `git clone https://github.com/ou-elot/lab7report` to clone my forked repository.  
![Image](clone.png)    

## Step 3: Run the tests, demonstrating that they fail  
First, I changed my directory to lab7report using the ls and cd commands. Once I was in the lab7report directory, I ran the command `bash test.sh` to run the java tests to show that they failed. 
![Image](fail.png)  

## Step 4 Edit the code file ListExamples.java to fix the failing test
I entered the command `vim ListExamples.java` to enter vim.
![Image](vim.png)  
Using the failed test, I knew that the error was on line 44 of the file. 
I used the command `/index1` to search for instances of index1, since in order to fix the error, I needed to change the instance of index1 on line 44 to index2. 
I pressed the n and N keys to move through the instances. Since the index1 I needed to change was the 10th instance of index1, I pressed n 9 times.  
Buttons Pressed: `<n> <n> <n> <n> <n> <n> <n> <n> <n>`
