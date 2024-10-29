package POO.comparacao;

import java.util.Objects;

public class Carro {
    String cor, marca, modelo;

    //construtor
    Carro (String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    /*
    * para que o modo de comparação equals funcione, as classes devem implementar o método equals e hashCode
    * */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(cor, carro.cor) && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, marca, modelo);
    }
}
