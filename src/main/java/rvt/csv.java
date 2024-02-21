package rvt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class csv {
    public void addDataToCSV(User output) 
        { 
            try(FileWriter outputfile = new FileWriter("/workspaces/spring/src/main/resources/templates/Dati/Dati.csv", true)) { 
                 
                BufferedWriter writer = new BufferedWriter(outputfile); 
    
                writer.write(output.getName() + ", " + output.getPassword() + ", " + output.getEmail() + ", " + output.getGroups() + ", " + output.getBirthday() + ", " + output.getGender() + ", " + output.isMarried() + ", " + output.getNote()); 
    
                writer.newLine();
                writer.close();
                
            } catch(IOException vException){

            }
        } 
}
