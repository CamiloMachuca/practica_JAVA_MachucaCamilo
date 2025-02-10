
public class Doctor {
    static int id;
    String name;
    String speciality;
    
    // comportamientos
    public void showName(){
        System.out.println(name);
    }
    Doctor(){
        id++;
    }
    public void showId(){
        System.out.println("El id del doctor es"+ id);
    }
}
