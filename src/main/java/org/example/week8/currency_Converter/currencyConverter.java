package org.example.week8.currency_Converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class currencyConverter extends JFrame {
    private JTextField DollarsTextField;
    private JButton convertButton;
    private JLabel convertedResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;
    //private double dollarsToEuroExchange = 0.84;
    private String Euros ="Euros";
    private  String Pounds = "Pounds";
    private  String kenyaShilling = "Ksh";

    private Map<String, Double> exchangeRates = Map.of(Euros, 0.84, Pounds, .09,kenyaShilling,127.27);
    //creating a Map to set up the exchange rates

currencyConverter(){
    setContentPane(mainPanel);
    setPreferredSize(new Dimension(500,500));
    pack();
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    currencyComboBox.addItem(Euros);// adding to the comboBox
    currencyComboBox.addItem(Pounds);//adding to the comboBox
    currencyComboBox.addItem(kenyaShilling);//adding to the comboBox

    getRootPane().setDefaultButton(convertButton);

    convertButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

                // what was type in Jfield dollarsTextField?
                String dollarString = DollarsTextField.getText();// getting the text in the textfield
                //converts to a number
            try {
                double dollars = Double.parseDouble(dollarString);//converting the text in the textfield to double
                String toCurrency = (String) currencyComboBox.getSelectedItem();//setting up a string variable to store the combobox selected
                //() is used to curse to change to string

                double exchangeRate = exchangeRates.get(toCurrency);
                //converts to euro
                double convertedValue = dollars * exchangeRate;
                //display result
                String resultString = String.format("%.2f dollars is equivalent to %.2f %s", dollars,
                        convertedValue,toCurrency);
                convertedResultLabel.setText(resultString);
            }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(currencyConverter.this, "Please enter a number " +
                        "without any $ or other characters. ");
            }

        }
    });
}

}
