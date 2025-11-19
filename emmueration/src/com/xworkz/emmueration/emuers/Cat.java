package com.xworkz.emmueration.emuers;

public enum Cat {
    Persian("lazy"),Siamese("good"),MaineCoon("lazy"),
    Bengal("bad"),Ragdoll("very good"),Abyssinian("normal"),ScottishFold("good");
    private String catBehaviour;
    Cat(String catBehaviour){
        this.catBehaviour=catBehaviour;
    }

    public String getCatBehaviour() {
        return catBehaviour;
    }
}
