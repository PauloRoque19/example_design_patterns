/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import br.com.modelo.MouseGamer;
import br.com.modelo.Prototipo;
import br.com.modelo.TecladoGamer;

/**
 *
 * @author Paulinho
 */
public class Lojinha {
    public static void main(String[] args) {
        MouseGamer prototipoMouse = new MouseGamer();
        System.out.println(prototipoMouse.infoPeriferico());
        
        System.out.println("-------------------------------");
        Prototipo Mouse_Clone_Razer = prototipoMouse.clone();
        Mouse_Clone_Razer.setNome("Abyssus 2014");
        Mouse_Clone_Razer.setMarca("Razer");
        Mouse_Clone_Razer.setPeso("95.0 g");
        Mouse_Clone_Razer.setPreco(190.90);
        System.out.println(Mouse_Clone_Razer.infoPeriferico());
        
        System.out.println("-------------------------------");
        
        Prototipo Mouse_Clone_Redragon = prototipoMouse.clone();
        Mouse_Clone_Redragon.setNome("Cobra M711");
        Mouse_Clone_Redragon.setMarca("Redragon");
        Mouse_Clone_Redragon.setPeso("115.0 g");
        Mouse_Clone_Redragon.setPreco(109.90);
        System.out.println(Mouse_Clone_Redragon.infoPeriferico());
        
        System.out.println("-------------------------------");
        
        TecladoGamer prototipoTeclado = new TecladoGamer();
        System.out.println(prototipoTeclado.infoPeriferico());
        
        System.out.println("-------------------------------");
        
        Prototipo teclado_Gamer_Razer = prototipoTeclado.clone();
        teclado_Gamer_Razer.setNome("Black Window");
        teclado_Gamer_Razer.setMarca("Razer");
        teclado_Gamer_Razer.setPeso("1.1 kg");
        teclado_Gamer_Razer.setPreco(550.90);
        System.out.println(teclado_Gamer_Razer.infoPeriferico());
        
        System.out.println("----------------------------------");
        
        Prototipo teclado_Gamer_Redragon = prototipoTeclado.clone();
        teclado_Gamer_Redragon.setNome("Kumara");
        teclado_Gamer_Redragon.setMarca("Redragon");
        teclado_Gamer_Redragon.setPeso(" 900g");
        teclado_Gamer_Redragon.setPreco(250.90);
        System.out.println(teclado_Gamer_Redragon.infoPeriferico());
        
        System.out.println("---------------FIM DOS PRODUTOS------------");
        
        
        
        
        
    }
}
