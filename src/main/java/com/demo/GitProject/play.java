package com.demo.GitProject;

class sports{
    void play(){
        System.out.println("play");
    }
}
class Football extends sports{
    void play(){
        System.out.println("Football");
    }
}
class Basketball extends sports{
    void play(){
        System.out.println("Basketball");
    }
}
class Rugby extends sports{
    void play(){
        System.out.println("Rugby");
    }
}
public class play{
    public static void main(String[] args){
        sports football=new Football();
        sports basketball=new Basketball();
        sports rugby=new Rugby();
        football.play();
        basketball.play();
        rugby.play();
    }
}