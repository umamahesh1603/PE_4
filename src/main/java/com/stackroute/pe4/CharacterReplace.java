package com.stackroute.pe4;

public class CharacterReplace {
    public String replaceChar(String str)
    {
        String strdtof=str.replaceAll("d", "f");
        String strltot=strdtof.replaceAll("l","t");
        return strltot;
    }
}
