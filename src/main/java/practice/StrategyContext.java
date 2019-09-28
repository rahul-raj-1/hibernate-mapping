package practice;

import java.util.HashMap;
import java.util.Map;

public class StrategyContext {
	
	
	 double price; // price for some item or air ticket etc.
	    Map<String,Strategy> strategyContext = new HashMap<String,Strategy>();
	    public StrategyContext(double price){
	        this.price= price;
	        strategyContext.put(LimitTenPercent.class.getName(),new LimitTenPercent());
	        strategyContext.put(LimitTwentyPercent.class.getName(),new LimitTenPercent());        
	    }
	    
	    public void applyStrategy(Strategy strategy){
	        /* 
	        Currently applyStrategy has simple implementation. You can use Context for populating some more information,
	        which is required to call a particular operation            
	        */
	        System.out.println("Price before offer :"+price);
	        double finalPrice = price - (price*strategy.getDiscountPercentage());
	        System.out.println("Price after offer:"+finalPrice);
	    }
	    public Strategy getStrategy(int monthNo){
	        /*
	            In absence of this Context method, client has to import relevant concrete Strategies everywhere.
	            Context acts as single point of contact for the Client to get relevant Strategy
	        */
	        if ( monthNo > 10 )  {
	            return strategyContext.get(LimitTwentyPercent.class.getName());
	        }else{
	            return strategyContext.get(LimitTenPercent.class.getName());
	        }

	    }
	

}
