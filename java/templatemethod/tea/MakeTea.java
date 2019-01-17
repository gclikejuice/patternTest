package templatemethod.tea;

public abstract class MakeTea {
    public void function(){
        boilTea();
        if(needTea()){
            putTea();
        }
        boilWater();
        putCup();
    }


    public void boilWater(){
        System.out.println("必须得烧开水,");
    };

    public abstract void putTea();

    public abstract void boilTea();

    public abstract void putCup();

    public boolean needTea(){
        return true;
    }

}
