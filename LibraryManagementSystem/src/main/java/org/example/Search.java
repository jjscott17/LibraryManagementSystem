package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search extends JFrame {
    private JPanel panel; // A holding panel
    private JLabel messageLabel; // A message to the user
    private JTextField titleTextField; // To hold user input
    private JButton searchButton; // click to search
    private final int WINDOW_WIDTH = 400; // Window width
    private final int WINDOW_HEIGHT = 200; // Window height
    public static String bookTitle; // title of the book

    /**
     Constructor
     */

    public Search()
    {
        // Set the title.
        setTitle("Search Books");
        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Build the panel and add it to the frame.
        buildPanel();
        // Add the panel to the frame's content pane.
        add(panel);
        // Display the window.
        setVisible(true);
    }

    private void buildPanel()
    {
        // Create the label, text field, and button
        messageLabel = new JLabel("Enter a book title");
        titleTextField = new JTextField(30);
        searchButton = new JButton("Search");

        // Add action listeners to the button
        searchButton.addActionListener(new ButtonListener());

        // Create a panel and add the components to it.
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(titleTextField);
        panel.add(searchButton);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            bookTitle = titleTextField.getText();
            Book book = new Book();
            if(book.searchBooks(bookTitle) == null) {
                JOptionPane.showMessageDialog(null, "Book not found.");
            } else {
                JOptionPane.showMessageDialog(null, "Book found!");
            }
        }
    }

    public static void main(String[] args) {
        new Search();
    }
}
