/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.linkedlistadt;

import edu.upb.classes.SimpleLinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cahuc
 */
public class MainApp {

    public static void main(String[] args) {

        SimpleLinkedList list = new SimpleLinkedList();

        int input = -1;
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar \n2. Buscar \n3. Eliminar \n4. Imprimir \n0. Salir"));

            switch (input) {
                case 1:
                    int value = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
                    list.add(value);
                    break;
                case 2:
                    int index = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor buscado"));
                     {
                        try {
                            JOptionPane.showMessageDialog(null,"En la posición "+index+" está el valor: "+ list.find(index));
                        } catch (Exception ex) {
                            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;

                case 3:
                    break;
                case 4:
                    list.print();
                    break;
            }

        } while (input != 0);

    }

}
