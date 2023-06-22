package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastraisPacientes(String nome, String email, DadosEndereco endereco) {
}
