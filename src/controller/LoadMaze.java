/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.util.Scanner;


public class LoadMaze {
    public static int[][] maze1 = new int[8][21];
    private static String [] lines = new String[8];
    private static String[] splitedLine; 
    private static int linesNumber = 0;
    public static void load() throws FileNotFoundException{
        try {
			File file = new File("maze1.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
                                lines[linesNumber] = line;
                                linesNumber++;
			}
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
                        System.out.printf("\n\n\n");
                        for(int i=0 ; i< 8 ; i++){
                            
                            splitedLine = new String[21];
                            String[] lineInt = lines[i].split("\t");
                            for(int j=0;j<21;j++){
                                maze1[i][j] = Integer.parseInt(lineInt[j]);
                                System.out.println(maze1[i][j] + " ");
                            }
                           
                            
                          //  System.out.println("line num" + i);
                            //System.out.println(lineInt[i]);
                            
                            
                        }
                         for(int i=0 ; i<8 ; i++){
                                for(int j=0 ; j<21 ; j++){
                                    System.out.print(maze1[i][j] + " ");
                                    
                                    
                                }
                                System.out.println("");
                            }
                        
		} catch (IOException e) {
			e.printStackTrace();
		}

}
}