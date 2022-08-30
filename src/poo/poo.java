/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author adriano.camargo
 */
public class poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro meuCarro = new Carro();
        
        meuCarro.setCor("Preto");
        meuCarro.setPlaca("MMM0253");
        meuCarro.setTipo("Gol");
        meuCarro.setnumPortas(4);
        System.out.println("---------Carro------");
        System.out.println("Cor "+meuCarro.getCor());
        System.out.println("Nº Portas "+meuCarro.getnumPortas());
        System.out.println("Placa "+meuCarro.getnumPortas());

    }
    
}
