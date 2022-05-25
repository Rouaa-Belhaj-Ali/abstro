public class Rectangle extends Form{

    Double Longeur;
    Double Largeur;

    public Rectangle(String color, Double longeur, Double largeur) {
        super(color);
        System.out.println("Constructeur de la classe Rectangle est appelé");
        this.Longeur = longeur;
        this.Largeur = largeur;
    }

    @Override
    double surface() {
        return Largeur*Largeur;
    }

    @Override
    public String toString() {
        return "La couleur de la rectangle est " + super.color +
                " et la surface est : " + surface();
    }
}
