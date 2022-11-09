package objectinobject;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestJsonParsing {
    public static void main(String[] args) throws IOException {
        //Itwillreadallthedatainttheformofbytesthatiswhyimcreatingherebyte
        byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\PragatiSharma\\IdeaProjects\\ObjectOfObjectWithPojoClass\\src\\test\\java\\objectinobject\\data.json"));
        ObjectMapper mapper = new ObjectMapper();
        Information information = mapper.readValue(jsonData, Information.class);
        System.out.println("Name is"+"  "+information.getFirstname());
        System.out.println("Lastname is"+" "+information.getLastname());
        System.out.println("State is"+" "+information.getAddress().getState());
        System.out.println("country is"+" "+information.getAddress().getCountry());
        System.out.println("district is "+" "+information.getAddress().getAbc().getDistt());
        System.out.println("Pincode is "+" "+information.getAddress().getAbc().getPin());
    }
    }
