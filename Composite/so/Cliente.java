package so;

public class Cliente
{
    public static void main(String[] args)
    {
        Directory one = new Directory("dir 1"); 
        Directory two = new Directory("dir 2");
        Directory thr = new Directory("dir 3");
        
        
        File a = new File("file a");
        File b = new File("file b");
        File c = new File("file c"); 
        File d = new File("file d");
        File e = new File("file e");
        
        one.adicionar(a); // f
        one.adicionar(two); // d
        one.adicionar(b); // f
        
        two.adicionar(c); // f
        two.adicionar(d); // f
        two.adicionar(thr); // d
        
        thr.adicionar(e); // f
        
        
        
        b.remover(d);
        //two.remover(d);
        //one.remover(two);
        
        //one.listar();
    }
}
