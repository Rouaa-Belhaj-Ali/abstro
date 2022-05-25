abstract class Form {


    String color ;

    // abstarct methods
    abstract  double surface();
    public abstract String toString();

    public Form(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }
}
