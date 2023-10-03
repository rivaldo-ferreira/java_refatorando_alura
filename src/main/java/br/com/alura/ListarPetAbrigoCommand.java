package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ListarPetAbrigoCommand implements Command{
    @Override
    public void execute() {
        try{

            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.listarPetAbrigo();

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
