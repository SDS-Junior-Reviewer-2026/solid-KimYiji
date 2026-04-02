package greeter;

public class Greeter {
    String formality = "default";

    public void setFormality(String formality) {
        if(formality.equals(null)) this.formality = "default";
        else this.formality = formality;
    }

    public String greet() {
        return GreeterStringFactory.create(this.formality).greeting();
    }
}