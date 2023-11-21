package NexusPhase2;

/**
 * 
 * 1. Word Counter

A simple project for beginners is good to start. It can be built using Swing in Java. Here, the application
tells you the no of words, the entered paragraph has. This Java application is best suited for counting
words. Remember, our childhood days when we were asked to write an essay on a given topic where
the word length should be 500 or 1000. This application comes with a feature that could help you. Along with word count, it also tells you the number of characters, words, and paragraphs it has. Also, it
is completely free to use and there’s no word count limit. 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wordcounter {
	

	

	    private static final String DEFAULT_TEXT = "Enter your text here...";
		protected static final String JOptionPane = null;

	    public static void main(String[] args) {
	        // Create the main frame
	        JFrame frame = new JFrame("Word Counter");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(500, 300);
	        frame.setLocationRelativeTo(null); // Center the frame on the screen

	        // Create the text area
	        JTextArea textArea = new JTextArea(DEFAULT_TEXT, 10, 40);
	        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
	        textArea.setLineWrap(true);
	        textArea.setWrapStyleWord(true); // Wrap words to the next line

	        // Create the count button
	        JButton countButton = new JButton("Count");
	        countButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String text = textArea.getText();
	                if (text.isEmpty()) {
	                    JOptionPane.showMessageDialog(frame, "Please enter some text to count.");
	                    return;
	                }

	                int wordCount = countWords(text);
	                int characterCount = countCharacters(text);
	                int paragraphCount = countParagraphs(text);

	                String output = "Word count: " + wordCount + "\n" +
	                        "Character count: " + characterCount + "\n" +
	                        "Paragraph count: " + paragraphCount;

	                JOptionPane.showMessageDialog(frame, output, "Word Count Results", JOptionPane.INFORMATION_MESSAGE);
	            }
	        });

	        // Create the layout
	        JPanel panel = new JPanel();
	        panel.setLayout(new BorderLayout());
	        panel.add(textArea, BorderLayout.CENTER);
	        panel.add(countButton, BorderLayout.EAST);

	        // Add the panel to the frame and display the frame
	        frame.add(panel);
	        frame.setVisible(true);
	    }

	    private static int countWords(String text) {
	        return text.split("\\s+").length; // Split on whitespace and count the resulting words
	    }

	    private static int countCharacters(String text) {
	        return text.length();
	    }

	    private static int countParagraphs(String text) {
	        return text.split("\n+").length; // Split on line breaks and count the resulting paragraphs
	    }
	}


