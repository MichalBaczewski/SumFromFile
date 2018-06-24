package com.michalbaczewski.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FilesWorker {

    public List<Integer> fileToList(String path) throws FileNotFoundException {
        String fileToRead = path;
        File file = new File(fileToRead);
        Scanner sc = new Scanner(file);
        List<Integer> integerList = new LinkedList<Integer>();
        while (sc.hasNext()) {
            integerList.add(sc.nextInt());
        }
        System.out.println(integerList);
        return integerList;
    }

    public List<Integer> sumFromList(List<Integer> integerList) {
        List<Integer> sumList = new LinkedList<Integer>();
        sumList.add(integerList.get(0));
        for (int index = 1; index < integerList.size(); index++) {
            sumList.add(integerList.get(index) + sumList.get(index - 1));
        }
        return sumList;
    }
}
