package modulo3_intermediario.aula10.annotations;

@interface InformacaoAula {
    String autor();

    int aulaNumero();

    String blog() default "http://loiane.com";

    String site() default "http://loiane.training";
}