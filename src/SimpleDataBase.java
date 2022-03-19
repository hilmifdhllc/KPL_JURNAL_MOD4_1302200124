/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Date;


import java.text.SimpleDateFormat;
/**
 *
 * @author Hilmi Fadhillah C
 */
public class SimpleDataBase {
     private ArrayList<Double> storedData;
    private ArrayList<Date> inputDates;

    SimpleDataBase(){
        storedData = new ArrayList<Double>();
        inputDates = new ArrayList<Date>();
    }
    
    public void addNewData(Double data) {
        storedData.add(data);
        Date date = new Date();  
        inputDates.add(date);
    }

    public void printAllData(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (int i = 0; i < storedData.size(); i++) {
            System.out.printf("Data %d berisi: %.2f, yang disimpan pada waktu UTC+8: %s\n",i+1,storedData.get(i),formatter.format(inputDates.get(i)));
        }
    }

    public static void main(String[] args) {
        SimpleDataBase db = new SimpleDataBase();
        db.addNewData(13.00);
        db.addNewData(2.00);
        db.addNewData(22.00);
        db.printAllData();
    }
}
