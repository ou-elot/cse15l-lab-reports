# Lab Report 5  
## Part 1: Debugging Scenario  
**1. Original Post From Student with a screenshot showing a symptom and a description of a guess at the bug/some sense of what the failure-inducing input is.**    
The post content is about the following code for adding a node to the end of a linked list:   
```
public void append(int value) {
        if(this.root == null) {
            this.root = new Node(value, null);
            return;
        }
        while(n.next != null) {
            n = n.next;
            n.next = new Node(value, null);
        }
    }
```

Post Content:
> Hi,
>   
