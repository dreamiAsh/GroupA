package searchDealerLogic;

import dto.Dealer;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.abs;


public class RetriveDealerInfo {


    public static ArrayList<Dealer> getDealerList() {
        ArrayList<Dealer> dealerObjList = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {

            Random rID = new Random();
            int randomID = abs(rID.nextInt());
            String idString = String.valueOf(randomID);

            dealerObjList.add(new Dealer());
        }

        return dealerObjList;

    }
}

