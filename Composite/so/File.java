package so;

// folha
class File implements AbstractFile
{
	private String nome;
	
    public File(String nome)
    {
        this.nome = nome;
    }
    
    public void listar()
    {
        System.out.println(nome);
    }

	@Override
	public void adicionar(AbstractFile obj) {
		System.out.println("Sou um folha. N�o pode ser adicionado nada a mim");		
	}

	@Override
	public void remover(AbstractFile obj) {
		System.out.println("Sou uma folha. n�o tenho nada para ser exclu�do");		
	}
    
    
}
