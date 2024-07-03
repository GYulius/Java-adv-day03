package oop.diamond;
// Definirea clasei D, care implementează interfețele B și C
public class D implements B,C{

    // public class D extends B,C
    // Suprascrierea metodei methodX pentru a rezolva conflictul între B și C
    @Override
    public void methodX() {
       C.super.methodX(); // Alegerea implementării methodX din interfața C
    }

    // Metoda principală care creează o instanță a clasei D și apelează methodX
    public static void main(String[] args) {
        D d = new D();
        d.methodX();  // Apelează methodX din D, care la rândul său apelează methodX din C
    }
}

// implements e folosit pentru clase, nu pentru interfețe
// De aceea, codul // public class D extends B,C este incorect.
