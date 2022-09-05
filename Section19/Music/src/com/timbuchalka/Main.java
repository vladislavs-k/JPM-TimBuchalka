package com.timbuchalka;

import com.timbuchalka.model.DataSource;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        if(!dataSource.open()){
            System.out.println("Can't open data source");
            return;
        }



        dataSource.close();
    }
}
