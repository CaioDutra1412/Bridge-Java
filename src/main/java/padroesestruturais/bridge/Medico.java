package padroesestruturais.bridge;

public class Medico extends Cargo {

    public Medico(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.especialidade.percentualAumento());
    }

}
