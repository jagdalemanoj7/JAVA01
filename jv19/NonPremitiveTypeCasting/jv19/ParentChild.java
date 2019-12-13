package jv19;

public class ParentChild {
 
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        p.OnlyParentShow();
        System.out.println(p.x);
        
    }
}
