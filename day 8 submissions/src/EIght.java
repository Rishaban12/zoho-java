class Students implements Cloneable{
    String name;
    int rollNo;
    String department;

    Students(String name,int rollNo,String department){
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString(){
        return "Name: "+name+"   rollNo: "+rollNo+"   departement: "+department;
    }
}

public class EIght {
    public static void main(String[] args) throws CloneNotSupportedException{
        Students obj=new Students("rishab",12,"cse");
        Students obj2=(Students) obj.clone();
        obj2.name="san";
        obj2.rollNo=11;
        System.out.println("original Object:   "+obj);
        System.out.println("Cloned Object:     "+obj2);
    }
}
