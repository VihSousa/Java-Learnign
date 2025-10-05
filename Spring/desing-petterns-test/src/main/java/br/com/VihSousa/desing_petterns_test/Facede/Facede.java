package br.com.VihSousa.desing_petterns_test.Facede;

import br.com.VihSousa.desing_petterns_test.SubSistema1.*;
import br.com.VihSousa.desing_petterns_test.SubSistema2.*;

public class Facede {
    
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.salvarCliente(nome, cep, cidade, estado);

        System.out.println("Cliente migrado com sucesso!");
    }

}
