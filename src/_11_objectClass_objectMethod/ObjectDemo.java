package _11_objectClass_objectMethod;

public class ObjectDemo {

    int num;
    float gpa;

    //already covered these 2
    public String toString(){
        return super.toString();
    }

    protected void finalize() throws Throwable{
        super.finalize();
    }

    public ObjectDemo(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }

    public int hashCode(){
        return super.hashCode();
    }

    public boolean equals(Object obj){
//        return super.equals(obj);
          return this.num == ((ObjectDemo)obj).num;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(23, 9.9f);
        ObjectDemo obj2 = new ObjectDemo(45, 6.7f);

        if(obj1 == obj2) //checks these 2 variables are pointing to the same object or not
        {
            System.out.println("obj1 is less than obj2");
        }

        if(obj1.equals(obj2)) //checks these 2 variables have same content  or not
        {
            System.out.println("obj1 is less than obj2");
        }

        System.out.println(obj1.getClass().getClass());
        System.out.println(obj1.hashCode()); //hashCode gives as some random number
    }


}
