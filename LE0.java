class Juet{
    String name;
    int age;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int x){
        this.age=x;
    }
}
public class LE0
{
	public static void main(String[] args) {
		Juet m = new Juet();
		m.setName("xyz");
		m.setAge(20);
		System.out.println("Name"+" : "+m.getName());
		System.out.println("Age"+" : "+m.getAge());
	}
}

