/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JOptionPane;
import sw.WSCliente;
import sw.WSCliente_Service;
import vista.Login;
import vista.Registro;
import vista.Transacciones;

/**
 *
 * @author DELL
 */
public class TestWs {

    public static String user;

    public static void main(String[] args) {
        WSCliente_Service servicio = new WSCliente_Service();
        WSCliente cliente = servicio.getWSClientePort();
        Login login = new Login();
        Transacciones transacciones = new Transacciones();
        Registro registro = new Registro();

        login.setLocationRelativeTo(null);
        login.setVisible(true);

        login.getBtnIngresar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = login.getTxtUsuario().getText();
                user = usuario;
                String contraseña = login.getTxtContrasena().getText();
                boolean validarIng = cliente.login(usuario, contraseña);
                if (validarIng == false) {
                    login.getLbMensajeIngreso().setForeground(Color.red);
                    login.getLbMensajeIngreso().setText("Usuario no existe o las credenciales son incorrectas");
                } else {
                    System.out.println("Bienvenido: " + login.getTxtUsuario().getText());
                    transacciones.setLocationRelativeTo(null);
                    transacciones.getLbNombreUser().setText("CUENTA DE USUARIO: " + usuario);
                    transacciones.setVisible(true);
                    login.dispose();
                    transacciones.getLbSaldoDisp().setText("$" + cliente.obtenerSaldo(usuario));
                }
            }
        });
        registro.getBtnRegreturn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.setVisible(true);
                registro.dispose();
            }
        });

        transacciones.getBtnTrareturn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.setVisible(true);
                transacciones.dispose();
            }
        });

        registro.getBtnNewuser().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = registro.getTxtRegisterUser().getText();
                String pass1 = registro.getTxtRegisterPass().getText();
                String pass2 = registro.getTxtRegisterPass2().getText();
                double valor = (double) registro.getSpSaldo().getValue();

                if (usuario.isEmpty() || pass1.isEmpty() || pass2.isEmpty()) {
                    registro.getLbMensajeRegistro().setText("Ingrese todos los campos");
                } else {
                    int i = cliente.validarContra(pass1, pass2);
                    if (i != 0) {
                        if (i == 1) {
                            if (cliente.crearCliente(usuario, pass2, valor)) {
                                JOptionPane.showMessageDialog(null, "Registro correcto");
                                registro.dispose();
                                login.setVisible(true);
                            } else {
                                registro.getLbMensajeRegistro().setText("El usuario ya esta registrado");
                            }
                        }else{
                            registro.getLbMensajeRegistro().setText("La contraseña es debil. \n Debe contener de 4-8 caracteres, numeros, mayusculas y minusculas");
                        }
                    } else {
                        registro.getLbMensajeRegistro().setText("Las contraseñas no coinciden");
                    }
                }
            }
        });
        login.getBtnRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registro.setLocationRelativeTo(null);
                registro.setVisible(true);
                login.dispose();
            }
        });

        transacciones.getBtnAceptar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor = (double) transacciones.getSpValor().getValue();
                if (transacciones.getRbDeposito().isSelected()) {
                    cliente.deposito(valor, user);
                    transacciones.getLbMensajeTransaccion().setText("Deposito realizado con exito");
                    transacciones.getLbSaldoDisp().setText("$" + cliente.obtenerSaldo(user));
                } else {
                    if (cliente.retiro(valor, user)) {
                        transacciones.getLbMensajeTransaccion().setText("Retiro realizado con exito");
                        transacciones.getLbSaldoDisp().setText("$" + cliente.obtenerSaldo(user));
                    } else {
                        transacciones.getLbMensajeTransaccion().setText("Saldo insuficiente");
                    }
                }
            }
        });
    }

}
