package med.voll.api.domain.usuario;

public record DadosDetalhamentoUsuario(Long id, String email) {
    public DadosDetalhamentoUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getLogin());
    }


}
