package ru.lesson.lessons;

/**
 * Created by voice_arniman on 11.10.16.
 */
public class Calculator {
    int result;

    public void add(int ... params){
        for (int param : params){
            this.result += param;
        }
    }

    public void div(int ... args){
        if (args, length > 0) {

        }
        else{

        }
    }

    public int getResult() {
        return result;
    }

    public void cleanResult() {
        this.result = 0;
    }
}
