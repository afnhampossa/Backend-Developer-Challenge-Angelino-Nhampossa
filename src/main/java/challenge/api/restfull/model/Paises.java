package challenge.api.restfull.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="paises")
public class Paises{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     public Integer identififcador;

    @Column(nullable = false, length = 200)
    public String nome;

    @Column(nullable = false, length = 200)
    public String regiao;

    @Column(nullable = false, length = 200)
    public String sub_regiao;

    @Column(nullable = false, length = 200)
    public String capital;

    @Column(nullable = false, length = 200)
    public String area;
    

    public Integer getIdentififcador(){
        return identififcador;
    }
    public void setIdentififcador(Integer identififcador){
        this.identififcador=identififcador;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getRegiao(){
        return regiao;
    }
    public void setRegiao(String regiao){
        this.regiao=regiao;
    }
    public String getSub_regiao(){
        return sub_regiao;
    }
    public void setSub_regiao(String sub_regiao){
        this.sub_regiao=sub_regiao;
    }
    public String getCapital(){
        return capital;
    }
    public void setCapital(String capital){
        this.capital=capital;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String area){
        this.area=area;
    }

    public static Paises mapear(Paises p){
        var pais=new Paises();
        pais.setIdentififcador(p.getIdentififcador());
        pais.setCapital(p.getCapital());
        pais.setNome(p.getNome());
        pais.setRegiao(p.getRegiao());
        pais.setSub_regiao(p.getSub_regiao());
        pais.setArea(p.getArea());

        return pais;
    }
}