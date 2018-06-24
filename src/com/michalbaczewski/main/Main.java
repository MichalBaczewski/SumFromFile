package com.michalbaczewski.main;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FilesWorker worker = new FilesWorker();
        List<Integer> integerList = new LinkedList<Integer>();
        List<Integer> sumList = new LinkedList<Integer>();
        integerList = worker.fileToList("src/com/michalbaczewski/main/numbers.txt");
        sumList = worker.sumFromList(integerList);
        System.out.println(sumList);
    }

}
