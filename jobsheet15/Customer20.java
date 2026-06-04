public class Customer20{
    public int id;
    public String name;
    
    public Customer20(){
        
    }
    
    public Customer20(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString (){
        return " ID: " + this.id + " Nama: " + this.name;
    }
}