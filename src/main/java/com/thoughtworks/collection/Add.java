package com.thoughtworks.collection;

//import com.sun.java.util.jar.pack.ConstantPool;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        return (leftBorder>rightBorder)?IntStream.rangeClosed(rightBorder,leftBorder).filter(
                i->i%2==0
        ).sum():IntStream.rangeClosed(leftBorder,rightBorder).filter(
                i->i%2==0
        ).sum();

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        return (leftBorder>rightBorder)?IntStream.rangeClosed(rightBorder,leftBorder).filter(
                i->i%2==1
        ).sum():IntStream.rangeClosed(leftBorder,rightBorder).filter(
                i->i%2==1
        ).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(i->i*3+2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        return arrayList.stream().map(i->(i%2==1)?i*3+2:i).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {

        return arrayList.stream().filter(i->i%2==0).collect(Collectors.averagingDouble(Integer::intValue));
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {

        return arrayList.stream().filter(i->i%2==0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
