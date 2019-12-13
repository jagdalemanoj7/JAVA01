package jv19;

public class Parent{
    int x=10;
    void show(){
        System.out.println("parent-show");
    }
   
    void OnlyParentShow(){
        System.out.println("OnlyParentShow");
    }
}
 
class Child extends Parent{
    int x=20;
    void show(){
        System.out.println("child-show");
    }
   /* 
    void OnlyParentShow(){
        System.out.println("OnlyParentShow");
    }
    */
    void OnlyChildShow(){
        System.out.println("OnlyChildShow");
    }

}