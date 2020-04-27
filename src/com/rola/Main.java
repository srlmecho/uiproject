package com.rola;

import com.rola.ui.MainFrame;

import javax.swing.*;

// TODO(nilsheumer): Add proper JavaDoc, here an for all classes and public functions (except of @Overrides) and where
// ever explanation is necessary.
// TODO(nilsheumer): Use a proper file/console logger framework to log the exceptions.
public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (Exception e) {
                e.printStackTrace();
            }
            new MainFrame().setVisible(true);
        });
    }
}
