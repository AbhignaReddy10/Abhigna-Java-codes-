class Kingdom{
void rule()
{
System.out.println("the kingdom is being ruled...");
Kingdom k= new Kingdom();
k.rule();
}
}
class King extends Kingdom {
void protect()
{
System.out.println("the kingdom is being protected");
King francis= new King();
francis.rule();
}
}
class Prince extends King{
public static void main(String[] args) 
{
Prince charles= new Prince();
charles.protect();
charles.rule();
}
}