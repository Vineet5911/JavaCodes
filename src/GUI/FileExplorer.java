package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileExplorer extends JFrame {
    private JList<String> fileList;
    private DefaultListModel<String> listModel;

    public FileExplorer() {
        setTitle("File Explorer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        listModel = new DefaultListModel<>();
        fileList = new JList<>(listModel);
        fileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(fileList);

        JButton openButton = new JButton("Open");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openSelectedFile();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(openButton);

        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        listFiles(new File(System.getProperty("user.home")));
    }

    private void listFiles(File directory) {
        listModel.clear();

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                listModel.addElement(file.getName());
            }
        }
    }

    private void openSelectedFile() {
        String selectedFile = fileList.getSelectedValue();
        if (selectedFile != null) {
            File file = new File(selectedFile);
            if (file.isDirectory()) {
                listFiles(file);
            } else {

            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FileExplorer fileExplorer = new FileExplorer();
            fileExplorer.setVisible(true);
        });
    }
}
