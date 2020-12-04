package com.filemanager;

public class SystemAPI {


    static public String getFileTextByID(int fileID){
        return ""; 
    }

    static public int []getFilesIDsByName(String fileName){
        int []toReturn = {};
        return toReturn;
    }
    
    static public boolean deleteFileByID(int fileID){
        return true; //success
    }

    static public boolean createFile(String fileName, String fileText){
        return true; //success
    }
}