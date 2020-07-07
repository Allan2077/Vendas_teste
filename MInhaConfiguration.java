package io.gitub.allan2077;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MInhaConfiguration {

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Rodando a configuracao de desenvolvimento na maionesse do lula molusculo");
        };
    }
   
}