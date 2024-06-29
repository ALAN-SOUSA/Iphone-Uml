package main.aparelho;

import main.modelo.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        
        // Testando métodos de AparelhoTelefonico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        // Testando métodos de NavegadorInternet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}