package modulo3_intermediario.aula10.annotations;

@InformacaoAula(
        autor = "Enzo",
        aulaNumero = 10,
        blog = "loiane.com"
)
public class Test {

    @InformacaoAula(
            autor = "Enzo",
            aulaNumero = 10,
            blog = "loiane.com"
    )
    public static void main(String[] args) {

    }
}