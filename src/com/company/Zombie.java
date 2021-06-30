package com.company;

public class Zombie {
    private  int energy;
    public int strength;
    protected String brainLust;
    protected int compassion;
    protected int  intelligence;


    public Zombie(String brainLust) {
        this.brainLust = brainLust;
        this.compassion = (int) (Math.random() * 100);
        this.intelligence = (int) (Math.random() * 100);
        this.strength = (int) (Math.random() * 100);
    }

    public Zombie() {

    }




    public int  intelligence() {
        return intelligence;
    }


    public String brainLust() {
        return brainLust;
    }

    public int compassion() {
        return compassion;
    }

    public int strength() {
        return strength;
    }



}

