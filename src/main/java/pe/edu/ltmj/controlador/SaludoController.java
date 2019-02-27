package pe.edu.ltmj.controlador;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoController {

	@GetMapping
	public ResponseEntity<Map<String, String>> saludar(@RequestParam String nombre) {
		String nombreReal = Optional.ofNullable(nombre).orElse("extraño");
		Map<String, String> mapa = new HashMap<>();
		mapa.put("saludo", "Hola " + nombreReal);
		return ResponseEntity.ok(mapa);
	}
}
