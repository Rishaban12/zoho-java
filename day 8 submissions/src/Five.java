class cloneMethod implements Cloneable{
    int[] arr=new int[3];
    public Object clone() throws CloneNotSupportedException{
        /*cloneMethod copy=(cloneMethod) super.clone();
        copy.arr=arr.clone();
        return copy;*/
        return super.clone();
    }
}

public class Five {
    public static void main(String[] args) throws CloneNotSupportedException {

        cloneMethod obj1 = new cloneMethod();
        cloneMethod obj2 = (cloneMethod) obj1.clone();
        obj1.arr[0] = 100;
        System.out.println(obj2.arr[0]);
        obj2.arr[1]=500;
        System.out.println(obj1.arr[1]);
    }
}
