abstract class MasterRemote {
    abstract public void changeColor();
    abstract public void changeChannel();
    abstract public void changeVolume();
}
class SamsungTv extends MasterRemote{
    public void changeColor(){
        System.out.println("SamsungTv change color");
    }
    public void changeVolume(){
        System.out.println("SamsungTv change Volume");
    }
    public void changeChannel(){
        System.out.println("SamsungTv change Channel");
    }
}

class OnidaTv extends MasterRemote{
    public void changeColor(){
        System.out.println("OnidaTv change color");
    }
    public void changeVolume(){
        System.out.println("OnidaTv change Volume");
    }
    public void changeChannel(){
        System.out.println("OnidaTv change Channel");
    }
}

class LgTv extends MasterRemote{
    public void changeColor(){
        System.out.println("LgTv change color");
    }
    public void changeVolume(){
        System.out.println("LgTv change Volume");
    }
    public void changeChannel(){
        System.out.println("LgTv change Channel");
    }
}
 