/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import view.*;

/**
 *
 * @author Ameer.Nasser88
 */
public class LoadGame {

    public static void saveMaze(int[][] load) throws IOException {

        //  int[][] maze = load;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 30; i++)//for each row
        {
            for (int j = 0; j < 30; j++)//for each column
            {
                builder.append(load[j][i]);
                if (j < load.length - 1) {
                    builder.append(" ");
                }
            }
            builder.append(System.getProperty("line.separator"));//append new line at the end of the row

        }
        builder.append(GameplayController.health);
        builder.append(System.getProperty("line.separator"));//append new line at the end of the row
        builder.append(GameplayController.score);
        builder.append(System.getProperty("line.separator"));//append new line at the end of the row
        builder.append(GameplayController.bullets);

        BufferedWriter writer = new BufferedWriter(new FileWriter("loadGame.txt"));

        writer.write(builder.toString());
        writer.close();
    }
}
