package greeter;

public class Greeter {
    String formality = "default";
    GreeterString greeterString;

    public void setFormality(String formality) {
        this.formality = formality;
    }

    //factory
    public static GreeterString create(String formality) {
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

    public String greet() {
        greeterString = create(formality);
        return greeterString.greeting();

    }
}