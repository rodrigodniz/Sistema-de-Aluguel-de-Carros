package labds.alugacar.controller;

import labds.alugacar.ORM.Agente;
import labds.alugacar.ORM.Cliente;
import labds.alugacar.ORM.Usuario;
import labds.alugacar.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/agente")
    public ResponseEntity<Agente> cadastrarAgente(@RequestBody Agente agente) {
        Usuario savedAgente = usuarioRepository.save(agente);
        return ResponseEntity.ok((Agente) savedAgente);
    }

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente) {
        Usuario savedCliente = usuarioRepository.save(cliente);
        return ResponseEntity.ok((Cliente) savedCliente);
    }
}
