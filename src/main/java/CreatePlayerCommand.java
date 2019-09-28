import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CreatePlayerCommand  {
	
	
	   private static final Map<String, Command> PLAYERS;
	   
	   static {
		      final Map<String, Command> players = new HashMap<>();
		      players.put("TENNIS", new Command() {
		         @Override
		         public String create() {
		            return "tennis player ";
		         }
		      });
		      
		      players.put("FOOTBALL", new Command() {
			         @Override
			         public String create() {
			            return "FOOTBALL player ";
			         }
			      });
		      
		      players.put("Cricket", new Command() {
			         @Override
			         public String create() {
			            return "tennis player ";
			         }
			      });
		      
		      PLAYERS = Collections.unmodifiableMap(players);

		      
	   }
	   
	   
	   public String createPlayer(String playerType) {
		      Command command = PLAYERS.get(playerType);
		      
		 //     PLAYERS.put("TENNIS", "Playing Tennis")

		      if (command == null) {
		         throw new IllegalArgumentException("Invalid player type: "
		            + playerType);
		      }

		      return command.create();
		   }
	   


}
