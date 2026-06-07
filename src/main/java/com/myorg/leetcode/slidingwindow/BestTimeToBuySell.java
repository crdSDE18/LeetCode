package com.myorg.leetcode.slidingwindow;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class BestTimeToBuySell {

    public int maxProfit(int[] prices){
        int maxProfit=0;
        int minPrice=prices[0];
        for(int i=1; i<prices.length; i++){
            minPrice = Math.min(minPrice,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]- minPrice);

        }
        return maxProfit;
    }

//    public int maxProfitBrutForce(int[] prices){
//        int maxProfit = 0;
//        for(int i=0; i< prices.length; i++){
//            for(int j=i+1; j<prices.length; j++){
//                int currentProfit = prices[j]-prices[i];
//                if(currentProfit >=0){
//                    log.info("current profit is greater than zero: {}", currentProfit);
//                    maxProfit = Math.max(maxProfit,currentProfit);
//                }
//            }
//        }
//        return maxProfit;
//    }

}
