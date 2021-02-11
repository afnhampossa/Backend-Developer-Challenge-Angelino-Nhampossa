package challenge.api.restfull.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import challenge.api.restfull.model.Paises;
import challenge.api.restfull.repository.PaisesRepository;

@RestController
public class PaisesController {
 
    private final PaisesRepository paisesRepository;
    public PaisesController(PaisesRepository paisesRepository){
        this.paisesRepository=paisesRepository;
    }
    

    //Retornar um país
    @GetMapping(path = "/api/paises/ver/{identififcador}")
    public Paises ver(@PathVariable("identififcador") Integer identififcador){
        
        return Paises.mapear(paisesRepository.getOne(identififcador));
    }
   
    //cadastrar um país
    @PostMapping(path="/api/paises/salvar")
    public Paises salvar(@RequestBody Paises pais){
        var p=new Paises();
        p.setCapital(pais.getCapital());
        p.setNome(pais.getNome());
        p.setRegiao(pais.getRegiao());
        p.setSub_regiao(pais.getSub_regiao());
        p.setArea(pais.getArea());
        return paisesRepository.save(p);
    }

    //Atualizar um país
    @PutMapping(path="/api/paises/actualizar/{identififcador}")
    public String actualizar(@PathVariable("identififcador") Integer identififcador,@RequestBody Paises p){
        var ver=paisesRepository.findById(identififcador);
        if(ver.isPresent()){
            var pais=ver.get();
            pais.setCapital(p.getCapital());
            pais.setNome(p.getNome());
            pais.setRegiao(p.getRegiao());
            pais.setSub_regiao(p.getSub_regiao());
            pais.setArea(p.getArea());
            paisesRepository.save(pais);
            return "Atualizado com sucesso!";
        }else{
            return "Erro! País não Encontrado.";
        }
    }

    //Retornar a lista de todos
    @GetMapping(path = "/api/paises/listar")
    public List<Paises> listar(){
        return  paisesRepository.findAll()
                .stream()
                .map(Paises::mapear) 
                .collect(Collectors.toList());
    }

    //Eliminar um país
    @DeleteMapping(path="/api/paises/apagar/{identififcador}")
    public String apagar(@PathVariable("identififcador") Integer identififcador){
        var ver=paisesRepository.findById(identififcador);
        if(ver.isPresent()){
         paisesRepository.deleteById(identififcador);
         return "Eliminado com Sucesso!";
        }else{
            return "Erro! Este país não Existe.";
        }
    }

    //ordenamento ASC
    @GetMapping(path = "/api/paises/ordenar_asc/{atributo}")
    public List<Paises> ordenar_asc(@PathVariable("atributo") String atributo){
        return  paisesRepository.findAll(Sort.by(atributo))
                .stream()
                .map(Paises::mapear) 
                .collect(Collectors.toList());
    }

    //ordenamento DESC
    @GetMapping(path = "/api/paises/ordenar_desc/{atributo}")
    public List<Paises> ordenar_desc(@PathVariable("atributo") String atributo){
        return  paisesRepository.findAll(Sort.by(atributo).descending())
                .stream()
                .map(Paises::mapear) 
                .collect(Collectors.toList());
    }
}
