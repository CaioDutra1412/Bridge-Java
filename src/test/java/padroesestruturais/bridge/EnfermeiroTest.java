package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnfermeiroTest {

    @Test
    void retornarSalarioTecnicoEnfermagem() {
        Especialidade especialidade = new TecnicoEnfermagem();
        Enfermeiro enfermeiro = new Enfermeiro(1000.0f);
        enfermeiro.setEspecialidade(especialidade);
        assertEquals(1000.0f, enfermeiro.calcularSalario(), 0.0f);
    }

    @Test
    void retornarSalarioAuxiliarenfermagem() {
        Especialidade especialidade = new AuxiliarEnfermagem();
        Enfermeiro enfermeiro = new Enfermeiro(1000.0f);
        enfermeiro.setEspecialidade(especialidade);
        assertEquals(1100.0f, enfermeiro.calcularSalario(), 0.01f);
    }

    @Test
    void retornarSalarioEnfermeiroChefe() {
        Especialidade especialidade = new EnfermeiroChefe();
        Enfermeiro enfermeiro = new Enfermeiro(1000.0f);
        enfermeiro.setEspecialidade(especialidade);
        assertEquals(1200.0f, enfermeiro.calcularSalario(), 0.2f);
    }

}