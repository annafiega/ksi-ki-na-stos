import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Books{
    String title;
    String author;
    int year;

    // constructor with arguments
    public Books(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // toString method used for printout the object
    public String toString(){
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    // getters
    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}

class App
{
    public static void main (String[] args) throws java.lang.Exception
    {
        LinkedList<Books> theList = new LinkedList<Books>();
        theList.add(new Books("Assassins' Creed the Book", "William Shakespeare", 2016));
        theList.add(new Books("Book of jungle", "Rudyard Kipling", 1894));
        theList.add(new Books("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572));
        theList.add(new Books("W rajskiej dolinie wsrod zielska","Hugo-Bader",2011));
        theList.add(new Books("Jadac do Babadag", "Andrzej Stasiuk",2002));

        ArrayDeque<Books> theBooks = new ArrayDeque<Books>();
        for (int n=0;n<theList.size();n++){
            Books currentBook=theList.get(n);
            theBooks.push(currentBook);
        }

       /*
        Iterator<Books> iteratorTheList = theList.iterator();
        while(iteratorTheList.hasNext()){
            Books currentBook = iteratorTheList.next();
            theBooks.push(currentBook);
        }

/*

pushowanie do kolejki jest w 54 linije. Zamiast dodawać do LinkedListy dodawaj(czyli pushuj) od razu do ArrayDeque<Books> theBooks,
		*/

        // Check size of the queue
        System.out.println("Queue is filled. It's size: " + theBooks.size());
        System.out.println();


        Books temporaryBook=null;
        while (theBooks.peek() != null) {
            temporaryBook= theBooks.pop();
        }

        // Check size of the queue
        System.out.println("Queue is emptied. It's size: " + theBooks.size());
        System.out.println();
        // Check what was taken as last
        System.out.println("Last book taken from queue was:\n" + temporaryBook);
        //System.out.println();
    }
}
