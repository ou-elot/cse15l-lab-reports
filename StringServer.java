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
        else if (url.getPath().contains("/clear")){
            str = "";
            count = 0;
            return "add strings to the list below";
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
