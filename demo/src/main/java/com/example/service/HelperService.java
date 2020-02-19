package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class HelperService {

    public String getReverseString(String inputString) throws IndexOutOfBoundsException{
        String[] stringArray = inputString.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=stringArray.length;i>=1;i--){
            sb.append(stringArray[i-1]).append(" ");
        }
        return sb.toString();
    }
}
