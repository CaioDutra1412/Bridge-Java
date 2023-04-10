package padroesestruturais.bridge;

public class Enfermeiro extends Cargo {

    public Enfermeiro(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {return this.salarioBase * (1 + this.especialidade.percentualAumento());}
}
