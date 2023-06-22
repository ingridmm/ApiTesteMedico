package med.voll.api.controller;

import med.voll.api.paciente.DadosCadastraisPacientes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastraisPacientes dadosPacientes){
        System.out.println(dadosPacientes);
    }
}
