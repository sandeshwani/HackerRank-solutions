/*
Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a subclass of your specified return type.

Method Overriding allows a subclass to override the behavior of an existing superclass method and specify a return type that is some subclass of the original return type. It is best practice to use the @Override annotation when overriding a superclass method.

Implement the classes and methods detailed in the diagram below:

covariant-return-types.png

Your implementation is checked by a hidden Solution class, where the main method takes the name of a state and prints the national flower of that state using the classes and methods written by you.

Note: Do not use access modifiers in your class declarations.

Resources 
Covariant Return Type 
Java Covariant Type

Input Format

The hidden code checker reads a single string denoting the name of a subclass of State (i.e., WestBengal, Karnataka, or AndhraPradesh), then tests the methods associated with that subclass. You are not responsible for reading any input from stdin.

Output Format

Output is handled for you by the hidden code checker, which creates the object corresponding to the input string's class name and then prints the name returned by that class' national flower's whatsYourName method. You are not responsible for printing anything to stdout.

Sample Input

AndhraPradesh
Sample Output

Lily
Explanation

An AndhraPradesh object's yourNationalFlower method returns an instance of the Lily class, and the Lily class' whatsYourName method returns Lily, which is printed by the hidden code checker.
*/
class Flower {
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Lotus extends Flower {
    @Override
    String whatsYourName() {
        return "Lotus";
    }
}

class State {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends State {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class Karnataka extends State {
    @Override
    Lotus yourNationalFlower() {
        return new Lotus();
    }
}

class AndhraPradesh extends State {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}