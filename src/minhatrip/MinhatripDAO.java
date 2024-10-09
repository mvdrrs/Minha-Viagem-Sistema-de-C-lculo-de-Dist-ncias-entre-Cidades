package minhatrip;

public class MinhatripDAO {

    public double getDistance(String fromCity, String toCity) {
        // Exemplo de distâncias em km entre algumas cidades
        if (fromCity.equals("Porto Alegre") && toCity.equals("Rio de Janeiro")) {
            return 1150;
        } else if (fromCity.equals("Porto Alegre") && toCity.equals("Natal")) {
            return 3000;
        } else if (fromCity.equals("Porto Alegre") && toCity.equals("Fortaleza")) {
            return 2800;
        } else if (fromCity.equals("Porto Alegre") && toCity.equals("Foz do Iguaçu")) {
            return 640;
        } else if (fromCity.equals("Porto Alegre") && toCity.equals("Curitiba")) {
            return 700;
        } else if (fromCity.equals("Porto Alegre") && toCity.equals("Fernando de Noronha")) {
            return 3500; // Distância aproximada
        } else if (fromCity.equals("Porto Alegre") && toCity.equals("Gramado")) {
            return 130;
        } else if (fromCity.equals("Porto Alegre") && toCity.equals("Florianópolis")) {
            return 480;
        } else if (fromCity.equals("Porto Alegre") && toCity.equals("Holambra")) {
            return 1100; // Distância aproximada

        } else if (fromCity.equals("Natal") && toCity.equals("Rio de Janeiro")) {
            return 2700;
        } else if (fromCity.equals("Natal") && toCity.equals("Fortaleza")) {
            return 540;
        } else if (fromCity.equals("Natal") && toCity.equals("Foz do Iguaçu")) {
            return 3800; // Distância aproximada
        } else if (fromCity.equals("Natal") && toCity.equals("Curitiba")) {
            return 3100; // Distância aproximada
        } else if (fromCity.equals("Natal") && toCity.equals("Fernando de Noronha")) {
            return 350; // Distância aproximada de voo
        } else if (fromCity.equals("Natal") && toCity.equals("Gramado")) {
            return 2900; // Distância aproximada
        } else if (fromCity.equals("Natal") && toCity.equals("Florianópolis")) {
            return 2900; // Distância aproximada
        } else if (fromCity.equals("Natal") && toCity.equals("Holambra")) {
            return 3100; // Distância aproximada

        } else if (fromCity.equals("Rio de Janeiro") && toCity.equals("Fortaleza")) {
            return 2600;
        } else if (fromCity.equals("Rio de Janeiro") && toCity.equals("Foz do Iguaçu")) {
            return 1000; // Distância aproximada
        } else if (fromCity.equals("Rio de Janeiro") && toCity.equals("Curitiba")) {
            return 800; // Distância aproximada
        } else if (fromCity.equals("Rio de Janeiro") && toCity.equals("Fernando de Noronha")) {
            return 2400; // Distância aproximada
        } else if (fromCity.equals("Rio de Janeiro") && toCity.equals("Gramado")) {
            return 1300; // Distância aproximada
        } else if (fromCity.equals("Rio de Janeiro") && toCity.equals("Florianópolis")) {
            return 1200; // Distância aproximada
        } else if (fromCity.equals("Rio de Janeiro") && toCity.equals("Holambra")) {
            return 2000; // Distância aproximada

        } else if (fromCity.equals("Fortaleza") && toCity.equals("Foz do Iguaçu")) {
            return 3300; // Distância aproximada
        } else if (fromCity.equals("Fortaleza") && toCity.equals("Curitiba")) {
            return 2900; // Distância aproximada
        } else if (fromCity.equals("Fortaleza") && toCity.equals("Fernando de Noronha")) {
            return 540; // Distância aproximada
        } else if (fromCity.equals("Fortaleza") && toCity.equals("Gramado")) {
            return 3000; // Distância aproximada
        } else if (fromCity.equals("Fortaleza") && toCity.equals("Florianópolis")) {
            return 2900; // Distância aproximada
        } else if (fromCity.equals("Fortaleza") && toCity.equals("Holambra")) {
            return 3100; // Distância aproximada

        } else if (fromCity.equals("Foz do Iguaçu") && toCity.equals("Curitiba")) {
            return 630;
        } else if (fromCity.equals("Foz do Iguaçu") && toCity.equals("Fernando de Noronha")) {
            return 3800; // Distância aproximada
        } else if (fromCity.equals("Foz do Iguaçu") && toCity.equals("Gramado")) {
            return 300; // Distância aproximada
        } else if (fromCity.equals("Foz do Iguaçu") && toCity.equals("Florianópolis")) {
            return 900; // Distância aproximada
        } else if (fromCity.equals("Foz do Iguaçu") && toCity.equals("Holambra")) {
            return 1200; // Distância aproximada

        } else if (fromCity.equals("Curitiba") && toCity.equals("Fernando de Noronha")) {
            return 3000; // Distância aproximada
        } else if (fromCity.equals("Curitiba") && toCity.equals("Gramado")) {
            return 280; // Distância aproximada
        } else if (fromCity.equals("Curitiba") && toCity.equals("Florianópolis")) {
            return 300;
        } else if (fromCity.equals("Curitiba") && toCity.equals("Holambra")) {
            return 120; // Distância aproximada

        } else if (fromCity.equals("Fernando de Noronha") && toCity.equals("Gramado")) {
            return 3800; // Distância aproximada
        } else if (fromCity.equals("Fernando de Noronha") && toCity.equals("Florianópolis")) {
            return 4000; // Distância aproximada
        } else if (fromCity.equals("Fernando de Noronha") && toCity.equals("Holambra")) {
            return 3600; // Distância aproximada

        } else if (fromCity.equals("Gramado") && toCity.equals("Florianópolis")) {
            return 400; // Distância aproximada
        } else if (fromCity.equals("Gramado") && toCity.equals("Holambra")) {
            return 1500; // Distância aproximada

        } else if (fromCity.equals("Florianópolis") && toCity.equals("Holambra")) {
            return 1600; // Distância aproximada
        }

        // Se não encontrar, retorna 0
        return 0;
    }
}



