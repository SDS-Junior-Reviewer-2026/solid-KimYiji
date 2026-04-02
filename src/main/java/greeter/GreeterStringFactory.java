package greeter;

public class GreeterStringFactory {
    //factory
    public static GreeterString create(String formality) { //걍 ifelse문 써도 됨.
        switch (formality) {
            case "formal":
                return new FormalGreeterString();
            case "casual":
                return new CasualGreeterString();
            case "intimate":
                return new IntimateGreeterString();
            case "default":
                return new DefaultGreeterString();
            default:
                throw new IllegalArgumentException("Invalid formality: " + formality);
        }

    }
}