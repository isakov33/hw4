package com.company;

public class Main {

    public static void main(String[] args) {
	boss boss = new boss();
    boss.setLive(1000);
    boss.setUron(600);
    boss.setBossdefence("cool");
        System.out.println(boss.getLive() + " " + boss.getBossdefence() + " " + boss.getUron());
    }

    public static void createheroes(){
        hero Ironman = new hero() ;
        hero Hulk = new hero();
        hero CaptainAmerica = new hero();
    }
}
