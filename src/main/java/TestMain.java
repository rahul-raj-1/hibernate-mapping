import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.hibernate.validator.internal.util.stereotypes.ThreadSafe;

import practice.Strategy;
import practice.StrategyContext;

/**
 * 
 */

/**
 * @author RAHUL-PC
 *
 */

public class TestMain {
	
	
	
	static void m1()
	{
		
	}

	public static void main(String[] args)  {

		Employee e1 = new Employee(1l, "Rahul");
	// e2 = new Employee(4l, "Messi");
	//	Employee e3 = new Employee(6l, "Sachin");
	//	Employee e4 = new Employee(5l, "Ronaldo");

		List<Employee> l = new ArrayList<>();

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "FOOTBALL");
		map.put(2, "CRICKET");
		map.put(3, "HOCKEY");
		
		ExecutorService service = Executors.newFixedThreadPool(3);

		
		Runnable task = () -> { System.out.println( " This is task " +Thread.currentThread().getName() );
		;};
		
		
	
		 StrategyContext context = new StrategyContext(100);
	        int month = Integer.parseInt("1");
	     //   System.out.println("Month ="+month);
	        Strategy strategy = context.getStrategy(month);
	        context.applyStrategy(strategy);
         
	        
	        BufferedReader r;
	}
}
