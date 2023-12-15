public class Personne  implements Comparable<Personne>{
    private int id;
    private String nom,prenom;

    public Personne(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

   @Override
    public boolean equals(Object obj) {
        if(obj==this)return true;
        if(obj==null)return false;
        if(obj.getClass()!=this.getClass())
            return false;
        Personne p=(Personne)obj;
        if(p.id==id&&p.nom.equals(nom)&&prenom.equals(p.prenom))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
       // return 5;
        return id+nom.hashCode()+prenom.hashCode();
    }

    @Override
    public int compareTo(Personne o) {
        return this.nom.compareTo(o.nom);
    }
}
