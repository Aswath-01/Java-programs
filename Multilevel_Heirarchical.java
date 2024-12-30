package javaprograms;



class Diagram {
    public void Shape() {
        System.out.println("Shapes");
    }
}

class Polygon extends Diagram {
    public void Shape() {
        System.out.println("All diagrams that contain multiple sides are polygons");
    }
}

class Quadrilateral extends Polygon {
    public void property() {
        System.out.println("Quadrilaterals are 4-sided polygons");
    }
}

class Square extends Quadrilateral {
    public void property() {
        System.out.println("Squares are quadrilaterals with all sides equal");
    }
}

class Parallelogram extends Quadrilateral {
    public void property() {
        System.out.println("Parallelograms are quadrilaterals with opposite sides parallel");
    }
}

public class Multilevel_Heirarchical {
    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        diagram.Shape();
Polygon polygon = new Polygon();
        polygon.Shape();
Quadrilateral quadrilateral = new Quadrilateral();
        quadrilateral.property();

        Square square = new Square();
        square.property();

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.property();
    }
}

