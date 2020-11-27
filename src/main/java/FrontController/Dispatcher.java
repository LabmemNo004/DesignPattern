package FrontController;

import Iterator.Iterator;
import Iterator.ObjectCollection;
import Mould.*;
import AbstractFactory.*;

import java.io.Serializable;

public class Dispatcher implements Serializable {
    private ProduceView produceview;

    private BigChocolateFactory bigMouldFactory=new BigChocolateFactory();
    private   MiddleChocolateFactory middleMouldFactory=new MiddleChocolateFactory();
    private  SmallChocolateFactory smallMouldFactory=new SmallChocolateFactory();
    private  Mould BigHeartBMould=bigMouldFactory.createBlackHeartMould();
    private  Mould BigHeartWMould=bigMouldFactory.createWhiteHeartMould();
    private  Mould BigStarBMould=bigMouldFactory.createBlackStarMould();
    private  Mould BigStarWMould=bigMouldFactory.createWhiteStarMould();
    private  Mould BigSquareBMould=bigMouldFactory.createBlackSquareMould();
    private  Mould BigSquareWMould=bigMouldFactory.createWhiteSquareMould();
    private  Mould BigSphericalBMould=bigMouldFactory.createBlackSphericalMould();
    private  Mould BigSphericalWMould=bigMouldFactory.createWhiteSquareMould();
    private  Mould MiddleHeartBMould=middleMouldFactory.createBlackHeartMould();
    private  Mould MiddleHeartWMould=middleMouldFactory.createWhiteHeartMould();
    private  Mould MiddleStarBMould=middleMouldFactory.createBlackStarMould();
    private  Mould MiddleStarWMould=middleMouldFactory.createWhiteStarMould();
    private   Mould MiddleSquareBMould=middleMouldFactory.createBlackSquareMould();
    private Mould MiddleSquareWMould=middleMouldFactory.createWhiteSquareMould();
    private  Mould MiddleSphericalBMould=middleMouldFactory.createBlackSphericalMould();
    private  Mould MiddleSphericalWMould=middleMouldFactory.createWhiteSquareMould();
    private  Mould SmallHeartBMould=smallMouldFactory.createBlackHeartMould();
    private  Mould SmallHeartWMould=smallMouldFactory.createWhiteHeartMould();
    private   Mould SmallStarBMould=smallMouldFactory.createBlackStarMould();
    private   Mould SmallStarWMould=smallMouldFactory.createWhiteStarMould();
    private  Mould SmallSquareBMould=smallMouldFactory.createBlackSquareMould();
    private  Mould SmallSquareWMould=smallMouldFactory.createWhiteSquareMould();
    private  Mould SmallSphericalBMould=smallMouldFactory.createBlackSphericalMould();
    private  Mould SmallSphericalWMould=smallMouldFactory.createWhiteSquareMould();

    public Dispatcher(){
        produceview=new ProduceView();
    }

    public void dispatch(String request){
        switch(request){
            case "BigHeartBlackChocolate":
                produceview.produceChocolateView(BigHeartBMould);
                break;
            case "BigHeartWhiteChocolate":
                produceview.produceChocolateView(BigHeartWMould);
                break;
            case "BigStarBlackChocolate":
                produceview.produceChocolateView(BigStarBMould);
                break;
            case "BigStarWhiteChocolate":
                produceview.produceChocolateView(BigStarWMould);
                break;
            case "BigSquareBlackChocolate":
                produceview.produceChocolateView(BigSquareBMould);
                break;
            case "BigSquareWhiteChocolate":
                produceview.produceChocolateView(BigSquareWMould);
                break;
            case "BigSphericalBlackChocolate":
                produceview.produceChocolateView(BigSphericalBMould);
                break;
            case "BigSphericalWhiteChocolate":
                produceview.produceChocolateView(BigSphericalWMould);
                break;
            case "MiddleHeartBlackChocolate":
                produceview.produceChocolateView(MiddleHeartBMould);
                break;
            case "MiddleHeartWhiteChocolate":
                produceview.produceChocolateView(MiddleHeartWMould);
                break;
            case "MiddleStarBlackChocolate":
                produceview.produceChocolateView(MiddleStarBMould);
                break;
            case "MiddleStarWhiteChocolate":
                produceview.produceChocolateView(MiddleStarWMould);
                break;
            case "MiddleSquareBlackChocolate":
                produceview.produceChocolateView(MiddleSquareBMould);
                break;
            case "MiddleSquareWhiteChocolate":
                produceview.produceChocolateView(MiddleSquareWMould);
                break;
            case "MiddleSphericalBlackChocolate":
                produceview.produceChocolateView(MiddleSphericalBMould);
                break;
            case "MiddleSphericalWhiteChocolate":
                produceview.produceChocolateView(MiddleSphericalWMould);
                break;
            case "SmallHeartBlackChocolate":
                produceview.produceChocolateView(SmallHeartBMould);
                break;
            case "SmallHeartWhiteChocolate":
                produceview.produceChocolateView(SmallHeartWMould);
                break;
            case "SmallStarBlackChocolate":
                produceview.produceChocolateView(SmallStarBMould);
                break;
            case "SmallStarWhiteChocolate":
                produceview.produceChocolateView(SmallStarWMould);
                break;
            case "SmallSquareBlackChocolate":
                produceview.produceChocolateView(SmallSquareBMould);
                break;
            case "SmallSquareWhiteChocolate":
                produceview.produceChocolateView(SmallSquareWMould);
                break;
            case "SmallSphericalBlackChocolate":
                produceview.produceChocolateView(SmallSphericalBMould);
                break;
            case "SmallSphericalWhiteChocolate":
                produceview.produceChocolateView(SmallSphericalWMould);
                break;




        }
    }
}
