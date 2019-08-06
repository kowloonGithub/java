package top.lijiulong.base.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        List<String> poker = new ArrayList<>();

        poker.add("大王");
        poker.add("小王");

        for(String number : numbers){
            for(String color : colors){
                poker.add(color+number);
            }
        }

        Collections.shuffle(poker);

        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < poker.size() ; i++) {
            String p = poker.get(i);
            if(i>=51){
                diPai.add(p);
            }else if(i%3==0){
                player01.add(p);
            }else if(i%3==1){
                player02.add(p);
            }else if(i%3==2){
                player03.add(p);
            }
        }

        System.out.println("刘德华:"+player01);
        System.out.println("周润发:"+player02);
        System.out.println("周星驰:"+player03);
        System.out.println("底牌:"+diPai);

    }
}
