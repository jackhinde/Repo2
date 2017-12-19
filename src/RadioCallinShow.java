
public class RadioCallinShow {

    public static void main(String[] args) {
        LinkedQueue phoneline = new LinkedQueue();
        System.out.println("The lines are open");
        System.out.println("Currently we have " + phoneline.size() + " callers waiting");
        System.out.println("3 calls are coming in");
        phoneline.enqueue(new Caller("Jim"));
        phoneline.enqueue(new Caller("Amy"));
        phoneline.enqueue(new Caller("Susan"));
        System.out.println("The next caller will be " + phoneline.peekFront());
        System.out.println("We are now talking with " + phoneline.dequeue());
        System.out.println("Currently we have " + phoneline.size() + " callers waiting");
        System.out.println("2 more people have called in and are on hold..");
        phoneline.enqueue(new Caller("Josh"));
        phoneline.enqueue(new Caller("Sara"));
        System.out.println("Let's take the new call - this is: " + phoneline.dequeue());
        System.out.println("We've run out of time, let's clear the lines and sy a quick hi to everyone");
        while(phoneline.size()>0){
            System.out.println("Hello " + phoneline.dequeue() + " thanks for calling");
        }
        System.out.println("Curretly we have " + phoneline.size() + " callers waiting");
    }
    
}
