import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        HashSet set=new HashSet();

        set.add("AL7");
        set.add(5);
        set.add("test");
        set.add(1.2);
        set.add("AL7");
        set.add(5);
        System.out.println(set.size());
        System.out.println(set);

        HashSet<Personne> hashper=new HashSet<>();

        Personne p1=new Personne(1,"ben fadhel","sana");
        Personne p2=new Personne(2,"hjiri","wiem");
        Personne p3=new Personne(3,"Fodha","mouna");
        Personne p4=new Personne(2,"hjiri","wiem");
        Personne p5=new Personne(3,"Fodha","mouna");
        hashper.add(p1);
        hashper.add(p2);
        hashper.add(p3);
        hashper.add(p4);
        hashper.add(p3);
        System.out.println(hashper.size());
        System.out.println(hashper);

        System.out.println(hashper.contains(p5));//hashcode et equals
        System.out.println(hashper.remove(p5));//hashcode et equals
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        System.out.println(p5.hashCode());
        System.out.println(hashper);
        for (Personne p:hashper)
            System.out.println(p);

        //Créer un TreeSet de interge , ajouter de valeur puis afficher
        TreeSet<Integer> trein=new TreeSet<>();
        trein.add(6);
        trein.add(8);
        trein.add(3);
        System.out.println(trein);
        TreeSet<Integer> trein1=new TreeSet<>(Collections.reverseOrder());
        trein1.addAll(trein);
        System.out.println(trein1);
        //Créer un TreeSet de String , ajouter de valeur puis afficher
        TreeSet<String> trest=new TreeSet<>();
        trest.add("test");
        trest.add("abc");
        trest.add("Abc");
        System.out.println(trest);
        TreeSet<String> tres1=new TreeSet<>(Collections.reverseOrder());
        tres1.addAll(trest);
        System.out.println(tres1);
        //Créer un TreeSet de personne , ajouter de valeur puis afficher
        TreeSet<Personne> trep=new TreeSet<>();//Comparble personne
        trep.add(p5);
        trep.addAll(hashper);
        System.out.println(trep);

        TreeSet<Personne> trrr=new TreeSet<>(new TriId());
        trrr.addAll(trep);
        System.out.println(trrr);

    }
}
