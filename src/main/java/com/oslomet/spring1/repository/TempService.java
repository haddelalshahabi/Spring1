package com.oslomet.spring1.repository;

//Oppgave 1
//vi burker repository i dette emnet fordi den kan snakke med database
import org.springframework.stereotype.Repository;


@Repository
public class TempService {

    private final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};

    public int getTemp(String mnd){
        return switch (mnd.toLowerCase()){
            case "januar" -> tempArray[0];
            case "februar" -> tempArray[1];
            case "mars" -> tempArray[2];
            case "april" -> tempArray[3];
            case "mai" -> tempArray[4];
            case "juni" -> tempArray[5];
            case "juli" -> tempArray[6];
            case "august" -> tempArray[7];
            case "september" -> tempArray[8];
            case "oktober" -> tempArray[9];
            case "november" -> tempArray[10];
            case "desember" -> tempArray[11];
            default -> 0;
        };
    }
}