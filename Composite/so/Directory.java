package so;

import java.util.ArrayList;

//composite
public class Directory implements AbstractFile
{
	
	private String nome;
    private ArrayList<AbstractFile> aFile = new ArrayList<AbstractFile>();
	
    public Directory(String nome)
    {
        this.nome = nome;
    }
    
    public void adicionar(AbstractFile obj)
    {
        this.aFile.add(obj);
    }
    
    public void remover(AbstractFile obj)
    {
        this.aFile.remove(obj);
    }
    
    
    public void listar()
    {
        System.out.println(this.nome); 
        System.out.println("");
        for (AbstractFile file : aFile) {
        	System.out.print("Em " + nome + " temos: ");
            file.listar();            
        }        
                
    }
    
}