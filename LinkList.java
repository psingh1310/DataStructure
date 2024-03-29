package com.company;

public class LinkList {
    private Link first;

    //constructor
    public LinkList(){
        first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }

    public void inserFirst(int id,double dd){
        Link newLink = new Link(id , dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList()
    {
        System.out.println("List (first --> last);");
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}
