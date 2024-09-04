package calc.modelo;
// toda interface tem como publico todos os metodos
// nao precisa colocalos de forma explicita 
@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterado(String novoValor);
}
