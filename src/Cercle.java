public class Cercle extends Form{

    double rayon ;

    public Cercle(String color, double rayon) {
        super(color);
        System.out.println("Constructeur de la classe Cercle est appelé");
        this.rayon = rayon;
    }

    @Override
    double surface() {
        return Math.PI*Math.pow(rayon,2);
    }

    @Override
    public String toString() {
        return "La couleur de la cercle est " +super.color + "et la surface est : "+ surface();
    }
}
