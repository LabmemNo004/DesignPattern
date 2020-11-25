package Servant;
import Chocolate.*;
import Worker.*;
import Builder.*;
import  Mould.*;

public class Serviced implements IServiced{
    @Override
    public Chocolate serviced(Worker worker, Chocolate chocolate,Mould mould){
        Chocolate newChocolate=worker.work(chocolate,mould);
        return newChocolate;
    }
}
