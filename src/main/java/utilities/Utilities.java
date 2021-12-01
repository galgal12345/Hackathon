package utilities;

import com.opencsv.CSVReader;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

public class Utilities{

    private static Object[][] data = null;

    @DataProvider(name = "data-provider")
    public static Object[][] createData() {
        getFromCsvData("C:\\Users\\GIL\\IdeaProjects\\Hackathon\\csv-files\\data.csv");
        return data;
    }

    private static void getFromCsvData(String fileName) {

        try {
            data = new Object[5][5];
            CSVReader reader = new CSVReader(new FileReader(fileName));

            // this will load content into list
            List<String[]> li = reader.readAll();
            System.out.println("Total rows which we have is " + li.size());

            // create Iterator reference
            Iterator<String[]> i1 = li.iterator();

            // Iterate all values
            for (int j = 0 ; i1.hasNext() ; j++) {
                String[] str = i1.next();
                for (int i = 0; i < str.length; i++)
                    data[j][i] =  str[i];

            }

        } catch (Exception fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }



}




