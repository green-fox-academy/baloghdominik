package com.greenfoxacademy.baloghdominik.restbackend.services;

import com.greenfoxacademy.baloghdominik.restbackend.models.ArrayHandler;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ArrayHandlerService {

    public ArrayList<Integer> Sum(ArrayHandler arrayHandler){
        ArrayList<Integer> numbers = arrayHandler.getNumbers();
        for (int i = 0; i < numbers.size(); i++) {
            Integer num = 1;
            for (int k = 2; k < numbers.get(i)+1; k++){
                num += k;
            }
            numbers.set(i, num);
        }
        return numbers;
    }

    public Integer Summery(ArrayHandler arrayHandler){
        ArrayList<Integer> numbers = arrayHandler.getNumbers();
        Integer num = 0;
        for (int i = 0; i < numbers.size(); i++) {
            num += numbers.get(i);
        }
        return num;
    }

    public Integer multiply(ArrayHandler arrayHandler){
        ArrayList<Integer> numbers = arrayHandler.getNumbers();
        Integer num = 1;
        for (int i = 0; i < numbers.size(); i++) {
            num *= numbers.get(i);
        }
        return num;
    }

    public ArrayList<Integer> Factor(ArrayHandler arrayHandler){
        ArrayList<Integer> numbers = arrayHandler.getNumbers();
        for (int i = 0; i < numbers.size(); i++) {
            Integer num = 1;
            for (int k = 2; k < numbers.get(i)+1; k++){
                num *= k;
            }
            numbers.set(i, num);
        }
        return numbers;
    }

    public ArrayList<Integer> TwoTimes(ArrayHandler arrayHandler){
        ArrayList<Integer> numbers = arrayHandler.getNumbers();
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i)*2);
        }
        return numbers;
    }
}
