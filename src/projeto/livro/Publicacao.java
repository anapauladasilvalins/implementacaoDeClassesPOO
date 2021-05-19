package projeto.livro;

public interface  Publicacao {
	public abstract void abrir(); // nem sempre pode ser void 
	public abstract void fechar();
	public abstract void folhear(int pag);
	public abstract void avancarPag();
	public abstract void voltarPag(); 
}
