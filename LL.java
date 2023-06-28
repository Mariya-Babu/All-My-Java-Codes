class LL{
    node head;
    node tail;
    class node{
        int data;
        node next;
        
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Function addFirst
    public void addFirst(int data){
        node nn=new node(data);
        if(head==null){
            head = nn;
            tail = nn;
        }
        else{
            nn.next = head;
            head = nn;
        }
    }
    //Function addLast
    public void addLast(int data){
        node nn = new node(data);
        node temp = head;
        if(head==null){
            head=nn;
            tail = nn;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = nn;
        }
    } 
    //Function removeFirst
    public void removeFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        else if (head.next==null){
            head = null;
        }
        else{
            node temp=head;
            head = head.next;
            temp.next = null;
        }
    }
    //Function removeLast
    public void removeLast(){
        if(head==null){
            System.out.println("List is empty ");
        }
        else if(head.next==null){
            head = null;
        }
        else{
            node first = head;
            node second=head;
            while(first.next!=null){
                second = second.next;
                first = first.next;
            }
            second.next = null;
        }
    }
    public void printList(){
        node temp=head.next;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        LL list=new LL();
        System.out.println("Hello World!");
        list.addFirst(1);
        list.addFirst(0);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addFirst(9);
        list.addLast(100);
        list.printList();
        list.removeLast();
        list.printList();
        list.printList();
    }
}