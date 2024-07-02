package Oops.src.Aman.in.abstraction;

public abstract class  Vehicle implements Transport{
    public int noOfTyres;
    public abstract void makestartsound();
    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    @Override
    public  void noOfCars() {

    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }
}
