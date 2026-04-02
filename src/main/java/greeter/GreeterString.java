package greeter;

interface GreeterString {
    public String greeting();
}
class DefaultGreeterString implements GreeterString {
    public String greeting() {
        return "Hello.";
    }
}
class IntimateGreeterString implements GreeterString {
    public String greeting() {
        return "Hello Darling!";
    }
}
class FormalGreeterString implements GreeterString {
    public String greeting() {
        return "Good evening, sir.";
    }
}
class CasualGreeterString implements GreeterString {
    public String greeting() {
        return "Sup bro?";
    }
}