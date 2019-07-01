package com.stackroute.junitwork;

public class Countries {
    public String[] removeVowels(String []input){
        String result[]=new String[input.length];
        int index=0;
        for(String element:input){
            String Str="";
            for(char character:element.toCharArray()){
                if("aeiou".contains(String.valueOf(character))){
                    continue;
                }
                Str+=character;
            }
            result[index++]=Str;
        }
        return result;
    }
}
