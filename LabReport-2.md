# Lab Report 2  
## Part 1: StringServer  
The below block is the code used in the file StringServer.java  

```
import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String str = "";
    int count = 0;
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "add strings to the list below";
        } else if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            count = count + 1;
            if (parameters[0].equals("s")) {
                    str = str + Integer.toString(count) + ". "+ parameters[1] + "\n";
                    return str;
            }
        } 
            return "404 Not Found!";
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
```

The below screenshots show the StringServer being run with commands.  
![Image](lab2com1.png)  
 
In the handler class that is used by StringServer, I defined a string str as ` "" ` and an integer count as `0`. The string str will be the string where the added messages are added on and returned 
and the integer count helps keep track of the current line, allowing us to print out a number and a period corresponding to what number the message is on the list of messages. 
The method called is public String handleRequest(URI url). The method takes in a URI argument, which is the URL `https://localhost5432/add-message?s=Hi%20I%20am%20Elliott`, changed from the original 
URL `https://localhost5432` as a result of user input in the search bar. When this method is called, 
an array of strings called parameters is created, which splits the contents of the query following the path based on the location of the character `=`. The contents before the `=`, which contains the query `s`,
are put into the parameters array at index 0 (`parameters[0]`), and the contents after the `=`, which contains the message `Hi I am Elliott`, are put into the parameters array at index 1 (`parameters[1]`). 
The values of str and count then change. The integer count is increased by one from 0 to 1. The string str is changed to attach the count - turned into String format by the method `Integer.toString(int)` - with a period, 
the message contained in `parameters[1]`, and then finally a new line `"\n"` to ensure the next message added does not attach in the same line. The new string str is:  
```
1. I am Elliott  
```

![Image](lab2com2.png)  
The original two variables in the handler class stay the same. String str is still originally defined as the empty string `""` and integer count is still originally defined as `0`.  These two variables will have the same behavior as in the above screenshot. The string str will be the string where the added messages are added on and returned and the integer count helps keep track of the current line, allowing us to print out a number and a period corresponding to what number the message is on the list of messages. 
The method called is the same method public String handleRequest(URI url). The method takes in a URI argument, which in the second screenshot is the URL `https://localhost5432/add-message?s=What%27s%20your%20name?`, changed from the  
URL of the first screenshot `https://localhost5432/add-message?s=Hi%20I%20am%20Elliott` as a result of user input in the search bar. When this method is called, 
an array of strings called parameters is created, which splits the contents of the query following the path based on the location of the character `=`. The contents before the `=`, which contains the query `s`,
are put into the parameters array at index 0 (`parameters[0]`) and the contents after the `=`, which contains the message `What's your name`, are put into the parameters array at index 1 (`parameters[1]`). 
The values of str and count then change. Since the code in the method handleRequest(URI url) does not reset the variables count and str, the current count is `1` and the current str is `1. I am Elliott`. The integer count is increased by one from one to two. The string str is changed to attach the count - turned into String format by the method `Integer.toString(int)` - with a period, 
the message contained in `parameters[1]`, and then finally a new line `"\n"` to ensure the next message added does not attach in the same line. The new string str is:
```
1. I am Elliott
2. What's your name?
```

## Part 2: SSH Keys 
The screenshot below shows the ls and cd commands being used to find the path to my public key on the ieng6 server.  
The path is `/home/linux/ieng6/cs15lfa23/cs15lfa23gr/.ssh/authorized_keys`
![Image](labReport2Public.png)  
The screenshot below shows the ls and cd commands being used to find the path to my private key on my own computer.  
The path is `/c/Users/ellio/.ssh/id_rsa`
![Image](labReport2Private.png)  
The screenshot below shows a successful login attempt without needing to enter a password.  
![Image](lab2NoLogin.png)  

## Part 3: Something I learned
One thing I learned was that I could store my password to my remote server account elsewhere. I also didn't know that you could add spaces in the query part of the URL and that the resulting URL would have %20 in place of the spaces. The last thing I learned was that I could hide directories by putting a period at the beginning of the directory name. 
