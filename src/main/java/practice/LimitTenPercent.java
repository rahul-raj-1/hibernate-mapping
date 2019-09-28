package practice;

public class LimitTenPercent implements Strategy{ {

}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return  this.getClass().getName();
}

@Override
public double getDiscountPercentage() {
	// TODO Auto-generated method stub
	return 10d;
}

}
