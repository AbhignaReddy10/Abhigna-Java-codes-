    class SuperKeyWord {
    public static void main(String args[])
    {
    Flower f= new Flower();
    f.deco();
    }
    }
    class Lily {
    String a= "lily";
    }
    class Flower extends Lily{
    String a ="rose";
    
    public void deco()
    {
    System.out.println("name of the flower :"+a);
    System.out.println("name of the flower:"+super.a);
    }
}

