package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    void retornarSalarioMedicoClinicoGeral() {
        Especialidade especialidade = new ClinicoGeral();
        Medico medico = new Medico(2000.0f);
        medico.setEspecialidade(especialidade);
        assertEquals(2200.0f, medico.calcularSalario(), 0.1f);
    }

    @Test
    void retornarSalarioMedicoCirurgiao() {
        Especialidade especialidade = new Cirurgiao();
        Medico medico = new Medico(2000.0f);
        medico.setEspecialidade(especialidade);
        assertEquals(2400.0f, medico.calcularSalario(), 0.02f);
    }

    @Test
    void retornarSalarioMedicoEspecialista() {
        Especialidade especialidade = new Especialista();
        Medico medico = new Medico(2000.0f);
        medico.setEspecialidade(especialidade);
        assertEquals(2600.0f, medico.calcularSalario(), 0.03f);
    }

}